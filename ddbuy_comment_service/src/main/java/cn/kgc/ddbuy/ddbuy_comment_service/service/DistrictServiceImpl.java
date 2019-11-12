package cn.kgc.ddbuy.ddbuy_comment_service.service;

import cn.kgc.ddbuy.entity.District;
import cn.kgc.ddbuy.entity.DistrictExample;
import cn.kgc.ddbuy.mapper.DistrictMapper;
import cn.kgc.ddbuy.service.DistrictService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service(interfaceClass = DistrictService.class)
@Component
public class DistrictServiceImpl implements DistrictService {
    @Autowired
    private DistrictMapper districtMapper;
    @Override
    public List<District> getAllDistrict() {
        return districtMapper.selectByExample(new DistrictExample());
    }
}
