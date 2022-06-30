package com.yxm.handler;

import com.yxm.exception.LoginException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 异常解决类
 */
public class UserExceptionHandler {
    @ExceptionHandler(LoginException.class)
    public String handlerException(LoginException e, Model model) {
        model.addAttribute("message", e);
        return "user/login";
    }
}
