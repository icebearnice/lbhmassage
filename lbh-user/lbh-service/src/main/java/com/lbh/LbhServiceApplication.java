package com.lbh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.lbh"})
@EnableDiscoveryClient
@MapperScan("com.lbh.massage.user.mapper")
public class LbhServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LbhServiceApplication.class, args);
    }

}
