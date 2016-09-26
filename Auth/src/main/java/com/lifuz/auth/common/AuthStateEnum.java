package com.lifuz.auth.common;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/26 18:07
 */
public enum AuthStateEnum {

    Success(1,"成功");

    private int state;

    private String stateInfo;

    AuthStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static AuthStateEnum stateOf(int index) {

        for (AuthStateEnum stateEnum :values()) {
            if (index == stateEnum.getState()) {
                return stateEnum;
            }
        }

        return null;
    }
}
