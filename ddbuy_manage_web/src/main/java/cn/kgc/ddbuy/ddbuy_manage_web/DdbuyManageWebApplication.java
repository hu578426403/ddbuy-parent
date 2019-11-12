package cn.kgc.ddbuy.ddbuy_manage_web;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration //开启dubbo
public class DdbuyManageWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DdbuyManageWebApplication.class, args);
    }

}
