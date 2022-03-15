package com.bitcamp.web.java.servlet.day02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {

    //F
    private String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
    private String dbuser = "scott";
    private String dbpwd = "tiger";

    //C
    public UserDao() {

    }

    //M
    public void getUser(UserVO userVO) {

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // 1.
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(dburl, dbuser, dbpwd);

            // 2.
            pstmt = con.prepareStatement("SELECT id, pwd FROM users WHERE id=? AND pwd=?");
            pstmt.setString(1, userVO.getId());
            pstmt.setString(2, userVO.getPwd());

            // 3.
            rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("db에서 확인 한 id, pwd ->" + userVO.getId() + " : " + userVO.getPwd());
                userVO.setActive(true);
            } else {
                System.out.println("db에 <" + userVO.getId() + ">에 해당하는 자료가 없습니다.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e1) {
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (Exception e2) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (Exception e3) {
                }
            }

        }

    }//end of getUser()

}//end of class
