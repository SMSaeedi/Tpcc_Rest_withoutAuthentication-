package com.example.demo.object;

import java.io.Serializable;
import java.util.List;

public class DeliveryResult implements Serializable {

    private String w_id;
    private String o_carrier_id;
    private int skippedDeliveries;
    private List<DistrictDelivery> districtDeliveryList;

    public DeliveryResult() {
    }

    public DeliveryResult(String w_id, String o_carrier_id, int skippedDeliveries, List<DistrictDelivery> districtDeliveryList) {
        this.w_id = w_id;
        this.o_carrier_id = o_carrier_id;
        this.skippedDeliveries = skippedDeliveries;
        this.districtDeliveryList = districtDeliveryList;
    }

    public String getW_id() {
        return w_id;
    }

    public void setW_id(String w_id) {
        this.w_id = w_id;
    }

    public String getO_carrier_id() {
        return o_carrier_id;
    }

    public void setO_carrier_id(String o_carrier_id) {
        this.o_carrier_id = o_carrier_id;
    }

    public int getSkippedDeliveries() {
        return skippedDeliveries;
    }

    public void setSkippedDeliveries(int skippedDeliveries) {
        this.skippedDeliveries = skippedDeliveries;
    }

    public List<DistrictDelivery> getDistrictDeliveryList() {
        return districtDeliveryList;
    }

    public void setDistrictDeliveryList(List<DistrictDelivery> districtDeliveryList) {
        this.districtDeliveryList = districtDeliveryList;
    }
}