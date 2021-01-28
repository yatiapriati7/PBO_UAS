/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Konek {
    public static Connection con;
    public static Statement stat;
    
    public void konekmysql(){
        try {
            String url= "jdbc:mysql://localhost:3306/fifa";
            String user= "root";
            String pass= "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            stat=con.createStatement();
            System.out.println("koneksi berhasil");
                         
        } catch (Exception e) {
        System.err.println("koneksi Gagal" + e.getMessage());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Konek test= new Konek();
        test.konekmysql();
        System.exit(0);
    }
    
}
