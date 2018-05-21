package com.ljm.springbootweberrorhandle;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-05-22
 */

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class Http401Exception extends Exception {
    public Http401Exception(String s) {
        super(s);
    }
}
