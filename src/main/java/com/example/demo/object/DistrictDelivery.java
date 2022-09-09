package com.example.demo.object;

import java.io.Serializable;

public class DistrictDelivery implements Serializable {

    private int district;
    private long orderid;

    public DistrictDelivery() {
    }

    public DistrictDelivery(int district, long orderid) {
        this.district = district;
        this.orderid = orderid;
    }

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    public long getOrderid() {
        return orderid;
    }

    public void setOrderid(long orderid) {
        this.orderid = orderid;
    }
}