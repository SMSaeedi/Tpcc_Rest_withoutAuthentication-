package com.example.demo.model;

import com.example.demo.dataBaseConfig.Database;
import com.example.demo.dataBaseConfig.Logging;
import com.example.demo.object.PaymentResult;

import java.sql.*;
import java.util.Date;

public class Payment_Vx212 {

    public PaymentResult paymentTransaction(PaymentModel input) {
        String w_street_1, w_street_2, w_city, w_state, w_zip, w_name;
        String d_street_1, d_street_2, d_city, d_state, d_zip, d_name;
        long namecnt;
        String c_first, c_middle, c_street_1, c_street_2, c_city, c_state, c_zip;
        String c_phone, c_credit = null, c_data = null, c_new_data, h_data;
        double c_credit_lim, c_discount, c_balance = 0;
        java.sql.Date c_since;
        int result;
        Connection con = Database.pickConnection();
        StringBuffer query = null;
        try {
            PreparedStatement ps43 = con.prepareStatement(
                    "UPDATE tpcc_warehouse " +
                    "   SET w_ytd = w_ytd + ?  " +
                    " WHERE w_id = ? ");
            ps43.setDouble(1, input.getH_amount());
            ps43.setString(2, input.getW_id());

            try {
                result = ps43.executeUpdate();
            } catch (SQLException e) {
                throw new Exception("paymentTransaction SQLException " + ps43.toString() + " :" + e.getMessage());
            }
            if (result == 0) {
                throw new Exception("input=" + input+ " not found!");
            }
            PreparedStatement ps57 = con.prepareStatement(
                    "SELECT w_street_1, w_street_2, w_city, w_state, w_zip, w_name" +
                    "  FROM tpcc_warehouse" +
                    " WHERE w_id = ? ");
            ps57.setString(1, input.getW_id());

            ResultSet rs = ps57.executeQuery();
            if (!rs.next()) {
                throw new Exception("input=" + input+ " not found!");
            }
            w_street_1 = rs.getString("w_street_1");
            w_street_2 = rs.getString("w_street_2");
            w_city = rs.getString("w_city");
            w_state = rs.getString("w_state");
            w_zip = rs.getString("w_zip");
            w_name = rs.getString("w_name");
            rs.close();
            rs = null;
            PreparedStatement ps78 = con.prepareStatement(
                    "UPDATE tpcc_district " +
                    "   SET d_ytd = d_ytd + ? " +
                    " WHERE d_w_id =  ? " +
                    "   AND d_id =  ? ");
            ps78.setDouble(1, input.getH_amount());
            ps78.setString(2, input.getW_id());
            ps78.setString(3, input.getD_id());

            result = ps78.executeUpdate();
            if (result == 0) {
                throw new Exception("input=" + input + " not found!");
            }
            PreparedStatement ps91 = con.prepareStatement(
                    "SELECT d_street_1, d_street_2, d_city, d_state, d_zip, d_name " +
                    "  FROM tpcc_district " +
                    " WHERE d_w_id = ? " +
                    "   AND d_id = ? ");
            ps91.setString(1, input.getW_id());
            ps91.setString(2, input.getD_id());

            rs = ps91.executeQuery();
            if (!rs.next()) {
                throw new Exception("input=" + input+ " not found!");
            }
            d_street_1 = rs.getString("d_street_1");
            d_street_2 = rs.getString("d_street_2");
            d_city = rs.getString("d_city");
            d_state = rs.getString("d_state");
            d_zip = rs.getString("d_zip");
            d_name = rs.getString("d_name");
            rs.close();
            rs = null;
            if (input.isC_by_name()) {
                PreparedStatement ps115 = con.prepareStatement(
                        "SELECT count(c_id) AS namecnt " +
                        "  FROM tpcc_customer " +
                        " WHERE c_last = ? " +
                        "   AND c_d_id = ? " +
                        "   AND c_w_id = ? ");
                ps115.setString(1, input.getC_last());
                ps115.setString(2, input.getC_d_id());
                ps115.setString(3, input.getC_w_id());

                rs = ps115.executeQuery();
                if (!rs.next()) {
                    throw new Exception("input=" + input+ " not found!");
                }
                namecnt = rs.getLong("namecnt");
                rs.close();
                rs = null;
                PreparedStatement ps136 = con.prepareStatement(
                        "SELECT c_first, c_middle, c_id, " +
                        " c_street_1, c_street_2, c_city, c_state, c_zip, " +
                        " c_phone, c_credit, c_credit_lim, " +
                        " c_discount, c_balance, c_since " +
                        "  FROM tpcc_customer " +
                        " WHERE c_w_id = ? " +
                        "   AND c_d_id = ? " +
                        "   AND c_last = ? " +
                        " ORDER BY c_first ASC");
                ps136.setString(1, input.getC_w_id());
                ps136.setString(2, input.getC_d_id());
                ps136.setString(3, input.getC_last());

                rs = ps136.executeQuery();
                if (!rs.next()) {
                    throw new Exception("input=" + input+ " not found!");
                }
                if (namecnt % 2 == 1) {
                    namecnt++;
                }
                for (int i = 1; i < namecnt / 2; i++) {
                    rs.next();
                }
                input.setC_id( Long.toString(rs.getLong("c_id")));
                c_first = rs.getString("c_first");
                c_middle = rs.getString("c_middle");
                c_street_1 = rs.getString("c_street_1");
                c_street_2 = rs.getString("c_street_2");
                c_city = rs.getString("c_city");
                c_state = rs.getString("c_state");
                c_zip = rs.getString("c_zip");
                c_phone = rs.getString("c_phone");
                c_credit = rs.getString("c_credit");
                c_credit_lim = rs.getDouble("c_credit_lim");
                c_discount = rs.getDouble("c_discount");
                c_balance = rs.getDouble("c_balance");
                c_since = rs.getDate("c_since");
                rs.close();
                rs = null;
            } else {
                PreparedStatement ps177 = con.prepareStatement(
                        "SELECT c_first, c_middle, c_last, " +
                        " c_street_1, c_street_2, c_city, c_state, c_zip, " +
                        " c_phone, c_credit, c_credit_lim, " +
                        " c_discount, c_balance, c_since " +
                        "  FROM tpcc_customer " +
                        " WHERE c_w_id = ? " +
                        "   AND c_d_id = ? " +
                        "   AND c_id = ? ");
                ps177.setString(1, input.getC_w_id());
                ps177.setString(2, input.getC_d_id());
                ps177.setString(3, input.getC_id());

                rs = ps177.executeQuery();
                if (!rs.next()) {
                    throw new Exception("input=" + input+ " not found!");
                }
                input.setC_last( rs.getString("c_last"));
                c_first = rs.getString("c_first");
                c_middle = rs.getString("c_middle");
                c_street_1 = rs.getString("c_street_1");
                c_street_2 = rs.getString("c_street_2");
                c_city = rs.getString("c_city");
                c_state = rs.getString("c_state");
                c_zip = rs.getString("c_zip");
                c_phone = rs.getString("c_phone");
                c_credit = rs.getString("c_credit");
                c_credit_lim = rs.getDouble("c_credit_lim");
                c_discount = rs.getDouble("c_discount");
                c_balance = rs.getDouble("c_balance");
                c_since = rs.getDate("c_since");
                rs.close();
                rs = null;
            }
            c_balance += input.getH_amount();
            Logging.trace("input=" + input + "   c_credit: " + c_credit);
            if (c_credit.equals("BC")) {
                Statement stmt = Database.createStatement(con);
                query = new StringBuffer();
                query.append("SELECT c_data");
                query.append(" FROM tpcc_customer");
                query.append(" WHERE c_w_id = '");
                query.append(input.getC_w_id());
                query.append("' AND c_d_id = '");
                query.append(input.getC_d_id());
                query.append("' AND c_id = '");
                query.append(input.getC_id()).append("'");
                rs = stmt.executeQuery(query.toString());
                if (!rs.next()) {
                    throw new Exception("input=" + input+ " not found!");
                }
                c_data = rs.getString("c_data");
                rs.close();
                stmt.close();
                rs = null;
                c_new_data = "'" + input.getC_id() + "' '" + input.getC_d_id() + "' '" + input.getC_w_id() + "' '" + input.getC_d_id() + "' '" + input.getC_w_id() + "' " + input.getH_amount() + " |";
                if (c_data.length() > c_new_data.length()) {
                    c_new_data += c_data.substring(0, c_data.length() - c_new_data.length());
                } else {
                    c_new_data += c_data;
                }
                if (c_new_data.length() > 500) {
                    c_new_data = c_new_data.substring(0, 500);
                }
                PreparedStatement ps241 = con.prepareStatement(
                        "UPDATE tpcc_customer " +
                        "   SET c_balance = ?, c_data = ? " +
                        " WHERE c_w_id = ? " +
                        "   AND c_d_id = ? " +
                        "   AND c_id = ? ");
                ps241.setDouble(1, c_balance);
                ps241.setString(2, c_new_data);
                ps241.setString(3, input.getC_w_id());
                ps241.setString(4, input.getC_d_id());
                ps241.setString(5, input.getC_id());

                result = ps241.executeUpdate();
                if (result == 0) {
                    throw new Exception("input=" + input+ " not found!");
                }
            } else {
                PreparedStatement ps257 = con.prepareStatement(
                        "UPDATE tpcc_customer " +
                        "   SET c_balance = ?" +
                        " WHERE c_w_id = ?" +
                        "   AND c_d_id = ?" +
                        "   AND c_id = ?");
                ps257.setDouble(1, c_balance);
                ps257.setString(3, input.getC_w_id());
                ps257.setString(4, input.getC_d_id());
//                ps257.setString(5, c_id);

                result = ps257.executeUpdate();
                if (result == 0) {
                    throw new Exception("input=" + input+ " not found!");
                }
            }
            if (w_name.length() > 10) {
                w_name = w_name.substring(0, 10);
            }
            if (d_name.length() > 10) {
                d_name = d_name.substring(0, 10);
            }
            h_data = w_name + "    " + d_name;
            PreparedStatement ps290 = con.prepareStatement(
                    "INSERT INTO tpcc_history " +
                    "   (h_c_d_id, h_c_w_id, h_c_id, " +
                    "      h_d_id, h_w_id, h_date, " +
                    "      h_amount, h_data)" +
                    "VALUES (?, ?, ?, ?, ?, SYSDATE, ?, ?)");

            ps290.setString(1, input.getC_d_id());
            ps290.setString(2, input.getC_w_id());
            ps290.setString(3, input.getC_id());
            ps290.setString(4, input.getD_id());
            ps290.setString(5, input.getW_id());
            ps290.setDouble(6, input.getH_amount());
            ps290.setString(7, h_data);
            ps290.executeUpdate();
            con.commit();

            PaymentResult pr = new PaymentResult(input.getW_id(), w_street_1, w_street_2,
                    w_city, w_state, w_zip, input.getD_id(), d_street_1, d_street_2, d_city,
                    d_state, d_zip, input.getC_id(), c_first, c_middle, input.getC_last(), c_street_1,
                    c_street_2, c_city, c_state, c_zip, new Date(c_since.getTime()), c_credit,
                    c_discount, c_phone, input.getH_amount(), c_credit_lim, c_balance, c_data);
            return pr;
        } catch (Exception e) {
            Logging.error(e.toString());
            try {
                con.rollback();
            } catch (Exception e1) {
                Logging.trace("PAYMENT-ROLLBACK" + e1);
            }
        } finally {
            Database.relaseConnection(con);
        }
        return null;
    }
}