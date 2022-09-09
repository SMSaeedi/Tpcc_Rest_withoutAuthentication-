package com.example.demo.service;


import com.example.demo.object.NewOrderLongList;
import com.example.demo.object.ShortOrder;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


public interface NewOrder {


    public ShortOrder newOrderTransaction_Vx0( String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, long[] itemIDs, long[] supplierWarehouseIDs, long[] orderQuantities);


    public ShortOrder newOrderTransaction_VxA(String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities);


    public ShortOrder newOrderTransaction_Vx056( String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities);


    public ShortOrder newOrderTransaction_Vx081( String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities);


    public ShortOrder newOrderTransaction_Vx103( String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities);


    public ShortOrder newOrderTransaction_Vx119( String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities);


    public ShortOrder newOrderTransaction_Vx144( String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities);

}