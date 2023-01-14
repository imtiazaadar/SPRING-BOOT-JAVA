package com.sim_operator_project.sim_operator_java.information;
import com.sim_operator_project.sim_operator_java.sim_operators.Airtel;
import com.sim_operator_project.sim_operator_java.sim_operators.Banglalink;
import com.sim_operator_project.sim_operator_java.sim_operators.Grameenphone;
import com.sim_operator_project.sim_operator_java.sim_operators.Robi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
/** Author : Imtiaz Adar || Language : Java || Project : Basics Of Spring Boot **/
@Service
public class InformationOfSims {
    @Autowired private Grameenphone grameenphone; @Autowired private Robi robi;
    @Autowired private Banglalink banglalink; @Autowired private Airtel airtel;
    @Bean
    public String grameenphoneInformation(){
        return grameenphone.grameenphoneInformation();
    }
    @Bean
    public String robiInformation(){
        return robi.robiInformation();
    }
    @Bean
    public String banglalinkInformation(){
        return banglalink.banglalinkInformation();
    }
    @Bean
    public String airtelInformation(){
        return airtel.airtelInformation();
    }
}