package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

public class OrderLine implements Serializable {

    private long ol_supply_w_id;
    private long ol_i_id;
    private long ol_quantity;
    private double ol_amount;
    private Date ol_delivery_d;

    public OrderLine() {
    }

    public OrderLine(long ol_supply_w_id, long ol_i_id, long ol_quantity, double ol_amount, Date ol_delivery_d) {
        this.ol_supply_w_id = ol_supply_w_id;
        this.ol_i_id = ol_i_id;
        this.ol_quantity = ol_quantity;
        this.ol_amount = ol_amount;
        this.ol_delivery_d = ol_delivery_d;
    }

    public long getOl_supply_w_id() {
        return ol_supply_w_id;
    }

    public void setOl_supply_w_id(long ol_supply_w_id) {
        this.ol_supply_w_id = ol_supply_w_id;
    }

    public long getOl_i_id() {
        return ol_i_id;
    }

    public void setOl_i_id(long ol_i_id) {
        this.ol_i_id = ol_i_id;
    }

    public long getOl_quantity() {
        return ol_quantity;
    }

    public void setOl_quantity(long ol_quantity) {
        this.ol_quantity = ol_quantity;
    }

    public double getOl_amount() {
        return ol_amount;
    }

    public void setOl_amount(double ol_amount) {
        this.ol_amount = ol_amount;
    }

    public Date getOl_delivery_d() {
        return ol_delivery_d;
    }

    public void setOl_delivery_d(Date ol_delivery_d) {
        this.ol_delivery_d = ol_delivery_d;
    }
}