package com.example.yamlpropertydemo.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 要点
 * 1.add spring-boot-configuration-processor dependency
 * 2.添加@ConfigurationProperties 注解
 *      ConfigurationProperties：告诉SpringBoot将本类中的所有属性 * 和配置文件中相关的配置进行绑定；
 *      prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
 *      只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能；
 * 3.一定要添加get/set方法，否则无法注入
 * 4.@Component
 */
@Component
@ConfigurationProperties(prefix="rules")
public class RuleCollection {
    Map<String,DmnRule> ruleMap;
    List<String> list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, DmnRule> getRuleMap() {
        return ruleMap;
    }

    public void setRuleMap(Map<String, DmnRule> ruleMap) {
        this.ruleMap = ruleMap;
    }
}
