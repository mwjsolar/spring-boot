package com.github.boot;

import com.github.boot.event.ConfigMonitorApplicationListener;
import com.github.boot.event.SpringStartApplicationListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by mwjsolar on 16/8/14.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.addListeners(
                new ConfigMonitorApplicationListener(),
                        new SpringStartApplicationListener());
        springApplication.run(args);
    }
}
