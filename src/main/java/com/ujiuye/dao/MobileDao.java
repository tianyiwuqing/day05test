package com.ujiuye.dao;

import com.ujiuye.bean.Mobile;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author 天意无情
 * @date 2018-12-01 20:58
 */
public interface MobileDao {


    /**
     * 保存一个集合
     * @param list
     */
    public void saveMobile(@RequestParam("lists") List<Mobile> list);


    /**
     * 查询一个电话号码
     * @param number
     * @return
     */
    public Mobile getOnInfo(String number);

}
