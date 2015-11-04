package com.ericsson.csp.tsc.api.exceptions;

import com.alibaba.fastjson.JSONObject;
import com.ericsson.csp.tsc.api.pojo.RespMessage;

public class ServiceException extends Exception implements java.io.Serializable {
    private static final long serialVersionUID = 7969725823525818557L;

    // http errorCode
    private int               errorCode;

    private RespMessage       respMessage;

    public ServiceException() {
        super();
    }

    public ServiceException(int errorCode) {
        this.errorCode = errorCode;
    }

    public ServiceException(int errorCode, RespMessage respMessage) {
        this.errorCode = errorCode;
        this.respMessage = respMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public RespMessage getRespMessage() {
        return respMessage;
    }

    public void setRespMessage(RespMessage respMessage) {
        this.respMessage = respMessage;
    }

    public String toString() {
        String jsonString = JSONObject.toJSONString(this.getRespMessage());

        return jsonString;
    }
}
