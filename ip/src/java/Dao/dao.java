/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Modal.LoginModal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author 1070
 */
public class dao {
     
    public int count=0;
    public void insert(LoginModal c) throws NamingException, SQLException
    {
        DataSource ds=getData();
        Connection con=ds.getConnection();
        PreparedStatement ps=con.prepareStatement("select * from SA.REGISTRATION where name1=? and password1=?");
        ps.setString(1, c.getName());
        ps.setString(2, c.getPassword());
        ResultSet rs;
       rs= ps.executeQuery();
        if(rs.next())
              {
                  count=1;
              }
        System.out.println("Welcome");
        System.out.println("============================="+count);
    }

    private DataSource getData() throws NamingException {
        Context c = new InitialContext();
        return (DataSource) c.lookup("java:comp/env/Data");
    }

    

    
    
}
