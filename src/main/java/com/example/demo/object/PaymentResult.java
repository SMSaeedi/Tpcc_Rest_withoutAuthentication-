package com.example.demo.object;

import java.io.Serializable;
import java.util.Date;

public class PaymentResult implements Serializable {

    private String w_id;
    private String w_street_1;
    private String w_street_2;
    private String w_city;
    private String w_state;
    private String w_zip;
    private String d_id;
    private String d_street_1;
    private String d_street_2;
    private String d_city;
    private String d_state;
    private String d_zip;
    private String c_id;
    private String c_first;
    private String c_middle;
    private String c_last;
    private String c_street_1;
    private String c_street_2;
    private String c_city;
    private String c_state;
    private String c_zip;
    private Date c_since;
    private String c_credit;
    private double c_discount;
    private String c_phone;
    private double h_amount;
    private double c_credit_lim;
    private double c_balance;
    private String c_data;

    public PaymentResult() {
    }

    public PaymentResult(String w_city, String w_state, String w_zip, String d_id, String d_city, String d_state, String d_zip, String c_id) {
        this.w_city = w_city;
        this.w_state = w_state;
        this.w_zip = w_zip;
        this.d_id = d_id;
        this.d_city = d_city;
        this.d_state = d_state;
        this.d_zip = d_zip;
        this.c_id = c_id;
    }

    public PaymentResult(String w_id, String w_street_1, String w_street_2, String w_city, String w_state, String w_zip, String d_id, String d_street_1, String d_street_2, String d_city, String d_state, String d_zip, String c_id, String c_first, String c_middle, String c_last, String c_street_1, String c_street_2, String c_city, String c_state, String c_zip, Date c_since, String c_credit, double c_discount, String c_phone, double h_amount, double c_credit_lim, double c_balance, String c_data) {
        this.w_id = w_id;
        this.w_street_1 = w_street_1;
        this.w_street_2 = w_street_2;
        this.w_city = w_city;
        this.w_state = w_state;
        this.w_zip = w_zip;
        this.d_id = d_id;
        this.d_street_1 = d_street_1;
        this.d_street_2 = d_street_2;
        this.d_city = d_city;
        this.d_state = d_state;
        this.d_zip = d_zip;
        this.c_id = c_id;
        this.c_first = c_first;
        this.c_middle = c_middle;
        this.c_last = c_last;
        this.c_street_1 = c_street_1;
        this.c_street_2 = c_street_2;
        this.c_city = c_city;
        this.c_state = c_state;
        this.c_zip = c_zip;
        this.c_since = c_since;
        this.c_credit = c_credit;
        this.c_discount = c_discount;
        this.c_phone = c_phone;
        this.h_amount = h_amount;
        this.c_credit_lim = c_credit_lim;
        this.c_balance = c_balance;
        this.c_data = c_data;
    }

    public String getW_id() {
        return w_id;
    }

    public void setW_id(String w_id) {
        this.w_id = w_id;
    }

    public String getW_street_1() {
        return w_street_1;
    }

    public void setW_street_1(String w_street_1) {
        this.w_street_1 = w_street_1;
    }

    public String getW_street_2() {
        return w_street_2;
    }

    public void setW_street_2(String w_street_2) {
        this.w_street_2 = w_street_2;
    }

    public String getW_city() {
        return w_city;
    }

    public void setW_city(String w_city) {
        this.w_city = w_city;
    }

    public String getW_state() {
        return w_state;
    }

    public void setW_state(String w_state) {
        this.w_state = w_state;
    }

    public String getW_zip() {
        return w_zip;
    }

    public void setW_zip(String w_zip) {
        this.w_zip = w_zip;
    }

    public String getD_id() {
        return d_id;
    }

    public void setD_id(String d_id) {
        this.d_id = d_id;
    }

    public String getD_street_1() {
        return d_street_1;
    }

    public void setD_street_1(String d_street_1) {
        this.d_street_1 = d_street_1;
    }

    public String getD_street_2() {
        return d_street_2;
    }

    public void setD_street_2(String d_street_2) {
        this.d_street_2 = d_street_2;
    }

    public String getD_city() {
        return d_city;
    }

    public void setD_city(String d_city) {
        this.d_city = d_city;
    }

    public String getD_state() {
        return d_state;
    }

    public void setD_state(String d_state) {
        this.d_state = d_state;
    }

    public String getD_zip() {
        return d_zip;
    }

    public void setD_zip(String d_zip) {
        this.d_zip = d_zip;
    }

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public String getC_first() {
        return c_first;
    }

    public void setC_first(String c_first) {
        this.c_first = c_first;
    }

    public String getC_middle() {
        return c_middle;
    }

    public void setC_middle(String c_middle) {
        this.c_middle = c_middle;
    }

    public String getC_last() {
        return c_last;
    }

    public void setC_last(String c_last) {
        this.c_last = c_last;
    }

    public String getC_street_1() {
        return c_street_1;
    }

    public void setC_street_1(String c_street_1) {
        this.c_street_1 = c_street_1;
    }

    public String getC_street_2() {
        return c_street_2;
    }

    public void setC_street_2(String c_street_2) {
        this.c_street_2 = c_street_2;
    }

    public String getC_city() {
        return c_city;
    }

    public void setC_city(String c_city) {
        this.c_city = c_city;
    }

    public String getC_state() {
        return c_state;
    }

    public void setC_state(String c_state) {
        this.c_state = c_state;
    }

    public String getC_zip() {
        return c_zip;
    }

    public void setC_zip(String c_zip) {
        this.c_zip = c_zip;
    }

    public Date getC_since() {
        return c_since;
    }

    public void setC_since(Date c_since) {
        this.c_since = c_since;
    }

    public String getC_credit() {
        return c_credit;
    }

    public void setC_credit(String c_credit) {
        this.c_credit = c_credit;
    }

    public double getC_discount() {
        return c_discount;
    }

    public void setC_discount(double c_discount) {
        this.c_discount = c_discount;
    }

    public String getC_phone() {
        return c_phone;
    }

    public void setC_phone(String c_phone) {
        this.c_phone = c_phone;
    }

    public double getH_amount() {
        return h_amount;
    }

    public void setH_amount(double h_amount) {
        this.h_amount = h_amount;
    }

    public double getC_credit_lim() {
        return c_credit_lim;
    }

    public void setC_credit_lim(double c_credit_lim) {
        this.c_credit_lim = c_credit_lim;
    }

    public double getC_balance() {
        return c_balance;
    }

    public void setC_balance(double c_balance) {
        this.c_balance = c_balance;
    }

    public String getC_data() {
        return c_data;
    }

    public void setC_data(String c_data) {
        this.c_data = c_data;
    }
}