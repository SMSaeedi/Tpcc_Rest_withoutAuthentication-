package com.example.demo.service;


import com.example.demo.object.PaymentResult;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


public interface StockLevel {


    public long stockLevelTransaction_Vx0( PaymentResult input, long threshold) throws Exception;


    public long stockLevelTransaction_Vx0Test( PaymentResult input, long threshold) throws Exception;


    public long stockLevelTransaction_Vx033( PaymentResult input, long threshold) throws Exception;


    public long stockLevelTransaction_Vx057( PaymentResult input, long threshold) throws Exception;


    public long stockLevelTransaction_VxA( PaymentResult input, long threshold) throws Exception;
}