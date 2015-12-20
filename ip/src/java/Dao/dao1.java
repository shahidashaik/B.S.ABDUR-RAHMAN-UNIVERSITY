/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Modal.RegisterModal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author ~PRIYA~
 */
public class dao1 {
     public void insert(RegisterModal c) throws NamingException, SQLException
    {
        DataSource ds=getData();
        Connection con=ds.getConnection();
        PreparedStatement ps=con.prepareStatement("insert into SA.REGISTRATION values(?,?,?,?,?,?,?,?,?)");
        ps.setString(1, c.getName1());
        ps.setString(2, c.getPassword1());
        ps.setString(3, c.getSex1());
        ps.setString(4, c.getAddress1());
        ps.setString(5, c.getState1());
        ps.setString(6, c.getNumber1());
        ps.setString(7, c.getYear1());
        ps.setString(8, c.getEmailid1());
        ps.setString(9, c.getCourse1());
        ps.executeUpdate();
        System.out.println("Record inserted");
    }

    private DataSource getData() throws NamingException {
        Context c = new InitialContext();
        return (DataSource) c.lookup("java:comp/env/Data");
    }

   

   
}
