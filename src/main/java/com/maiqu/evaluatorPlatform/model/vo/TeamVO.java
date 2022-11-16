package com.maiqu.evaluatorPlatform.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.maiqu.evaluatorPlatform.model.entity.Team;
import lombok.Data;

import java.util.Date;

/**
 * @author ht
 */
@Data
public class TeamVO {
    /**
     * 队伍id
     */
    protected Long teamId;

    /**
     * 队伍数量
     */
    protected Integer teamNumber;

    /**
     * 描述
     */
    protected String description;

    /**
     * 队伍周期
     */
    protected Integer teamCycle;


    /**
     * 终止时间
     */

    @JsonFormat(pattern="yyyy年MM月dd日")
    protected Date endTime;

    @JsonFormat(pattern="yyyy年MM月dd日")
    protected Date startTime;

    /**
     * 队伍名称
     */
    protected String teamName;
}
