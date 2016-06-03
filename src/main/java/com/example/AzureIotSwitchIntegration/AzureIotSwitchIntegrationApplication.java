package com.example.AzureIotSwitchIntegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages="com.example.AzureIotSwitchIntegration")
public class AzureIotSwitchIntegrationApplication extends SpringBootServletInitializer{
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AzureIotSwitchIntegrationApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(AzureIotSwitchIntegrationApplication.class, args);
	}
}
