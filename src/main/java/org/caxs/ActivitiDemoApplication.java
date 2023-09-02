package org.caxs;

import org.activiti.core.common.spring.identity.config.ActivitiSpringIdentityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {ActivitiSpringIdentityAutoConfiguration.class})
public class ActivitiDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ActivitiDemoApplication.class,args);
    }
}
