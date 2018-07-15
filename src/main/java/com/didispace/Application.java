package com.didispace;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("这是新分支提交");
		new SpringApplicationBuilder(Application.class).web(true).run(args);
	}

}
