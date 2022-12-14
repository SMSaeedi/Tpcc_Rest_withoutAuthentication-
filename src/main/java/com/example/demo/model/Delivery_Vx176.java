package com.example.demo.model;

import com.example.demo.dataBaseConfig.Database;
import com.example.demo.dataBaseConfig.Logging;
import com.example.demo.object.DeliveryResult;
import com.example.demo.object.DistrictDelivery;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Delivery_Vx176 {

    public DeliveryResult deliveryTransaction(String w_id, String o_carrier_id) {
        long d_id, no_o_id, c_id;
        double ol_total;
        long[] orderIDs;
        int skippedDeliveries = 0;
        boolean newOrderRemoved;
        Connection con = Database.pickConnection();
        StringBuffer query = null;
        try {
            // clause 2.7.4.1
            orderIDs = new long[10];
//            Statement stmt = Database.createStatement(con);
            PreparedStatement pstatement = con.prepareStatement("SELECT * FROM " +
                    "(SELECT no_o_id " +
                    "   FROM tpcc_new_order " +
                    "  WHERE no_d_id = ? " +
                    "    AND no_w_id = ? " +
                    "  ORDER BY no_o_id ASC" +
                    ")WHERE rownum = 1");
            for (d_id = 1; d_id <= 10; d_id++) {
                do {
                    no_o_id = -1;
                    pstatement.setLong(1, d_id);
                    pstatement.setString(2, w_id);
                    try {
                        ResultSet rs = pstatement.executeQuery();
                        if (rs.next()) {
                            no_o_id = rs.getLong("no_o_id");
                        }
                        orderIDs[(int) d_id - 1] = no_o_id;
                        rs.close();
                        rs = null;
                    } catch (SQLException e) {
                        Logging.error(query.toString()+" : "+e.getMessage());
                        throw new Exception(pstatement.toString() + " : " + e.getMessage());
                    }

                    newOrderRemoved = false;
                    if (no_o_id != -1) {
                        PreparedStatement psdelete = con.prepareStatement("DELETE FROM tpcc_new_order  " +
                                " WHERE no_d_id = ? " +
                                "   AND no_w_id = ? " +
                                "   AND no_o_id = ? ");
                        psdelete.setLong(1, d_id);
                        psdelete.setString(2, w_id);
                        psdelete.setLong(3, no_o_id);

                        try {
                            int result = psdelete.executeUpdate();
                            if (result > 0) {
                                newOrderRemoved = true;
                            }
                        } catch (SQLException e) {
                            Logging.error(query.toString()+" : "+e.getMessage());
                            throw new Exception(psdelete.toString() + " : " + e.getMessage());
                        }
                    }
                } while (no_o_id != -1 && !newOrderRemoved);

                if (no_o_id != -1) {
                    PreparedStatement ps3 = con.prepareStatement(
                            "SELECT o_c_id " +
                            "  FROM tpcc_orderr" +
                            " WHERE o_id = ?  " +
                            "   AND o_d_id = ?" +
                            "   AND o_w_id = ? ");
                    ps3.setLong(1, no_o_id);
                    ps3.setLong(2, d_id);
                    ps3.setString(3, w_id);

                    try {
                        ResultSet rs = ps3.executeQuery();
                        if (!rs.next()) {
                            Logging.error(query.toString()+" not found ");
                            throw new Exception("O_ID=" + no_o_id + " O_D_ID=" + d_id + " O_W_ID='" + w_id + "' not found!");
                        }
                        c_id = rs.getLong("o_c_id");
                        rs.close();
                        rs = null;
                    } catch (SQLException e) {
                        Logging.error(query.toString()+" : "+e.getMessage());
                        throw new Exception(ps3.toString() + " : " + e.getMessage());
                    }
                    PreparedStatement ps4 = con.prepareStatement("UPDATE tpcc_orderr " +
                            " SET o_carrier_id = ? " +
                            " WHERE o_id =  ? " +
                            "   AND o_d_id =  ? " +
                            "   AND o_w_id =  ? ");
                    ps4.setString(1, o_carrier_id);
                    ps4.setLong(2, no_o_id);
                    ps4.setLong(3, d_id);
                    ps4.setString(4, w_id);
                    //  printMessage(query.toString());

                    int result = ps4.executeUpdate();
                    if (result == 0) {
                        Logging.error(query.toString()+" not found ");
                        throw new Exception("O_ID=" + no_o_id + " O_D_ID=" + d_id + " O_W_ID=" + w_id + " not found!");
                    }
                    PreparedStatement ps5 = con.prepareStatement("UPDATE tpcc_order_line " +
                            "   SET ol_delivery_d =  SYSDATE " +
                            " WHERE ol_o_id = ? " +
                            "   AND ol_d_id = ? " +
                            "   AND ol_w_id = ? ");
                    ps5.setLong(1, no_o_id);
                    ps5.setLong(2, d_id);
                    ps5.setString(1, w_id);
                    //  printMessage(query.toString());

                    result = ps5.executeUpdate();
                    if (result == 0) {
                        Logging.error(query.toString()+" not found ");
                        throw new Exception("OL_O_ID=" + no_o_id + " OL_D_ID=" + d_id + " OL_W_ID=" + w_id + " not found!");
                    }
                    PreparedStatement ps6 = con.prepareStatement("SELECT SUM(ol_amount) AS ol_total" +
                            " FROM tpcc_order_line " +
                            " WHERE ol_o_id = ? " +
                            "   AND ol_d_id = ? " +
                            "   AND ol_w_id = ? ");
                    ps6.setLong(1, no_o_id);
                    ps6.setLong(2, d_id);
                    ps6.setString(1, w_id);
                    //  printMessage(query.toString());

                    ResultSet rs = ps6.executeQuery();
                    if (!rs.next()) {
                        Logging.error(query.toString()+" not found");
                        throw new Exception("OL_O_ID=" + no_o_id + " OL_D_ID=" + d_id + " OL_W_ID=" + w_id + " not found!");
                    }
                    ol_total = rs.getDouble("ol_total");
                    rs.close();
                    rs = null;

                    Statement stmt = Database.createStatement(con);
                    query = new StringBuffer();
                    query.append("UPDATE tpcc_customer SET c_balance = c_balance + ");
                    query.append(ol_total);
                    query.append(", c_delivery_cnt = c_delivery_cnt + 1");
                    query.append(" WHERE c_id = ");
                    query.append(c_id);
                    query.append(" AND c_d_id = ");
                    query.append(d_id);
                    query.append(" AND c_w_id = '");
                    query.append(w_id);
                    query.append("'");
                    //  printMessage(query.toString());
                    result = stmt.executeUpdate(query.toString());
                    if (result == 0) {
                        Logging.error(query.toString()+" not found");
                        throw new Exception("C_ID=" + c_id + " C_W_ID=" + w_id + " C_D_ID=" + d_id + " not found!");
                    }stmt.close();
                }
            }
            con.commit();
            pstatement.close();
            List<DistrictDelivery> districtDeliveryList = new ArrayList<DistrictDelivery>(10);
            for (int i = 1; i <= 10; i++) {
                districtDeliveryList.add(new DistrictDelivery(i, orderIDs[i - 1]));
                if (orderIDs[i - 1] >= 0) {
//                    System.out.println("  District ");
//                    System.out.println(i < 10 ? " " : "");
//                    System.out.println(i);
//                    System.out.println(": Order number ");
//                    System.out.println(orderIDs[i - 1]);
//                    System.out.println(" was delivered.\n");
                } else {// clause 2.7.4.2 (dot 3) : delivery skipped
//                    System.out.println("  District ");
//                    System.out.println(i < 10 ? " " : "");
//                    System.out.println(i);
//                    System.out.println(": No orders to be delivered.\n");
                    skippedDeliveries++;
                }
            }
            return new DeliveryResult(w_id, o_carrier_id, skippedDeliveries, districtDeliveryList);
        } catch (Exception e) {
            Logging.trace(" deliveryTransaction : " + e.getMessage());
            try {
                con.rollback();
            } catch (Exception e1) {
                Logging.trace(" error rollback : " + e1.getMessage());
            }
        } finally {
            Database.relaseConnection(con);
        }
        return null;
    }
}