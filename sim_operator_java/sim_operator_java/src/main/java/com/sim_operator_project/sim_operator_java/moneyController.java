package com.sim_operator_project.sim_operator_java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

@RestController
public class moneyController {
    @Autowired
    private Business business;
    public moneyController(Business business){
        this.business = business;
    }
    @GetMapping("/moneyy")
    public List<Integer> getMoney(){
        return business.getMoney();
    }
}
@Component
class Business{
    @Autowired
    private MoneyList moneyList;
    public Business(MoneyList moneyList){
        this.moneyList = moneyList;
    }
    @Bean
    public List<Integer> getMoney(){
        List<Integer> newitems = moneyList.moneyList_();
        return newitems;
    }
}
@Component
class MoneyList{
    @Bean
    public List<Integer> moneyList_(){
        return Arrays.asList(20, 33 ,55, 10);
    }
}
