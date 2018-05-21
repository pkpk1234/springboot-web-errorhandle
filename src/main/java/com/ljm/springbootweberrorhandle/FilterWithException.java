package com.ljm.springbootweberrorhandle;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-05-22
 */
@Component
public class FilterWithException implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (((HttpServletRequest) request).getRequestURI().indexOf("filterError") != -1) {
            throw new IllegalAccessError("IllegalAccessError in Filter");
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
