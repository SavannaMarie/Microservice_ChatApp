package com.savchat.savchat;

import com.savchat.savchat.client.DirectoryClient;
import com.savchat.savchat.dto.DirectoryDTO;
import com.savchat.savchat.dto.MessageDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Scanner;

@Component
@Slf4j
public class Bootstrap implements Runnable {

    @Autowired private Properties properties;
    @Autowired private DirectoryClient directoryClient;
    @Autowired private RestTemplate restTemplate;

    @PostConstruct
    public void postConstruct() {
      DirectoryDTO directoryDTO = new DirectoryDTO(properties.getUsername(), properties.getPort());

      directoryClient.addEntry(directoryDTO);

      new Thread(this).start();
    }

    @Override
    public void run() {

        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String cmd = in.nextLine();
            switch (cmd.charAt(0)) {
                case '!':
                    String[] parts = cmd.substring(1).split(":"); // !Jeff:Hello
                    log.info("name = {}, message = {}", parts[0], parts[1]);
//					int port = directoryClient.getEntry(parts[0]);
            }
        }
    }
}
