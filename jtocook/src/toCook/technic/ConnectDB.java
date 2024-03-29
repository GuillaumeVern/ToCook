/*=
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toCook.technic;

import java.sql.Connection;
import java.sql.DriverManager;
import toCook.model.Configuration;
import toCook.DAO.ConfigDAO;
//package jtocook.database;

import java.sql.*;

/**
 *
 * @author patick
 */
public class ConnectDB {

    static Connection con;
/* Les méthodes pouvant lever des exceptions doivent inclure une clause throws nom_exception dans leur en-tête.
   Double objectif : la méthode pourra lever l'exception, charge à la méthode appellante de traiter cette exception (propagation).*/
    public static Connection getConnect() throws Exception {
        char[] truc;
        //Connection con = DriverManager.getConnection("jdbc:mysql://mysql-tocook.alwaysdata.net/tocook_bdd?useSSL=false", "tocook", "Btssio82300");
        Configuration c = ConfigDAO.getConfiguration();
        String driver = "com.mysql.cj.jdbc.Driver"; // par defaut
       // if(c.getSgbdSys().equals("mysql")) {
                //driver = "com.mysql.cj.jdbc.Driver";
       /* } else {
                driver = "org.postgresql.Driver";
        }*/
        String url = "jdbc:"+c.getSgbdSys()+"://"+c.getSgbdHost()+":"+c.getSgbdPort()+"/"+c.getSgbdDb();
        if (con == null ) {
            Class.forName(driver);
            con = DriverManager.getConnection(url, c.getSgbdUser(), c.getSgbdPass());
            }
        return con;
    }

}