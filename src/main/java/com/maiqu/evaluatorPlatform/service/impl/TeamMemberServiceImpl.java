package com.maiqu.evaluatorPlatform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.maiqu.evaluatorPlatform.mapper.EvaluatorMapper;
import com.maiqu.evaluatorPlatform.mapper.TeamMemberMapper;
import com.maiqu.evaluatorPlatform.model.entity.Evaluator;
import com.maiqu.evaluatorPlatform.model.entity.TeamMember;
import com.maiqu.evaluatorPlatform.model.vo.TeamMemberVO;
import com.maiqu.evaluatorPlatform.service.EvaluatorService;
import com.maiqu.evaluatorPlatform.service.TeamMemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author ht
 */

@Service
@Slf4j
public class TeamMemberServiceImpl extends ServiceImpl<TeamMemberMapper, TeamMember> implements TeamMemberService {

    @Override
    public List<TeamMemberVO> getMembersByTeamId() {
        return null;
    }
}
