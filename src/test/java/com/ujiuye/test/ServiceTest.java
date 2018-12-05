package com.ujiuye.test;

import com.ujiuye.bean.Mobile;
import com.ujiuye.service.MobileService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 天意无情
 * @date 2018-12-05 0:36
 */
public class ServiceTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-service.xml", "spring-dao.xml");
        MobileService service = context.getBean(MobileService.class);
        Mobile onInfo = service.getOnInfo("1346141");
        System.out.println(onInfo);

    }
}
