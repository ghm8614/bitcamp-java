package com.bitcamp.web.java.servlet.day02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbBean {

    //F
    private String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
    private String dbuser = "scott";
    private String dbpwd = "tiger";
    private String id;
    private String pwd;

    //C
    public DbBean() {

    }

    //M
    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    // DB 접근 Data 검색 비교
    public boolean getUser() {

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // 1.
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(dburl, dbuser, dbpwd);

            // 2.
            pstmt = con.prepareStatement("SELECT id, pwd FROM users WHERE id=?");
            pstmt.setString(1, id);

            // 3.
            rs = pstmt.executeQuery();
            String str = null;

            if (rs.next()) {
                str = rs.getString("pwd");

                System.out.println("db에서 확인 한 id, pwd ->" + id + " : " + str);
            } else {
                System.out.println("db에서  <" + id + ">에 해당하는 자료가 없습니다.");
            }

            //회원 유무를 확인하고 회원이면 true, 아니면 false return
            if (str != null && str.equals(pwd)) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false; //
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
