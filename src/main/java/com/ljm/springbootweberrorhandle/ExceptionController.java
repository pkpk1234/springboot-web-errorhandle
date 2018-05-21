package com.ljm.springbootweberrorhandle;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-05-20
 */

@RestController
public class ExceptionController {
    @RequestMapping("/hello")
    public String hello() {
        throw new RuntimeException("This is Hello Exception");
    }

    @RequestMapping(value = "/401", produces = {MediaType.TEXT_HTML_VALUE})
    public String http401() throws Http401Exception {
        throw new Http401Exception("This HTTP 401 Exception");
    }

    @RequestMapping(value = "/401", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public String http401Json() throws Http401Exception {
        throw new Http401Exception("This HTTP 401 Exception");
    }
}
