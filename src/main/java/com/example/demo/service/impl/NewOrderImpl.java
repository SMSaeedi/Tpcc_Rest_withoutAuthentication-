package com.example.demo.service.impl;


import com.example.demo.model.*;
import com.example.demo.object.NewOrderLongList;
import com.example.demo.object.ShortOrder;
import com.example.demo.service.NewOrder;
import org.springframework.stereotype.Service;

@Service
public class NewOrderImpl implements NewOrder {

    @Override
    public ShortOrder newOrderTransaction_Vx0(String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, long[] itemIDs, long[] supplierWarehouseIDs, long[] orderQuantities) {
            return new NewOrder_Vx0().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs, supplierWarehouseIDs, orderQuantities);
    }

    @Override
    public ShortOrder newOrderTransaction_VxA(String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities) {
            return new NewOrder_VxA().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

    @Override
    public ShortOrder newOrderTransaction_Vx056(String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities) {
            return new NewOrder_Vx056().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

    @Override
    public ShortOrder newOrderTransaction_Vx081(String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities) {
            return new NewOrder_Vx081().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

    @Override
    public ShortOrder newOrderTransaction_Vx103(String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities) {
            return new NewOrder_Vx103().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

    @Override
    public ShortOrder newOrderTransaction_Vx119(String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities) {
            return new NewOrder_Vx119().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

    @Override
    public ShortOrder newOrderTransaction_Vx144(String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities) {
            return new NewOrder_Vx144().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

}