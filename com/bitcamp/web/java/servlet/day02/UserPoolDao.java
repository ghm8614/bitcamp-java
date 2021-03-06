package com.bitcamp.web.java.servlet.day02;

import jw.common.pool.OracleConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// JDBC 절차 중 Connection 인스턴스 생성 및 관리를 전담하는 Connection Pool 사용
public class UserPoolDao {

//    F
//    private String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//    private String dbuser = "scott";
//    private String dbpwd = "tiger";

    //C
    public UserPoolDao() {
    }

    //M
    public void getUser(UserVO userVO) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // 1.
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            //con = DriverManager.getConnection(dburl, dbuser, dbpwd);

            // OracleConnectionPool 로 부터 Connection 인스턴스 GET
            con = OracleConnectionPool.getInstance().getConnection();

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

        }//end of finally

    }//end of getUser()

}//end of class
