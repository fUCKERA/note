package com.example.note.system.base.response;

import com.example.note.system.base.constant.ResponseEnum;
import lombok.Data;

import java.io.Serializable;
@Data
public class BaseResponse<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private String code;
    private boolean success;
    transient String status;
    String message;
    T data;

    public BaseResponse(T data) {
        this(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMsg(), data);
    }


    public BaseResponse(String status, String message, T data) {
        this.status = ResponseEnum.SUCCESS.getCode();
        this.message = ResponseEnum.SUCCESS.getMsg();
        this.setStatus(status);
        this.message = message;
        this.data = data;
        this.setSuccess(ResponseEnum.SUCCESS.getCode().equals(status));
    }

    /*public BaseResponse() {
        this.status = ResponseEnum.SUCCESS.getCode();
        this.message = ResponseEnum.SUCCESS.getMsg();
    }



    public BaseResponse(String status, String message) {
        this(status, message, (Object)null);
    }



    public BaseResponse(String code, Boolean success, String message, T data) {
        this.status = ResponseEnum.SUCCESS.getCode();
        this.message = ResponseEnum.SUCCESS.getMsg();
        this.message = message;
        this.data = data;
        this.setCode(code);
        this.setSuccess(success);
    }

    public void setResponseStatus(ResponseEnum respEnum) {
        this.setStatus(respEnum.getCode());
        this.setSuccess(ResponseEnum.SUCCESS.getCode().equals(this.status));
        this.message = respEnum.getMsg();
    }

    public void setStatus(String status) {
        this.status = status;
        this.code = status;
    }




    public BaseResponse<T> setCode(final String code) {
        this.code = code;
        return this;
    }

    public BaseResponse<T> setSuccess(final boolean success) {
        this.success = success;
        return this;
    }

    public BaseResponse<T> setMessage(final String message) {
        this.message = message;
        return this;
    }

    public BaseResponse<T> setData(final T data) {
        this.data = data;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof BaseResponse)) {
            return false;
        } else {
            BaseResponse<?> other = (BaseResponse)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$code = this.getCode();
                Object other$code = other.getCode();
                if (this$code == null) {
                    if (other$code != null) {
                        return false;
                    }
                } else if (!this$code.equals(other$code)) {
                    return false;
                }

                if (this.isSuccess() != other.isSuccess()) {
                    return false;
                } else {
                    Object this$message = this.getMessage();
                    Object other$message = other.getMessage();
                    if (this$message == null) {
                        if (other$message != null) {
                            return false;
                        }
                    } else if (!this$message.equals(other$message)) {
                        return false;
                    }

                    Object this$data = this.getData();
                    Object other$data = other.getData();
                    if (this$data == null) {
                        if (other$data != null) {
                            return false;
                        }
                    } else if (!this$data.equals(other$data)) {
                        return false;
                    }

                    return true;
                }
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BaseResponse;
    }

    @Override
    public int hashCode() {
        int PRIME = true;
        int result = 1;
        Object $code = this.getCode();
        int result = result * 59 + ($code == null ? 43 : $code.hashCode());
        result = result * 59 + (this.isSuccess() ? 79 : 97);
        Object $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        Object $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    public String toString() {
        return "BaseResponse(code=" + this.getCode() + ", success=" + this.isSuccess() + ", status=" + this.getStatus() + ", message=" + this.getMessage() + ", data=" + this.getData() + ")";
    }

    public BaseResponse(final String code, final boolean success, final String status, final String message, final T data) {
        this.status = ResponseEnum.SUCCESS.getCode();
        this.message = ResponseEnum.SUCCESS.getMsg();
        this.code = code;
        this.success = success;
        this.status = status;
        this.message = message;
        this.data = data;
    }*/
}
