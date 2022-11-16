package com.maiqu.evaluatorPlatform.controller;


import com.maiqu.evaluatorPlatform.common.ErrorCode;
import com.maiqu.evaluatorPlatform.exception.BusinessException;
import com.maiqu.evaluatorPlatform.model.entity.TeamMember;
import com.maiqu.evaluatorPlatform.model.vo.TeamMemberVO;
import com.maiqu.evaluatorPlatform.service.TeamMemberService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author ht
 */
@Api(tags = "团队成员模块")
@RestController
@RequestMapping("/api/teamMember")
@CrossOrigin
public class TeamMemberController {
    @Resource
    private TeamMemberService teamMemberService;



    @PostMapping("/add")
    public boolean addTeamMember() {
        TeamMember teamMember = new TeamMember();
        teamMember.setTeamId(2L);
        return teamMemberService.save(teamMember);
    }

    @PostMapping("/list")
    public boolean list(HttpServletRequest request) {
        if(request == null){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String teamId = "";
        List<TeamMemberVO> membersByTeamId = teamMemberService.getMembersByTeamId();
        return false;
    }


}
