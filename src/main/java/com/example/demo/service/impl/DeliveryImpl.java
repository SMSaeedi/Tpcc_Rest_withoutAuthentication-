package com.example.demo.service.impl;


import com.example.demo.model.*;
import com.example.demo.object.DeliveryResult;
import com.example.demo.service.Delivery;
import org.springframework.stereotype.Service;

@Service
public class DeliveryImpl implements Delivery {

    @Override
    public DeliveryResult deliveryTransaction_Vx0(String w_id, String o_carrier_id) {
        return new Delivery_Vx0().deliveryTransactionTest(w_id, o_carrier_id);
    }

    @Override
    public DeliveryResult deliveryTransaction_VxA(DeliveryResult input) {
        return new Delivery_VxA().deliveryTransaction(input.getW_id(), input.getO_carrier_id());
    }

    @Override
    public DeliveryResult deliveryTransaction_Vx051(DeliveryResult input) {
        return new Delivery_Vx051().deliveryTransaction(input.getW_id(), input.getO_carrier_id());
    }

    @Override
    public DeliveryResult deliveryTransaction_Vx075(DeliveryResult input) {
        return new Delivery_Vx075().deliveryTransaction(input.getW_id(), input.getO_carrier_id());
    }

    @Override
    public DeliveryResult deliveryTransaction_Vx099(DeliveryResult input) {
        return new Delivery_Vx099().deliveryTransaction(input.getW_id(), input.getO_carrier_id());
    }

    @Override
    public DeliveryResult deliveryTransaction_Vx123(DeliveryResult input) {
        return new Delivery_Vx123().deliveryTransaction(input.getW_id(), input.getO_carrier_id());
    }

    @Override
    public DeliveryResult deliveryTransaction_Vx138(DeliveryResult input) {
        return new Delivery_Vx138().deliveryTransaction(input.getW_id(), input.getO_carrier_id());
    }

    @Override
    public DeliveryResult deliveryTransaction_Vx154(DeliveryResult input) {
        return new Delivery_Vx154().deliveryTransaction(input.getW_id(), input.getO_carrier_id());
    }

    @Override
    public DeliveryResult deliveryTransaction_Vx176(DeliveryResult input) {
        return new Delivery_Vx176().deliveryTransaction(input.getW_id(), input.getO_carrier_id());
    }

}