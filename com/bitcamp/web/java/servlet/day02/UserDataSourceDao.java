package com.bitcamp.web.java.servlet.day02;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// Connection Pool 을 SPEC화 한 javax.sql.DataSource 사용
public class UserDataSourceDao {

    //    F
    //    String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
    //    String dbuser = "scott";
    //    String dbpwd = "tiger";

    //C
    public UserDataSourceDao() {
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
            // con = OracleConnectionPool.getInstance().getConnection();


            //=============================================
            // DataSource 에서 connection GET
            InitialContext ic = new InitialContext();
            DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/ora");
            // java:comp : naming service root
            // env : enviroment
            // jdbc/ora : server.xml 에 등록된 name
            con = ds.getConnection();
            //=============================================


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
