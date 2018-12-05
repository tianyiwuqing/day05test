package com.ujiuye.service.impl;

import com.ujiuye.bean.Mobile;
import com.ujiuye.dao.MobileDao;
import com.ujiuye.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

/**
 * @author 天意无情
 * @date 2018-12-05 0:32
 */
@Service
public class MobileServiceImpl implements MobileService {


    @Autowired
    private MobileDao mobileDao;

    @Override
    public Mobile getOnInfo(String number) {
        String substring = number.substring(0, 7);
        Mobile onInfo = mobileDao.getOnInfo(substring);
        System.out.println(onInfo);
        return onInfo;
    }
}
