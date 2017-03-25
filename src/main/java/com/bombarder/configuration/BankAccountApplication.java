package com.bombarder.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.bombarder")
@EnableJpaRepositories(basePackages = "com.bombarder.repository")
@EntityScan(basePackages = "com.bombarder.entity")
public class BankAccountApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BankAccountApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BankAccountApplication.class, args);
    }
}
