package com.yxm.exception;

/**
 * json化时出现的异常
 */
public class JsonFormatException extends RuntimeException {
    public JsonFormatException() {
        super();
    }

    public JsonFormatException(String message) {
        super(message);
    }

    public JsonFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public JsonFormatException(Throwable cause) {
        super(cause);
    }

    protected JsonFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
