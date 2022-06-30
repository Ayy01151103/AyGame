package com.yxm.vo.resp;

import com.yxm.vo.ResponseCode;


public class BaseResp {
    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(ResponseCode code) {
        this.code = code.getCode();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
