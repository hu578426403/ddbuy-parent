package cn.kgc.ddbuy.ddbuy_manage_web.controller;

import cn.kgc.ddbuy.entity.District;
import cn.kgc.ddbuy.service.DistrictService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DistrictController {
    @Reference(interfaceClass = DistrictService.class)
    private DistrictService districtService;

    @RequestMapping("/getAllDistrict")
    public String getAllDistrict(Model model){
        List<District> districtList = districtService.getAllDistrict();
        model.addAttribute("districtList",districtList);
        return "list";
    }
}
