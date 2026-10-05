package org.example.appointmentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

@SpringBootApplication
public class AppointmentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(
                AppointmentServiceApplication.class,
                args
        );
    }

    @Bean
    public RestClient restClient() {
        return RestClient.builder().build();
    }
}
