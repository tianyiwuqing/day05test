package com.ujiuye.bean;

import java.io.Serializable;

/**
 * @author 天意无情
 * @date 2018-12-01 20:54
 */
public class Mobile implements Serializable {


    private Integer id;

    private String number;

    private String area;

    private String type;

    private String areacode;

    private String postcode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", area='" + area + '\'' +
                ", type='" + type + '\'' +
                ", areacode='" + areacode + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
