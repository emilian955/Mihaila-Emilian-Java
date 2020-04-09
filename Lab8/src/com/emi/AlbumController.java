package com.emi;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AlbumController {
    String name;
    Connection con;
    public int artistId;
    public int releaseYear;
    public void setname(String name_) {
        this.name = name_;
    }
    public String getname() {
        return this.name;
    }
    public void setartistId(int artistId_) {
        this.artistId = artistId_;
    }
    public int getartistId() {
        return this.artistId;
    }
    public void setreleaseYear(int releaseYear_) {this.releaseYear = releaseYear_; }
    public int getreleaseYear() { return this.releaseYear; }
    public void create(String name, int artistId, int releaseYear){

    }
    public void findByArtist(int artistId) throws SQLException {
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from albums where artist_id="+this.artistId);
        while(rs.next())
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
        con.close();
    }
}
