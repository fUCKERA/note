package com.example.note.system.base.response;

/**
 * @author wangzhe
 * @version 1.0
 * @date 2021/6/8 19:50
 */
public class BaseController {

    /**
     * 正常请求返回数据
     * @param data T
     * @param <T>  <T>
     * @return BaseResponse<T>
     */
    protected <T> BaseResponse<T> ok(T data) {
        return new BaseResponse<>(data);
    }

}