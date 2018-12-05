package com.ujiuye.service;

import com.ujiuye.bean.Mobile;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author 天意无情
 * @date 2018-12-05 0:28
 */

@Service
public interface MobileService {


    /**
     * 查找号码
     * @param number
     * @return
     */
    @GET
    @Path("/get/{number}")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Mobile getOnInfo(@PathParam("number") String number);


}
