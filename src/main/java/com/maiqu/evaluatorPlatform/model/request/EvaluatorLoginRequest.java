package com.maiqu.evaluatorPlatform.model.request;

import lombok.Data;

/**
 * @author ht
 */
@Data
public class EvaluatorLoginRequest {
    private String userAccount;

    private String userPassword;
}
