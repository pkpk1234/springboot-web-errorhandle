package com.ljm.springbootweberrorhandle;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-05-22
 */
@Component
public class InterceptorWithExceptions extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getRequestURI().indexOf("interceptError") != -1) {
            throw new IllegalAccessError("IllegalAccessError in Interceptor");
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if (request.getRequestURI().indexOf("interceptPostError") != -1) {
            throw new IllegalAccessError("IllegalAccessError in Interceptor postHandle");
        }
    }
}
