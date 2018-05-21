package com.ljm.springbootweberrorhandle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-05-20
 */

@Controller
public class ExceptionController {

    @RequestMapping(value = "/voidaccess")
    public void accessError() {
        throw new IllegalAccessError("Illegal Access in RestController");
    }

}
