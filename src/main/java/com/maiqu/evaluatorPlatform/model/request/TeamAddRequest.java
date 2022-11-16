package com.maiqu.evaluatorPlatform.model.request;

import com.maiqu.evaluatorPlatform.model.entity.Team;
import lombok.Data;

@Data
public class TeamAddRequest extends Team {
    private Long evaluatorId;
}
