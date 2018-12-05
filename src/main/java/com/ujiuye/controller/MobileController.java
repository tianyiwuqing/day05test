package com.ujiuye.controller;

import com.ujiuye.bean.Mobile;
import com.ujiuye.dao.MobileDao;
import com.ujiuye.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 天意无情
 * @date 2018-12-05 0:55
 */
@Controller
public class MobileController {

    @Autowired
    private MobileService mobileService;

    @RequestMapping("getInfo")
    @ResponseBody
    public Mobile getInfo(String number){
        return mobileService.getOnInfo(number);
    }




}
