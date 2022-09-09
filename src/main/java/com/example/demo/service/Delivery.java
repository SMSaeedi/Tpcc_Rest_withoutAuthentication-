package com.example.demo.service;

import com.example.demo.object.DeliveryResult;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


public interface Delivery {


    public DeliveryResult deliveryTransaction_Vx0(
            String w_id,  String o_carrier_id) throws Exception;


    public DeliveryResult deliveryTransaction_VxA(
             DeliveryResult input) throws Exception;


    public DeliveryResult deliveryTransaction_Vx051(
            DeliveryResult input) throws Exception;


    public DeliveryResult deliveryTransaction_Vx075(
            DeliveryResult input) throws Exception;


    public DeliveryResult deliveryTransaction_Vx099(
            DeliveryResult input) throws Exception;


    public DeliveryResult deliveryTransaction_Vx123(
            DeliveryResult input) throws Exception;


    public DeliveryResult deliveryTransaction_Vx138(
             DeliveryResult input) throws Exception;


    public DeliveryResult deliveryTransaction_Vx154(
             DeliveryResult input) throws Exception;


    public DeliveryResult deliveryTransaction_Vx176(
             DeliveryResult input) throws Exception;

}