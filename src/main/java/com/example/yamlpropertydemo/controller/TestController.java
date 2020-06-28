package com.example.yamlpropertydemo.controller;

import com.example.yamlpropertydemo.domain.DmnRule;
import com.example.yamlpropertydemo.domain.Person;
import com.example.yamlpropertydemo.domain.RuleCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {
    @Autowired
    Person person;
    @RequestMapping("/person")
    public Person person(){
        return person;
    }
    @Autowired
    RuleCollection rules;
    @RequestMapping("/rules")
    public RuleCollection rules(){
        return rules;
    }

    @Value("#{'${names}'.split(';')}")
    List<String> names;

    @RequestMapping("/names")
    public List<String> valueListTest(){
        return names;
    }


}
