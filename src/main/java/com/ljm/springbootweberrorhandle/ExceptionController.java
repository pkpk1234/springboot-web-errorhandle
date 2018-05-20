package com.ljm.springbootweberrorhandle;

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
}
