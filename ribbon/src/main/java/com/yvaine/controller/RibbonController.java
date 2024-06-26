package com.yvaine.controller;

import com.yvaine.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @author Yvaine
 * @date 2023/05/18/10:58
 * @description
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return
                restTemplate.getForObject("http://provider/student/findAll", Collection.class);
    }

    @GetMapping("/index")
    public String index() {
        return
                restTemplate.getForObject("http://provider/student/index", String.class);
    }
}
