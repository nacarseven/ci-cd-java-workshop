package com.testService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * This is the TestController class.
 */
@RestController
@CrossOrigin
public class TestController {

    /***
     * This is the called service.
     */
    @GetMapping("/home")
    public String homeRequest() {
        return "Hello World!";
    }
}
