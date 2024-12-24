package com.example.urlshortener.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.ModelMap;

@Configuration
public class CommonConfig {

    @Bean
    ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
