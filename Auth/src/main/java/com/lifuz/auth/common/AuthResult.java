package com.lifuz.auth.common;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * 返回数据封装类
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/26 18:03
 */
@Data
@NoArgsConstructor
public class AuthResult<T> {

    public AuthResult(boolean success,T data) {
        this.success = success;
        this.data = data;
    }

    public AuthResult(boolean success,AuthStateEnum stateEnum) {
        this.success = success;

        error = stateEnum.getStateInfo();
        errorNo = stateEnum.getState();

    }

    private boolean success;

    private T data;

    private String error;

    private Integer errorNo;

}
