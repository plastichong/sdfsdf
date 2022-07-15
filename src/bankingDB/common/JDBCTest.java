package bankingDB.common;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBCTest {
    public static void main(String[] args) {

        Connection conn = JDBCUtil.getConnection();
        System.out.println(conn);
    }
}
