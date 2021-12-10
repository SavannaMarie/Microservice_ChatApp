package com.savchat.savchat;

import com.savchat.savchat.client.DirectoryClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.Scanner;

@SpringBootApplication
@EnableFeignClients
@Slf4j
public class App {

	@Autowired private static DirectoryClient directoryClient;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);

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
