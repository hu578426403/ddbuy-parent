package cn.kgc.ddbuy.ddbuy_comment_service;

import cn.kgc.ddbuy.service.DistrictService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DdbuyCommentServiceApplicationTests {
    @Autowired
    private DistrictService districtService;
    @Test
    void contextLoads() {
        System.out.println(districtService.getAllDistrict());
    }

}
