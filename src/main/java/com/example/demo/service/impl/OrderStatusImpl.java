package com.example.demo.service.impl;


import com.example.demo.model.*;

import com.example.demo.service.OrderStatus;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class OrderStatusImpl implements OrderStatus {

    @Override
    public Order orderStatusTransaction_Vx0(String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws SQLException {
            return new OrderStatus_Vx066().orderStatusTransaction(w_id, d_id, c_id, c_last, c_by_name);
    }

    @Override
    public Order orderStatusTransaction_VxA(String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws SQLException {
        return new OrderStatus_Vx096().orderStatusTransaction(w_id, d_id, c_id, c_last, c_by_name);
    }

    @Override
    public Order orderStatusTransaction_Vx046(String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception {
        return new OrderStatus_Vx046().orderStatusTransaction(w_id, d_id, c_id, c_last, c_by_name);
    }

    @Override
    public Order orderStatusTransaction_Vx066(String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception {
        return new OrderStatus_Vx066().orderStatusTransaction(w_id, d_id, c_id, c_last, c_by_name);
    }

    @Override
    public Order orderStatusTransaction_Vx096(String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception {
        return new OrderStatus_Vx096().orderStatusTransaction(w_id, d_id, c_id, c_last, c_by_name);
    }

 @Override
    public Order orderStatusTransaction_Vx122(String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception {
        return new OrderStatus_Vx122().orderStatusTransaction(w_id, d_id, c_id, c_last, c_by_name);
    }

    @Override
    public Order orderStatusTransaction_Vx143(String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception {
        return new OrderStatus_Vx143().orderStatusTransaction(w_id, d_id, c_id, c_last, c_by_name);
    }

}