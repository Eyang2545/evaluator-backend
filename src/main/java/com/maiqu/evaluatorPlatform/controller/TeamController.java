package com.maiqu.evaluatorPlatform.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.maiqu.evaluatorPlatform.common.BaseResponse;
import com.maiqu.evaluatorPlatform.common.ErrorCode;
import com.maiqu.evaluatorPlatform.common.ResultUtils;
import com.maiqu.evaluatorPlatform.exception.BusinessException;
import com.maiqu.evaluatorPlatform.model.entity.Evaluator;
import com.maiqu.evaluatorPlatform.model.entity.Team;
import com.maiqu.evaluatorPlatform.model.request.TeamAddRequest;
import com.maiqu.evaluatorPlatform.model.update.TeamUpdateRequest;
import com.maiqu.evaluatorPlatform.model.vo.TeamVO;
import com.maiqu.evaluatorPlatform.service.EvaluatorService;
import com.maiqu.evaluatorPlatform.service.TeamService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @author ht
 */

@Api(tags = "团队模块")
@RestController
@RequestMapping("/api/team")
@CrossOrigin
public class TeamController {

    @Resource
    private TeamService teamService;

    @PostMapping("/add")
    public BaseResponse<Long> addTeam(@RequestBody TeamAddRequest teamAddRequest) {
        if(teamAddRequest == null){
            throw new BusinessException(ErrorCode.PARAMS_NULL_ERROR);
        }
        Long evaluatorId = teamAddRequest.getEvaluatorId();
        if(evaluatorId == null || evaluatorId<=0){
            throw new BusinessException(ErrorCode.PARAMS_ERROR,"测评师不存在");
        }

        Long teamId = teamService.addTeam(teamAddRequest);
        return ResultUtils.success(teamId);
    }

    @PostMapping("/update")
    public BaseResponse<Boolean> updateTeam(Long evaluatorId, TeamUpdateRequest teamUpdateRequest) {
        if(evaluatorId == null || evaluatorId<=0){
            throw new BusinessException(ErrorCode.PARAMS_ERROR,"测评师不存在");
        }
        if(teamUpdateRequest == null){
            throw new BusinessException(ErrorCode.PARAMS_NULL_ERROR);
        }
        boolean isSuccess = teamService.updateTeam(teamUpdateRequest);

        return ResultUtils.success(isSuccess);
    }

    @GetMapping("/list")
    public BaseResponse<List<TeamVO>> listTeam(Long evaluatorId) {
        if(evaluatorId == null || evaluatorId<=0){
            throw new BusinessException(ErrorCode.PARAMS_NULL_ERROR);
        }
        QueryWrapper<Team> teamQueryWrapper = new QueryWrapper<>();
        teamQueryWrapper.eq("evaluatorId",evaluatorId);
        List<Team> teamList = teamService.list(teamQueryWrapper);
        List<TeamVO> teamVOS = teamList.stream().map(Team::toVo).collect(Collectors.toList());
        return ResultUtils.success(teamVOS);
    }



}
