package com.ujiuye.oo;

import com.ujiuye.server.ArrayOfString;
import com.ujiuye.server.MobileCodeWS;
import com.ujiuye.server.MobileCodeWSSoap;

import java.util.List;

/**
 * @author 天意无情
 * @date 2018-12-05 0:17
 */
public class Test {

    public static void main(String[] args) {
//        MobileCodeWS mobileCodeWS=new MobileCodeWS();
//        MobileCodeWSSoap port = mobileCodeWS.getPort(MobileCodeWSSoap.class);
//        ArrayOfString databaseInfo = port.getDatabaseInfo();
//        List<String> string = databaseInfo.getString();
//        for (String s : string) {
//            System.out.println(s);
//        }
        String number="13461415066";
        String substring = number.substring(0, 7);
        System.out.println(substring);
    }
}
