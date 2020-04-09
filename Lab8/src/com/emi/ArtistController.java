package com.emi;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ArtistController {
    int id;
    String name;
    String country;
    Connection con;
    public void setname(String name_) {
        this.name = name_;
    }
    public void setname(int id_) {
        this.id = id_;
    }
    public void setcountry(String country_){this.country=country_;}
    public String getname() {
        return this.name;
    }
    public String getcountry(){return this.country;}
    public void create(String name, String country){
        String query = " insert into users (id, name, country)"
                + " values ("+this.id+", "+name+", "+country+")";
    }
    public void findByName(String name) throws SQLException {
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from artists where name="+this.name);
        while(rs.next())
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
        con.close();
    }
}
