package com.iapi.drools.common.bean;

/**
 * Enum 响应类型
 * @author amine

 */
public enum ExceptionType {
    /**
     * 成功
     */
    SUCCESS(200, "success",2),
    /**
     * 系统错误
     */
    SYSTEM_ERROR(300001, "系统错误", 5),
    /**
     * 规则为空
     */
    RULE_IS_NULL(300002, "系统错误", 2),
    /**
     * 规则错误
     */
    RULE_IS_ERROR(300003, "规则语句错误", 2);

    private int code;
    private String message;
    private int level;

    ExceptionType(int code, String message, int level) {
        this.code = code;
        this.message = message;
        this.level = level;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public int getLevel() {
        return level;
    }
}


