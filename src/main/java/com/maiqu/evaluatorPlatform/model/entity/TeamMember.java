package com.maiqu.evaluatorPlatform.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.maiqu.evaluatorPlatform.model.common.Shared;
import com.maiqu.evaluatorPlatform.model.common.User;
import lombok.Data;

import java.util.concurrent.locks.Lock;

/**
 * @author ht
 */
@Data
@TableName(value ="team_member")
public class TeamMember extends User {

    private Long teamId;
}
