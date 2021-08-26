package com.healthcare.thymeleafdemo.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class CatchExceptions {

    @ExceptionHandler
    @ResponseBody
    public MyResponseErrorMessage handleMethodNotAllowed(HttpServletRequest req, Exception ex) {
        return new MyResponseErrorMessage(req.getMethod(), ex.getMessage());
    }

}
