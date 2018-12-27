package com.example.demo11;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class java {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
