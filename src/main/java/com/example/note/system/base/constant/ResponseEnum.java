package com.example.note.system.base.constant;

public enum ResponseEnum {
    SUCCESS("1", "请求成功"),
    FAIL("0", "系统内部异常"),
    SYSTEM_SERVICE_ERROR("-2", "系统服务错误，请稍后再试!"),
    STATUS_CODE_102("102", "请求参数不正确"),
    STATUS_CODE_200("200", "正确"),
    STATUS_CODE_401("401", "未授权"),
    STATUS_CODE_403("403", "禁止访问"),
    STATUS_CODE_404("404", "目标未找到"),
    STATUS_CODE_405("405", "请求类型错误"),
    STATUS_CODE_500("500", "系统异常"),
    NO_DATA("1001", "没有查询到数据"),
    PARAMETER_NONEMPTY("2001", "参数不能为空"),
    TYPE_ERROR("3001", "类型错误"),
    UPDATE_DATA_FAILURE("3002", "更新数据失败"),
    REPEAT_SUBMIT("50001", "业务处理中,请稍后");

    private final String code;
    private final String msg;

    private ResponseEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}
