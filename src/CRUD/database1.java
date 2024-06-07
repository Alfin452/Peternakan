/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author muham
 */
public class database1 {
    private String databaseName = "muhammad_alfin_nur_huda_2210010359";
    private String username = "root";
    private String password = "";
    
    public Connection connectionDB;
    
    public database1 () {
        try {
            String location = "jdbc:mysql://localhost/" + databaseName;
            Class.forName("com.mysql.jdbc.Driver");
            connectionDB = DriverManager.getConnection(location, username, password);
            System.out.println("sistem terkoneksi");
        } 
        catch (Exception e) {
           System.out.println(e.getMessage());
       }
   }
    public void simpanUji(String nik, String nama, String telp, String alamat){
        try{
            String sql = "insert into uji (nik, nama, telp, alamat) value(?,?,?,?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nik);
            perintah.setString(2, nama);
            perintah.setString(3, telp);
            perintah.setString(4, alamat);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void ubahUji(String nik, String nama, String telp, String alamat){
        try{
            String sql = "update uji set nama = ?, telp = ?, alamat = ? where nik = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama);
            perintah.setString(2, telp);
            perintah.setString(3, alamat);
            perintah.setString(4, nik);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void hapusUji(String nik, String nama, String telp, String alamat){
        try{
            String sql = "delete from uji where nik = ? ";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nik);
            perintah.executeUpdate();
            System.out.println("Data Berhasil dihapus");
        }
        catch(Exception e){
            System.out.println(e.getMessage());        
        }
    }
    public void simpanPenyakit (int id_penyakit, String nama_penyakit, String ciri, String penanggulangan, String radius) {
        try{
            String sql = "insert into penyakit (id_penyakit, nama_penyakit, ciri, penanggulangan, radius) value(?,?,?,?,?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_penyakit);
            perintah.setString(2, nama_penyakit);
            perintah.setString(3, ciri);
            perintah.setString(4, penanggulangan);
            perintah.setString(5, radius);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }
        public void ubahPenyakit (int id_penyakit, String nama_penyakit, String ciri, String penanggulangan, String radius) {
        try{
            String sql = "update penyakit set nama_penyakit = ?, ciri = ?, penanggulangan = ?, radius = ? where id_penyakit = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama_penyakit);
            perintah.setString(2, ciri);
            perintah.setString(3, penanggulangan);
            perintah.setString(4, radius);
            perintah.setInt(5, id_penyakit);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }
         public void hapusPenyakit (int id_penyakit, String nama_penyakit, String ciri, String penanggulangan, String radius) {
        try{
            String sql = "delete from penyakit where id_penyakit = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_penyakit);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }   
     public void dataPenyakit(){
         try {
             Statement stmt = connectionDB.createStatement();
             ResultSet baris = stmt.executeQuery("select * from penyakit ORDER BY id_penyakit ASC");
             while(baris.next()){
                 System.out.println(baris.getInt("id_penyakit")+" | "+
                         baris.getString("nama_penyakit")+" | "+
                         baris.getString("ciri")+" | "+
                         baris.getString("penanggulangan")+" | "+
                         baris.getString("radius"));
             }
         } 
         catch (Exception e) {
             System.err.println(e.getMessage());
         }
     }
     public void cariPenyakit(Integer paramiPenyakit){
         try {
             String sql = "select * from penyakit where id_penyakit = ?";
             PreparedStatement perintah = connectionDB.prepareStatement (sql);
             perintah.setInt(1, paramiPenyakit);
             ResultSet data = perintah.executeQuery();
             while (data.next()){
                 System.out.println("id : "+data.getInt("id_penyakit"));
                 System.out.println("penyakit "+data.getString("nama_penyakit"));
                 System.out.println("ciri  "+data.getString("ciri"));
                 System.out.println("penanggulangan "+data.getString("penanggulangan"));
                 System.out.println("radius : "+data.getInt("radius"));
             }
         } 
         catch (Exception e) {
         }
     }
     public void simpanPeternak (int id_peternak, String nama_peternak, String hp_peternak, String email_peternak, int id_peternakan) {
        try{
            String sql = "insert into peternak (id_peternak, nama_peternak, hp_peternak, email_peternak, id_peternakan) value(?,?,?,?,?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_peternak);
            perintah.setString(2, nama_peternak);
            perintah.setString(3, hp_peternak);
            perintah.setString(4, email_peternak);
            perintah.setInt(5, id_peternak);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }    
    public void ubahPeternak (int id_peternak, String nama_peternak, String hp_peternak, String email_peternak, int id_peternakan) {
        try{
            String sql = "update peternak set nama_peternak = ?, hp_peternak = ?, email_peternak = ?, id_peternakan = ? where id_peternak = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama_peternak);
            perintah.setString(2, hp_peternak);
            perintah.setString(3, email_peternak);
            perintah.setInt(4, id_peternak);
            perintah.setInt(5, id_peternak);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
    } 
    public void hapusPeternak (int id_peternak, String nama_peternak, String hp_peternak, String email_peternak, int id_peternakan) {
        try{
            String sql = "delete from peternak where id_peternak = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_peternak);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }
    public void dataPeternak(){
         try {
             Statement stmt = connectionDB.createStatement();
             ResultSet baris = stmt.executeQuery("select * from peternak ORDER BY id_peternak ASC");
             while(baris.next()){
                 System.out.println(baris.getInt("id_peternak")+" | "+
                         baris.getString("nama_peternak")+" | "+
                         baris.getString("hp_peternak")+" | "+
                         baris.getString("email_peternak")+" | "+
                         baris.getString("id_peternakan"));
             }
         } 
         catch (Exception e) {
             System.err.println(e.getMessage());
         }
     }
    public void cariPeternak(Integer paramiPeternak){
         try {
             String sql = "select * from peternak where id_peternak = ?";
             PreparedStatement perintah = connectionDB.prepareStatement (sql);
             perintah.setInt(1, paramiPeternak);
             ResultSet data = perintah.executeQuery();
             while (data.next()){
                 System.out.println("id : "+data.getInt("id_peternak"));
                 System.out.println("peternak "+data.getString("nama_peternak"));
                 System.out.println("no hp "+data.getString("hp_peternak"));
                 System.out.println("email "+data.getString("email_peternak"));
                 System.out.println("id_peternakan : "+data.getInt("id_peternakan"));
             }
         } 
         catch (Exception e) {
         }
     }
    public void simpanPeternakan (int id_peternakan, String nama_peternakan, String alamat_peternakan, int jumlah, int id_ternak, String verified) {
        try{
            String sql = "insert into peternakan (id_peternakan, nama_peternakan, alamat_peternakan, jumlah, id_ternak, verified) value(?,?,?,?,?,?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_peternakan);
            perintah.setString(2, nama_peternakan);
            perintah.setString(3, alamat_peternakan);
            perintah.setInt(4, jumlah);
            perintah.setInt(5, id_ternak);
            perintah.setString(6, verified);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }   
    public void ubahPeternakan (int id_peternakan, String nama_peternakan, String alamat_peternakan, int jumlah, int id_ternak, String verified) {
        try{
            String sql = "update peternakan set nama_peternakan = ?, alamat_peternakan = ?, jumlah = ?, id_ternak = ?, verified = ? where id_peternakan = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama_peternakan);
            perintah.setString(2, alamat_peternakan);
            perintah.setInt(3, jumlah);
            perintah.setInt(4, id_ternak);
            perintah.setString(5, verified);
            perintah.setInt(6, id_peternakan);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
    } 
    public void hapusPeternakan (int id_peternakan, String nama_peternakan, String alamat_peternakan, int jumlah, int id_ternak, String verified) {
        try{
            String sql = "delete from peternakan where id_peternakan = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_peternakan);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }
    public void dataPeternakan(){
         try {
             Statement stmt = connectionDB.createStatement();
             ResultSet baris = stmt.executeQuery("select * from peternakan ORDER BY id_peternakan ASC");
             while(baris.next()){
                 System.out.println(baris.getInt("id_peternakan")+" | "+
                         baris.getString("nama_peternakan")+" | "+
                         baris.getString("alamat_peternakan")+" | "+
                         baris.getInt("jumlah")+" | "+
                         baris.getInt("id_ternak")+" | "+
                         baris.getString("verified"));
             }
         } 
         catch (Exception e) {
             System.err.println(e.getMessage());
         }
     }
    public void cariPeternakan(Integer paramiPeternakan){
         try {
             String sql = "select * from peternakan where id_peternakan = ?";
             PreparedStatement perintah = connectionDB.prepareStatement (sql);
             perintah.setInt(1, paramiPeternakan);
             ResultSet data = perintah.executeQuery();
             while (data.next()){
                 System.out.println("id : "+data.getInt("id_peternakan"));
                 System.out.println("peternakan "+data.getString("nama_peternakan"));
                 System.out.println("alamat "+data.getString("alamat_peternakan"));
                 System.out.println("jumlah : "+data.getInt("jumlah"));
                 System.out.println("id_ternak : "+data.getInt("id_ternak"));
                 System.out.println("verified "+data.getString("verified"));
             }
         } 
         catch (Exception e) {
         }
     }
    
    public void simpanTernak (int id_ternak, String nama_hewan, int id_penyakit) {
        try{
            String sql = "insert into ternak (id_ternak, nama_hewan, id_penyakit) value(?,?,?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_ternak);
            perintah.setString(2, nama_hewan);
            perintah.setInt(3, id_penyakit);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }  
    public void ubahTernak (int id_ternak, String nama_hewan, int id_penyakit) {
        try{
            String sql = "update ternak set nama_hewan = ?, id_penyakit = ? where id_ternak = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama_hewan);
            perintah.setInt(2, id_penyakit);
            perintah.setInt(3, id_ternak);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
    } 
    public void hapusTernak (int id_ternak, String nama_hewan, int id_penyakit) {
        try{
            String sql = "delete from ternak where id_ternak = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_ternak);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }
    public void dataTernak(){
         try {
             Statement stmt = connectionDB.createStatement();
             ResultSet baris = stmt.executeQuery("select * from ternak ORDER BY id_ternak ASC");
             while(baris.next()){
                 System.out.println(baris.getInt("id_ternak")+" | "+
                         baris.getString("nama_hewan")+" | "+
                         baris.getString("id_penyakit"));
             }
         } 
         catch (Exception e) {
             System.err.println(e.getMessage());
         }
     }
    public void cariTernak(Integer paramiTernak){
         try {
             String sql = "select * from ternak where id_ternak = ?";
             PreparedStatement perintah = connectionDB.prepareStatement (sql);
             perintah.setInt(1, paramiTernak);
             ResultSet data = perintah.executeQuery();
             while (data.next()){
                 System.out.println("id : "+data.getInt("id_ternak"));
                 System.out.println("nama_hewan "+data.getString("nama_hewan"));
                 System.out.println("Id_penyakit : "+data.getString("id_penyakit"));
             }
         } 
         catch (Exception e) {
         }
     }
    
}

