package my_task.one.controller;

import my_task.one.bean.Panda;
import my_task.one.service.PandaTestingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class Starter {

    @Autowired
    private PandaTestingService pandaService;

    @RequestMapping("/hello")
    public String checkApp(){
        return "Hello Dany!!!";
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;



    @RequestMapping("/test")
    public List<Map<String, Object>> getEmployees() {
        String sql = "SELECT * FROM employees";
        return jdbcTemplate.queryForList(sql);
    }

    @RequestMapping("/add-panda")
    public String addPanda(){
        System.out.println("Controller +");
        Panda panda = new Panda(1, "bear", 10);
        pandaService.addPanda(panda);
        return "i'm happy";
    }



}
