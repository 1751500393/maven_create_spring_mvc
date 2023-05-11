package com.cen.test.service.ex;

public class UserPointFailToAddException extends ServiceException {
    public UserPointFailToAddException() {
    }

    public UserPointFailToAddException(String message) {
        super(message);
    }

    public UserPointFailToAddException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserPointFailToAddException(Throwable cause) {
        super(cause);
    }

    public UserPointFailToAddException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
