package com.savchat.savchat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Properties {

    @Value("${server.port}")
    private int port;

    @Value("${chat.username}")
    private String username;

//    @Value("${chat.url}")
//    private String chatUrl;

}
