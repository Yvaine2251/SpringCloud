package com.yvaine.feign;

import com.yvaine.entity.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author Yvaine
 * @date 2023/05/18/11:53
 * @description
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }
    @Override
    public String index() {
        return "服务器维护中......";
    }
}
