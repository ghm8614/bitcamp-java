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

    // DB ���� Data �˻� ��
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

                System.out.println("db���� Ȯ�� �� id, pwd ->" + id + " : " + str);
            } else {
                System.out.println("db����  <" + id + ">�� �ش��ϴ� �ڷᰡ �����ϴ�.");
            }

            //ȸ�� ������ Ȯ���ϰ� ȸ���̸� true, �ƴϸ� false return
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
