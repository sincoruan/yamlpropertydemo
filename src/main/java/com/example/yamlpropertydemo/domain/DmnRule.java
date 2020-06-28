package com.example.yamlpropertydemo.domain;

import org.springframework.stereotype.Component;

@Component
public class DmnRule {
    String namespace;

    public DmnRule() {
    }

    public DmnRule(String namespace, String modelName) {
        this.namespace = namespace;
        this.modelName = modelName;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String modelName;
}
