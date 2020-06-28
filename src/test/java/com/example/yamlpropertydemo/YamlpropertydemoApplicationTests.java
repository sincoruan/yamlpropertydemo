package com.example.yamlpropertydemo;

import com.example.yamlpropertydemo.domain.Person;
import com.example.yamlpropertydemo.domain.RuleCollection;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class YamlpropertydemoApplicationTests {
    @Autowired
    Person person;

    @Autowired
    public RuleCollection rules;

    @Test
    void contextLoads() {

        System.out.println(rules);
        System.out.println(rules);
        System.out.println("===================");

    }

}
