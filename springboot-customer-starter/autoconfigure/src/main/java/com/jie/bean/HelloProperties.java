package com.jie.bean;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "com.jie.hello")
public class HelloProperties {
    private String prefix;
    private String suffix;
}
