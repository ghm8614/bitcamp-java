package com.bitcamp.web.java.servlet.day02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// Ư�� DBMS �� ���������� ���� DAO
public class UserInitParamDao {

    //F
    private String jdbcDriver;
    private String jdbcURL;
    private String jdbcUser;
    private String jdbcPassword;

    //C
    public UserInitParamDao() {
    }

    //M
    public void setJdbcDriver(String jdbcDriver) {
        this.jdbcDriver = jdbcDriver;
    }

    public void setJdbcURL(String jdbcURL) {
        this.jdbcURL = jdbcURL;
    }

    public void setJdbcUser(String jdbcUser) {
        this.jdbcUser = jdbcUser;
    }

    public void setJdbcPassword(String jdbcPassword) {
        this.jdbcPassword = jdbcPassword;
    }

    public void getUser(UserVO userVO) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // 1.
            Class.forName(jdbcDriver);
            con = DriverManager.getConnection(jdbcURL, jdbcURL, jdbcPassword);

            // 2.
            pstmt = con.prepareStatement("SELECT id, pwd FROM users WHERE id=? AND pwd=?");
            pstmt.setString(1, userVO.getId());
            pstmt.setString(2, userVO.getPwd());

            // 3.
            rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("db���� Ȯ�� �� id, pwd ->" + userVO.getId() + " : " + userVO.getPwd());
                // data�� �����ϸ�
                userVO.setActive(true);
            } else {
                System.out.println("db�� <" + userVO.getId() + ">�� �ش��ϴ� �ڷᰡ �����ϴ�.");
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

        }//end of finally

    }//end of getUser()

}//end of class
