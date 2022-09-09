package com.example.demo.controller;


import com.example.demo.model.*;
import com.example.demo.object.DeliveryResult;
import com.example.demo.object.NewOrderLongList;
import com.example.demo.object.PaymentResult;
import com.example.demo.object.ShortOrder;
import com.example.demo.service.StockLevel;
import com.example.demo.service.impl.DeliveryImpl;
import com.example.demo.service.impl.OrderStatusImpl;
import com.example.demo.service.impl.PaymentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TpccController {

    private DeliveryImpl delivery = new DeliveryImpl();

    @RequestMapping("deliveryTransaction_Vx0")
    public DeliveryResult deliveryTransaction_Vx0(@RequestBody DeliveryResult input) throws Exception {
        return delivery.deliveryTransaction_Vx0(input.getW_id(), input.getO_carrier_id());
    }

    @RequestMapping("deliveryTransaction_VxA")
    public DeliveryResult deliveryTransaction_VxA(@RequestParam(name = "w_id") String w_id,
                                                  @RequestParam(name = "o_carrier_id") String o_carrier_id) {
        return new Delivery_VxA().deliveryTransaction(w_id, o_carrier_id);
    }

    @RequestMapping("deliveryTransaction_Vx051")
    public DeliveryResult deliveryTransaction_Vx051(@RequestParam(name = "w_id") String w_id,
                                                    @RequestParam(name = "o_carrier_id") String o_carrier_id) {
        return new Delivery_Vx051().deliveryTransaction(w_id, o_carrier_id);
    }

    @RequestMapping("deliveryTransaction_Vx075")
    public DeliveryResult deliveryTransaction_Vx075(@RequestParam(name = "w_id") String w_id,
                                                    @RequestParam(name = "o_carrier_id") String o_carrier_id) {
        return new Delivery_Vx075().deliveryTransaction(w_id, o_carrier_id);
    }

    @RequestMapping("deliveryTransaction_Vx099")
    public DeliveryResult deliveryTransaction_Vx099(@RequestParam(name = "w_id") String w_id,
                                                    @RequestParam(name = "o_carrier_id") String o_carrier_id) {
        return new Delivery_Vx099().deliveryTransaction(w_id, o_carrier_id);
    }

    @RequestMapping("deliveryTransaction_Vx123")
    public DeliveryResult deliveryTransaction_Vx123(@RequestParam(name = "w_id") String w_id,
                                                    @RequestParam(name = "o_carrier_id") String o_carrier_id) {
        return new Delivery_Vx123().deliveryTransaction(w_id, o_carrier_id);
    }

    @RequestMapping("deliveryTransaction_Vx138")
    public DeliveryResult deliveryTransaction_Vx138(@RequestParam(name = "w_id") String w_id,
                                                    @RequestParam(name = "o_carrier_id") String o_carrier_id) {
        return new Delivery_Vx138().deliveryTransaction(w_id, o_carrier_id);
    }

    @RequestMapping("deliveryTransaction_Vx154")
    public DeliveryResult deliveryTransaction_Vx154(@RequestParam(name = "w_id") String w_id,
                                                    @RequestParam(name = "o_carrier_id") String o_carrier_id) {
        return new Delivery_Vx154().deliveryTransaction(w_id, o_carrier_id);
    }

    @RequestMapping("deliveryTransaction_Vx176")
    public DeliveryResult deliveryTransaction_Vx176(@RequestParam(name = "w_id") String w_id,
                                                    @RequestParam(name = "o_carrier_id") String o_carrier_id) {
        return new Delivery_Vx176().deliveryTransaction(w_id, o_carrier_id);
    }


    //==============================================================================================


        @RequestMapping("newOrderTransaction_Vx0")
        public ShortOrder newOrderTransaction_Vx0(@RequestParam(name = "w_id") String w_id, @RequestParam(name = "d_id") String d_id, @RequestParam(name = "c_id") String c_id, @RequestParam(name = "o_ol_cnt") int o_ol_cnt, @RequestParam(name = "o_all_local") int o_all_local, @RequestBody NewOrderLongList itemIDs, @RequestBody NewOrderLongList supplierWarehouseIDs, @RequestBody NewOrderLongList orderQuantities) throws Exception {
            return new NewOrder_Vx0().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
        }

        @RequestMapping("newOrderTransaction_VxA")
        public ShortOrder newOrderTransaction_VxA(@RequestParam(name = "w_id") String w_id, @RequestParam(name = "d_id") String d_id, @RequestParam(name = "c_id") String c_id, @RequestParam(name = "o_ol_cnt") int o_ol_cnt, @RequestParam(name = "o_all_local") int o_all_local, @RequestBody NewOrderLongList itemIDs,@RequestBody NewOrderLongList supplierWarehouseIDs,@RequestBody NewOrderLongList orderQuantities) throws Exception {
            return new NewOrder_VxA().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
        }

        @RequestMapping("newOrderTransaction_Vx056")
        public ShortOrder newOrderTransaction_Vx056(@RequestParam(name = "w_id") String w_id, @RequestParam(name = "d_id") String d_id, @RequestParam(name = "c_id") String c_id, @RequestParam(name = "o_ol_cnt") int o_ol_cnt, @RequestParam(name = "o_all_local") int o_all_local, @RequestBody NewOrderLongList itemIDs,@RequestBody NewOrderLongList supplierWarehouseIDs,@RequestBody NewOrderLongList orderQuantities) throws Exception {
            return new NewOrder_Vx056().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
        }

        @RequestMapping("newOrderTransaction_Vx081")
        public ShortOrder newOrderTransaction_Vx081(@RequestParam(name = "w_id") String w_id, @RequestParam(name = "d_id") String d_id, @RequestParam(name = "c_id") String c_id, @RequestParam(name = "o_ol_cnt") int o_ol_cnt, @RequestParam(name = "o_all_local") int o_all_local, @RequestBody NewOrderLongList itemIDs,@RequestBody NewOrderLongList supplierWarehouseIDs,@RequestBody NewOrderLongList orderQuantities) throws Exception {
            return new NewOrder_Vx081().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
        }

        @RequestMapping("newOrderTransaction_Vx103")
        public ShortOrder newOrderTransaction_Vx103(@RequestParam(name = "w_id") String w_id, @RequestParam(name = "d_id") String d_id, @RequestParam(name = "c_id") String c_id, @RequestParam(name = "o_ol_cnt") int o_ol_cnt, @RequestParam(name = "o_all_local") int o_all_local, @RequestBody NewOrderLongList itemIDs,@RequestBody NewOrderLongList supplierWarehouseIDs,@RequestBody NewOrderLongList orderQuantities) throws Exception {
            return new NewOrder_Vx103().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
        }

        @RequestMapping("newOrderTransaction_Vx119")
        public ShortOrder newOrderTransaction_Vx119(@RequestParam(name = "w_id") String w_id, @RequestParam(name = "d_id") String d_id, @RequestParam(name = "c_id") String c_id, @RequestParam(name = "o_ol_cnt") int o_ol_cnt, @RequestParam(name = "o_all_local") int o_all_local, @RequestBody NewOrderLongList itemIDs,@RequestBody NewOrderLongList supplierWarehouseIDs,@RequestBody NewOrderLongList orderQuantities) throws Exception {
            return new NewOrder_Vx119().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
        }

        @RequestMapping("newOrderTransaction_Vx144")
        public ShortOrder newOrderTransaction_Vx144(@RequestParam(name = "w_id") String w_id, @RequestParam(name = "d_id") String d_id, @RequestParam(name = "c_id") String c_id, @RequestParam(name = "o_ol_cnt") int o_ol_cnt, @RequestParam(name = "o_all_local") int o_all_local, @RequestBody NewOrderLongList itemIDs,@RequestBody NewOrderLongList supplierWarehouseIDs,@RequestBody NewOrderLongList orderQuantities) throws Exception {
            return new NewOrder_Vx144().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
        }
        //==============================================================================================


            private OrderStatusImpl orderStatus = new OrderStatusImpl();

            @RequestMapping("orderStatusTransaction_Vx0")
            public Order orderStatusTransaction_Vx0(@RequestParam("w_id") String w_id, @RequestParam("d_id") String d_id, @RequestParam("c_id") String c_id, @RequestParam("c_last") String c_last, @RequestParam("c_by_name") boolean c_by_name) throws Exception {
                return orderStatus.orderStatusTransaction_Vx0(w_id, d_id, c_id, c_last, c_by_name);
            }

            @RequestMapping("orderStatusTransaction_VxA")
            public Order orderStatusTransaction_VxA(@RequestParam("w_id") String w_id, @RequestParam("d_id") String d_id, @RequestParam("c_id") String c_id, @RequestParam("c_last") String c_last, @RequestParam("c_by_name") boolean c_by_name) throws Exception {
                return orderStatus.orderStatusTransaction_VxA(w_id, d_id, c_id, c_last, c_by_name);
            }

            @RequestMapping("orderStatusTransaction_Vx046")
            public Order orderStatusTransaction_Vx046(@RequestParam("w_id") String w_id, @RequestParam("d_id") String d_id, @RequestParam("c_id") String c_id, @RequestParam("c_last") String c_last, @RequestParam("c_by_name") boolean c_by_name) throws Exception {
                return orderStatus.orderStatusTransaction_Vx046(w_id, d_id, c_id, c_last, c_by_name);
            }

            @RequestMapping("orderStatusTransaction_Vx066")
            public Order orderStatusTransaction_Vx066(@RequestParam("w_id") String w_id, @RequestParam("d_id") String d_id, @RequestParam("c_id") String c_id, @RequestParam("c_last") String c_last, @RequestParam("c_by_name") boolean c_by_name) throws Exception {
                return orderStatus.orderStatusTransaction_Vx066(w_id, d_id, c_id, c_last, c_by_name);
            }

            @RequestMapping("orderStatusTransaction_Vx096")
            public Order orderStatusTransaction_Vx096(@RequestParam("w_id") String w_id, @RequestParam("d_id") String d_id, @RequestParam("c_id") String c_id, @RequestParam("c_last") String c_last, @RequestParam("c_by_name") boolean c_by_name) throws Exception {
                return orderStatus.orderStatusTransaction_Vx096(w_id, d_id, c_id, c_last, c_by_name);
            }

            @RequestMapping("orderStatusTransaction_Vx122")
            public Order orderStatusTransaction_Vx122(@RequestParam("w_id") String w_id, @RequestParam("d_id") String d_id, @RequestParam("c_id") String c_id, @RequestParam("c_last") String c_last, @RequestParam("c_by_name") boolean c_by_name) throws Exception {
                return orderStatus.orderStatusTransaction_Vx122(w_id, d_id, c_id, c_last, c_by_name);
            }

            @RequestMapping("orderStatusTransaction_Vx143")
            public Order orderStatusTransaction_Vx143(@RequestParam("w_id") String w_id, @RequestParam("d_id") String d_id, @RequestParam("c_id") String c_id, @RequestParam("c_last") String c_last, @RequestParam("c_by_name") boolean c_by_name) throws Exception {
                return orderStatus.orderStatusTransaction_Vx143(w_id, d_id, c_id, c_last, c_by_name);
            }
            //==============================================================================================


                private PaymentImpl payment=new PaymentImpl();

                @RequestMapping("paymentTransaction_Vx0")
                public PaymentResult paymentTransaction_Vx0(@RequestBody PaymentModel input) throws Exception {
                    return payment.paymentTransaction_Vx0(input);
                }

                @RequestMapping("paymentTransaction_Vx0Test")
                public PaymentResult paymentTransaction_Vx0Test() {
                    return payment.paymentTransaction_Vx0Test();
                }

                @RequestMapping("paymentTransaction_Vx033")
                public PaymentResult paymentTransaction_Vx033(@RequestBody PaymentModel input) throws Exception {
                    return payment.paymentTransaction_Vx043(input);
                }

                @RequestMapping("paymentTransaction_Vx057")
                public PaymentResult paymentTransaction_Vx057(@RequestBody PaymentModel input) throws Exception {
                    return payment.paymentTransaction_Vx057(input);
                }

                @RequestMapping("paymentTransaction_Vx078")
                public PaymentResult paymentTransaction_Vx078(@RequestBody PaymentModel input) throws Exception {
                    return payment.paymentTransaction_Vx078(input);
                }

                @RequestMapping("paymentTransaction_VxA")
                public PaymentResult paymentTransaction_VxA(@RequestBody PaymentModel input) throws Exception {
                    return payment.paymentTransaction_VxA(input);
                }

                @RequestMapping("paymentTransaction_Vx091")
                public PaymentResult paymentTransaction_Vx091(@RequestBody PaymentModel input) throws Exception {
                    return payment.paymentTransaction_Vx091(input);
                }

                @RequestMapping("paymentTransaction_Vx115")
                public PaymentResult paymentTransaction_Vx115(@RequestBody PaymentModel input) throws Exception {
                    return payment.paymentTransaction_Vx115(input);
                }

                @RequestMapping("paymentTransaction_Vx212")
                public PaymentResult paymentTransaction_Vx212(@RequestBody PaymentModel input) throws Exception {
                    return payment.paymentTransaction_Vx212(input);
                }

                @RequestMapping("paymentTransaction_Vx241")
                public PaymentResult paymentTransaction_Vx241(@RequestBody PaymentModel input) throws Exception {
                    return payment.paymentTransaction_Vx241(input);
                }

                @RequestMapping("paymentTransaction_Vx177")
                public PaymentResult paymentTransaction_Vx177(@RequestBody PaymentModel input) throws Exception {
                    return payment.paymentTransaction_Vx177(input);
                }

                @RequestMapping("paymentTransaction_Vx136")
                public PaymentResult paymentTransaction_Vx136(@RequestBody PaymentModel input) throws Exception {
                    return payment.paymentTransaction_Vx136(input);
                }

                @RequestMapping("paymentTransaction_Vx257")
                public PaymentResult paymentTransaction_Vx257(@RequestBody PaymentModel input) throws Exception {
                    return payment.paymentTransaction_Vx257(input);
                }

                @RequestMapping("paymentTransaction_Vx290")
                public PaymentResult paymentTransaction_Vx290(@RequestBody PaymentModel input) throws Exception {
                    return payment.paymentTransaction_Vx290(input);
                }
                //==============================================================================================


                    @Autowired
                    private StockLevel stockLevel;

                    @RequestMapping("stockLevelTransaction_Vx0")
                    public long stockLevelTransaction_Vx0(@RequestBody PaymentResult input,@RequestParam(name = "threshold") long threshold) throws Exception {
                        return stockLevel.stockLevelTransaction_Vx0(input, threshold);
                    }

                    @RequestMapping("stockLevelTransaction_Vx0Test")
                    public long stockLevelTransaction_Vx0Test(@RequestBody PaymentResult input,@RequestParam(name = "threshold") long threshold) throws Exception {
                        return stockLevel.stockLevelTransaction_Vx0Test(input, threshold);
                    }

                    @RequestMapping("stockLevelTransaction_Vx033")
                    public long stockLevelTransaction_Vx033(@RequestBody PaymentResult input,@RequestParam(name = "threshold") long threshold) throws Exception {
                        return stockLevel.stockLevelTransaction_Vx033(input, threshold);
                    }

                    @RequestMapping("stockLevelTransaction_Vx057")
                    public long stockLevelTransaction_Vx057(@RequestBody PaymentResult input,@RequestParam(name = "threshold") long threshold) throws Exception {
                        return stockLevel.stockLevelTransaction_Vx057(input, threshold);
                    }

                    @RequestMapping("stockLevelTransaction_VxA")
                    public long stockLevelTransaction_VxA(@RequestBody PaymentResult input,@RequestParam(name = "threshold") long threshold) throws Exception {
                        return stockLevel.stockLevelTransaction_VxA(input, threshold);
                    }
}