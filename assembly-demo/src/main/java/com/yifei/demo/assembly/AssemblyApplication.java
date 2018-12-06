package com.yifei.demo.assembly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author yifei
 * @date 2018/12/7
 */
@SpringBootApplication
public class AssemblyApplication {

    private static final Logger logger = LoggerFactory.getLogger(AssemblyApplication.class);

    public static void main(String[] args) {
        // 启动服务
        ConfigurableApplicationContext context = SpringApplication.run(AssemblyApplication.class, args);
        Environment env = context.getBean(Environment.class);

        logger.info("【{}】服务启动成功！tomcat的端口：【{}】", env.getProperty("spring.application.name"), env.getProperty("server.port"));
    }
}
