package com.savchat.savchat;

import com.savchat.savchat.dto.MessageDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/chat/v1")
@Slf4j
public class Controller {

    @Autowired private Date startDate;

    @GetMapping("/ping")
    public Date ping() {
        return startDate;
    }

    @PostMapping("/chat")
    public void chat(@RequestBody final MessageDTO pMessageDTO) {
        System.out.println(pMessageDTO.getUsername() + " said: " + pMessageDTO.getMessage());
    }
}