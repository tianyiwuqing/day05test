package com.ujiuye.test;

import com.ujiuye.bean.Mobile;
import com.ujiuye.dao.MobileDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 天意无情
 * @date 2018-12-05 0:45
 */
public class DaoTest {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        MobileDao bean = context.getBean(MobileDao.class);
        Mobile onInfo = bean.getOnInfo("1346141");
        System.out.println(onInfo);
    }
}
