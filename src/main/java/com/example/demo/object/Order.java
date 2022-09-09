package com.example.demo.object;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Order implements Serializable {

    private long o_id;
    private String c_id;
    private Date entdate;
    private long o_carrier_id;
    private List<OrderLine> orderLines;

    public Order() {
    }

    public Order(long o_id, String c_id, Date entdate, long o_carrier_id, List<OrderLine> orderLines) {
        this.o_id = o_id;
        this.c_id = c_id;
        this.entdate = entdate;
        this.o_carrier_id = o_carrier_id;
        this.orderLines = orderLines;
    }

    public long getO_id() {
        return o_id;
    }

    public void setO_id(long o_id) {
        this.o_id = o_id;
    }

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public Date getEntdate() {
        return entdate;
    }

    public void setEntdate(Date entdate) {
        this.entdate = entdate;
    }

    public long getO_carrier_id() {
        return o_carrier_id;
    }

    public void setO_carrier_id(long o_carrier_id) {
        this.o_carrier_id = o_carrier_id;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
}