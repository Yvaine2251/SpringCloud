package com.yvaine.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yvaine
 * @date 2023/05/18/15:16
 * @description
 */
@RestController
@RequestMapping("/native")
public class NativeConfigController {
    @Value("${server.port}")
    private String port;
    @Value("${foo}")
    private String foo;

    @GetMapping("/index")
    public String index() {
        return this.port + "-" + this.foo;
    }
}
