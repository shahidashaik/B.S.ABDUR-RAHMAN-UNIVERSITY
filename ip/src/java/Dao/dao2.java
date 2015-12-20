/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Modal.BookModal;
import Modal.RegisterModal;
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
 * @author ~PRIYA~
 */
public class dao2 {
    ResultSet rs, rs1;
    public int count=0;
    public void insert(BookModal c) throws NamingException, SQLException
    {
       
        DataSource ds=getData3();
        Connection con=ds.getConnection();
        PreparedStatement ps1=con.prepareStatement("select * from SA.REGISTRATION where name1=? and mobile1=?");
        ps1.setString(1,c.getName1() );
        ps1.setString(2, c.getNumber1());
        rs=ps1.executeQuery();
        if(rs.next())
        {
            PreparedStatement ps2=con.prepareStatement("select number1 from SA.AVAILABLE where room1=?");
            ps2.setString(1, c.getRoom1());
            rs1=ps2.executeQuery();
            if(rs1.next())
            {
            int number1=rs1.getInt("number1");
            System.out.println("Number1 from dao2"+number1);
            if(number1>1)
            {
                //System.out.println(number1);
                int num1=number1-1;
                PreparedStatement ps3=con.prepareStatement("update SA.AVAILABLE set number1=? where room1=?");
                ps3.setInt(1,num1);
                ps3.setString(2, c.getRoom1());
                ps3.executeUpdate();
                System.out.println("Update successful");
                PreparedStatement ps=con.prepareStatement("insert into SA.BOOK values(?,?,?,?)");
                ps.setString(1, c.getName1());
                ps.setString(2, c.getNumber1());
                ps.setInt(3, c.days1);
                ps.setString(4, c.getRoom1());
                ps.executeUpdate();
                System.out.println("Record inserted");
                count=1;
              }
            }
        }
        
    }

    private DataSource getData3() throws NamingException {
        Context c = new InitialContext();
        return (DataSource) c.lookup("java:comp/env/Data3");
    }

}
