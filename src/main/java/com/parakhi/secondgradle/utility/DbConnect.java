package com.parakhi.secondgradle.utility;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


public class DbConnect {

	Connection conn = null;
    PreparedStatement stmt;

    public void open() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/springtest_db", "root", "1234");

    }
    public  PreparedStatement initStatement(String sql) throws SQLException{
    stmt=(PreparedStatement) conn.prepareStatement(sql);
    return stmt;
    
    }
    public int executeUpdate(PreparedStatement stmt) throws SQLException{
    return stmt.executeUpdate();
    }
    public ResultSet executeQuery(PreparedStatement stmt) throws SQLException{
     return stmt.executeQuery();
    }

    public void close() throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
            conn = null;

        }

    }
	
}
