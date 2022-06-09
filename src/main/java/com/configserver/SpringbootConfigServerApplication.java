package com.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Config Server
 
 * @author dsilvatr 
 
 * @version 1.0, 2022/05/30
 **/

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class SpringbootConfigServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootConfigServerApplication.class, args);
  }

}
