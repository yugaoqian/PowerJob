package tech.powerjob.shapan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 主类
 *
 * @author tjq
 * @since 2020/4/17
 */
@EnableScheduling
@SpringBootApplication
public class ShaPanApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShaPanApplication.class, args);
    }
}
