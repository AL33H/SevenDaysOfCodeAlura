package br.com.sevendaysofcodealura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SevenDaysOfCodeAluraApplication {

    public static void main(String[] args) {
        SpringApplication.run(SevenDaysOfCodeAluraApplication.class, args);
    }

}
