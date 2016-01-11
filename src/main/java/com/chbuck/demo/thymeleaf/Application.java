package com.chbuck.demo.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.system.ApplicationPidFileWriter;
import org.springframework.boot.actuate.system.EmbeddedServerPortFileWriter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @SpringBootApplication contains
 * - @EnableAutoConfiguration
 * - @ComponentScan
 *   Will load all configurations inside this package
 */
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

    public static void main(String[] args) {
        //SpringApplication.run(Application.class);
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.addListeners( new ApplicationPidFileWriter() ); // write process id to application.pid
        springApplication.addListeners( new EmbeddedServerPortFileWriter() ); // write embedded ports to file
        springApplication.run(args);
    }
}
