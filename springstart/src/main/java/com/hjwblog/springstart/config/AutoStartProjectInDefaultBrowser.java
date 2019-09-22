package com.hjwblog.springstart.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringBootConfiguration;

/**
 * SpringBoot 项目启动之后自动启动默认浏览器
 */

@SpringBootConfiguration
public class AutoStartProjectInDefaultBrowser implements CommandLineRunner {
    @Value("${server.port}")
    private String port;


    @Override
    public void run(String... args) throws Exception {
        String path = "/user/all";
        try {
            Runtime.getRuntime().exec("cmd /c start http://localhost:" + port + path);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
