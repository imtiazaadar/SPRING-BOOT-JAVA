package com.sim_operator_project.sim_operator_java.sim_operators;
import com.sim_operator_project.sim_operator_java.sim_control.SimControl;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
/** Author : Imtiaz Adar || Language : Java || Project : Basics Of Spring Boot **/
@Component
public class Airtel {
    SimControl simControl;
    Airtel(SimControl simControl){
        this.simControl = new SimControl("Airtel",
                "India", "Red");
    }
    @Bean
    public String airtelInformation(){
        return "Brand: " + simControl.getSim_name().toUpperCase() + " Head Quarter: " +
                simControl.getSim_headquarter().toUpperCase() + " Sim Color: " +
                simControl.getSim_color().toUpperCase() + " | ";
    }
}
