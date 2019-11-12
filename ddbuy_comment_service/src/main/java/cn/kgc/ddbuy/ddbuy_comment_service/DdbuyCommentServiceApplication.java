package cn.kgc.ddbuy.ddbuy_comment_service;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration //开启dubbo
@MapperScan(value = "cn.kgc.ddbuy.mapper") //扫描mapper接口路径
public class DdbuyCommentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DdbuyCommentServiceApplication.class, args);
    }

}
