package com.emi;
import java.sql.*;
class Main{
    public static void main(String args[]){
        try{

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","dba","sql");
            create table artists(
                    id integer not null generated always as identity (start with 1, increment by 1),
            name varchar(100) not null,
                    country varchar(100),
                    primary key (id)
);
            create table albums(
                    id integer not null generated always as identity (start with 1, increment by 1),
            name varchar(100) not null,
                    artist_id integer not null references artists on delete restrict,
                    release_year integer,
                    primary key (id)
);
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from artists");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();

        }catch(Exception e){ System.out.println(e);}

    }
}