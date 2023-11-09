package org.tinkoff;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class ApplicationRunner {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}