package com.sim_operator_project.sim_operator_java.sim_control;
import com.sim_operator_project.sim_operator_java.Sim;
import com.sim_operator_project.sim_operator_java.information.InformationOfSims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
/** Author : Imtiaz Adar || Language : Java || Project : Basics Of Spring Boot **/
@RestController @Controller
public class SimControl implements Sim {
    @Autowired
    InformationOfSims informationOfSims;
    private String sim_name; private String sim_headquarter; private String sim_color;
    public SimControl(){this.sim_name = ""; this.sim_headquarter = ""; this.sim_color = "";}
    public SimControl(String sim_name, String sim_headquarter, String sim_color){
        this.sim_name = sim_name;
        this.sim_headquarter = sim_headquarter;
        this.sim_color = sim_color;
    }
    public String getSim_name(){return sim_name;}
    public String getSim_headquarter(){return sim_headquarter;}
    public String getSim_color(){return sim_color;}
    @Override
    public String SimControl_(){
        return SimContoller();
    }
    @RequestMapping(path = "api/versions/simcontrol")
    public String SimContoller() {
        List<String> informationList = Arrays.asList(informationOfSims.grameenphoneInformation()
        , informationOfSims.robiInformation(), informationOfSims.banglalinkInformation(),
                informationOfSims.airtelInformation());
        String s = String.join("", informationList);
        String sec = s.replace("\\|", "\n");
        String finalres = String.join("\n", sec);
        return finalres;
    }
}