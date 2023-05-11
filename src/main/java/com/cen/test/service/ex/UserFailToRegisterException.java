package com.cen.test.service.ex;

public class UserFailToRegisterException extends ServiceException {
    public UserFailToRegisterException() {
    }

    public UserFailToRegisterException(String message) {
        super(message);
    }

    public UserFailToRegisterException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserFailToRegisterException(Throwable cause) {
        super(cause);
    }

    public UserFailToRegisterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
