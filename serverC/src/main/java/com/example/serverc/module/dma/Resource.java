package com.example.serverc.module.dma;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@Configurable
@ConfigurationProperties(prefix = "com.example.opensource")
@PropertySource(value = "classpath:resource.properties")
public class Resource {
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public java.lang.String getName() {
        return name;
    }
}

