package com.lifuz.auth.quartz;

import org.junit.Test;
import org.quartz.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/28 10:49
 */
public class QuartzJobFactoryImplTest {

    @Test
    public void quartz() throws SchedulerException {

        //schedulerFactoryBean 由spring创建注入
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/spring-web.xml");
        System.out.println(ctx);
        Scheduler scheduler = (Scheduler)ctx.getBean("schedulerFactoryBean");

        System.out.println(scheduler);
        //这里获取任务信息数据
        List<ScheduleJob> jobList = new ArrayList<ScheduleJob>();

        for (int i = 0; i < 3; i++) {
            ScheduleJob job = new ScheduleJob();
            job.setJobId("10001" + i);
            job.setJobName("JobName_" + i);
            job.setJobGroup("dataWork");
            job.setJobStatus("1");
            job.setCronExpression("0/5 * * * * ?");
            job.setDesc("数据导入任务");
            jobList.add(job);
        }

        for (ScheduleJob job : jobList) {

            TriggerKey triggerKey = TriggerKey.triggerKey(job.getJobName(), job.getJobGroup());

            //获取trigger，即在spring配置文件中定义的 bean id="myTrigger"
            CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);

            //不存在，创建一个
            if (null == trigger) {
                JobDetail jobDetail = JobBuilder.newJob(QuartzJobFactoryImpl.class)
                        .withIdentity(job.getJobName(), job.getJobGroup()).build();
                jobDetail.getJobDataMap().put("scheduleJob", job);

                //表达式调度构建器
                CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(job
                        .getCronExpression());

                //按新的cronExpression表达式构建一个新的trigger
                trigger = TriggerBuilder.newTrigger().withIdentity(job.getJobName(), job.getJobGroup()).withSchedule(scheduleBuilder).build();
                scheduler.scheduleJob(jobDetail, trigger);
            } else {
                // Trigger已存在，那么更新相应的定时设置
                //表达式调度构建器
                CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(job
                        .getCronExpression());

                //按新的cronExpression表达式重新构建trigger
                trigger = trigger.getTriggerBuilder().withIdentity(triggerKey)
                        .withSchedule(scheduleBuilder).build();

                //按新的trigger重新设置job执行
                scheduler.rescheduleJob(triggerKey, trigger);
            }
        }


    }

}