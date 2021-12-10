package com.savchat.savchat;

import com.savchat.savchat.dto.MessageDTO;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Configuration
@NoArgsConstructor
public class Config {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public MessageDTO messageDTO() {
        return new MessageDTO();
    }

    @Bean
    public Date startDate() {
        return new Date();
    }
}
