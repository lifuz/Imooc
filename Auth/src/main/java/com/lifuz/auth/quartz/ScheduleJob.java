package com.lifuz.auth.quartz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/28 10:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleJob {

    /** 任务id **/
    private String jobId;

    /** 任务名称 **/
    private String jobName;

    /** 任务分组 **/
    private String jobGroup;

    /** 任务状态 0禁用 1启用 2删除**/
    private String jobStatus;

    /** 任务运行时间表达式 **/
    private String cronExpression;

    /** 任务描述 **/
    private String desc;

}
