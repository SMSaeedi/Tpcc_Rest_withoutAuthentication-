package com.example.demo.object;

import java.io.Serializable;

public class ShortOrder implements Serializable {

    private long o_id;
    private double total_amount;

    public ShortOrder() {
    }

    public ShortOrder(long o_id, double total_amount) {
        this.o_id = o_id;
        this.total_amount = total_amount;
    }

    public long getO_id() {
        return o_id;
    }

    public void setO_id(long o_id) {
        this.o_id = o_id;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }
}