package com.sim_operator_project.sim_operator_java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control {
    @GetMapping("/money")
    public long getMoney(){
        return 100000;
    }
}
