package com.example.demo.service;


import com.example.demo.model.Order;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


public interface OrderStatus {


    public Order orderStatusTransaction_Vx0(
            String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception;


    public Order orderStatusTransaction_VxA(
            String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception;


    public Order orderStatusTransaction_Vx046(
            String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception;


    public Order orderStatusTransaction_Vx066(
         String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception;


    public Order orderStatusTransaction_Vx096(
           String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception;


    public Order orderStatusTransaction_Vx122(
            String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception;


    public Order orderStatusTransaction_Vx143(
            String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception;
}