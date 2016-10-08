package com.lifuz.auth.quartz;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/28 10:35
 */
@DisallowConcurrentExecution
public class QuartzJobFactoryImpl implements Job {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void execute(JobExecutionContext context) throws JobExecutionException {

        logger.error("任务成功运行");

        ScheduleJob scheduleJob = (ScheduleJob)context.getMergedJobDataMap().get("scheduleJob");
        System.out.println("任务名称 = [" + scheduleJob.getJobName() + "]");


    }

}
