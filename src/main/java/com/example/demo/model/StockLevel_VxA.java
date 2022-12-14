package com.example.demo.model;

import com.example.demo.dataBaseConfig.Database;
import com.example.demo.dataBaseConfig.Logging;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class StockLevel_VxA {

    public long stockLevelTransaction(String w_id, String d_id, long threshold) {
        long o_id, stock_count;
        Connection con = Database.pickConnection();
        try {
            Statement stmt = Database.createStatement(con);
            StringBuffer query = new StringBuffer();
            query.append("SELECT d_next_o_id");
            query.append(" FROM tpcc_district");
            query.append(" WHERE d_w_id = '");
            query.append(w_id);
            query.append("' AND d_id = '");
            query.append(d_id);
            query.append("'");
            //  printMessage(query.toString());
            ResultSet rs = stmt.executeQuery(query.toString());
            if (!rs.next()) {
                throw new Exception("D_W_ID=" + w_id + " D_ID=" + d_id + " not found!");
            }
            o_id = rs.getLong("d_next_o_id");
            rs.close();
            rs = null;
            query = new StringBuffer();
            query.append("SELECT COUNT(DISTINCT (s_i_id)) AS stock_count");
            query.append(" FROM tpcc_order_line, tpcc_stock");
            query.append(" WHERE s_i_id = ol_i_id");
            query.append(" AND s_quantity < ");
            query.append(threshold);
            query.append(" AND ol_w_id = '");
            query.append(w_id);
            query.append("' AND ol_d_id = '");
            query.append(d_id);
            query.append("' AND ol_o_id < ");
            query.append(o_id);
            query.append(" AND ol_o_id >= ");
            query.append(o_id - 20);
            query.append(" AND s_w_id = '");
            query.append(w_id);
            query.append("' ");
            rs = stmt.executeQuery(query.toString());
            if (!rs.next()) {
                throw new Exception("OL_W_ID=" + w_id + " OL_D_ID=" + d_id + " OL_O_ID=" + o_id + " (...) not found!");
            }
            stock_count = rs.getLong("stock_count");
            rs.close();
            rs = null;
//            System.out.println("\n Warehouse: ");
//            System.out.println(w_id);
//            System.out.println("\n District:  ");
            stmt.close();
            Logging.trace("\n Stock Level Threshold: " + threshold);
            con.commit();
//            System.out.println("\n Low Stock Count:       ");
            return stock_count;
        } catch (Exception e) {
            Logging.error(" STOCK LEVEL " + e.toString());
        } finally {
            Database.relaseConnection(con);
        }
        return -1;
    }
}