package com.example.demo.service.impl;

import com.example.demo.model.*;
import com.example.demo.object.PaymentResult;
import com.example.demo.service.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentImpl implements Payment {

    @Override
    public PaymentResult paymentTransaction_Vx0(PaymentModel input) {
        return new Payment_Vx0().paymentTransaction(input);
    }

    @Override
    public PaymentResult paymentTransaction_Vx0Test() {
        return new Payment_Vx0().paymentTransactionTest();
    }

    @Override
    public PaymentResult paymentTransaction_VxA(PaymentModel input) {
        return new Payment_VxA().paymentTransaction(input);
    }

    @Override
    public PaymentResult paymentTransaction_Vx043(PaymentModel input) {
        return new Payment_Vx043().paymentTransaction(input);
    }

    @Override
    public PaymentResult paymentTransaction_Vx057(PaymentModel input) {
        return new Payment_Vx057().paymentTransaction(input);
    }

    @Override
    public PaymentResult paymentTransaction_Vx078(PaymentModel input) {
        return new Payment_Vx078().paymentTransaction(input);
    }

    @Override
    public PaymentResult paymentTransaction_Vx091(PaymentModel input) {
        return new Payment_Vx091().paymentTransaction(input);
    }

    @Override
    public PaymentResult paymentTransaction_Vx115(PaymentModel input) {
        return new Payment_Vx115().paymentTransaction(input);
    }

    @Override
    public PaymentResult paymentTransaction_Vx136(PaymentModel input) {
        return new Payment_Vx136().paymentTransaction(input);
    }

    @Override
    public PaymentResult paymentTransaction_Vx177(PaymentModel input) {
        return new Payment_Vx177().paymentTransaction(input);
    }

    @Override
    public PaymentResult paymentTransaction_Vx212(PaymentModel input) {
        return new Payment_Vx212().paymentTransaction(input);
    }

    @Override
    public PaymentResult paymentTransaction_Vx241(PaymentModel input) {
        return new Payment_Vx241().paymentTransaction(input);
    }

    @Override
    public PaymentResult paymentTransaction_Vx257(PaymentModel input) {
        return new Payment_Vx257().paymentTransaction(input);
    }

    @Override
    public PaymentResult paymentTransaction_Vx290(PaymentModel input) {
        return new Payment_Vx290().paymentTransaction(input);
    }
}
