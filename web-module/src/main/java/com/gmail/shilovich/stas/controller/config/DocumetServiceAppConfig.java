package com.gmail.shilovich.stas.controller.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {
        "com.gmail.shilovich.stas.controller",
        "com.gmail.shilovich.stas.service",
        "com.gmail.shilovich.stas.repository"})
@PropertySource("classpath:jdbc.properties")
public class DocumetServiceAppConfig {
}
