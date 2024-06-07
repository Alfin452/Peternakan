/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peternakan;

/**
 *
 * @author muham
 */
public class Peternakan {

    private int idPeternakan;
    private String namaPeternakan;
    private String alamatPeternakan;
    private int jumlahHewan;

    public Peternakan(int idPeternakan, String namaPeternakan, String alamatPeternakan, int jumlahHewan) {
        this.idPeternakan = idPeternakan;
        this.namaPeternakan = namaPeternakan;
        this.alamatPeternakan = alamatPeternakan;
        this.jumlahHewan = jumlahHewan;
    }

    // Getters and setters

    public int getIdPeternakan() {
        return idPeternakan;
    }

    public void setIdPeternakan(int idPeternakan) {
        this.idPeternakan = idPeternakan;
    }

    public String getNamaPeternakan() {
        return namaPeternakan;
    }

    public void setNamaPeternakan(String namaPeternakan) {
        this.namaPeternakan = namaPeternakan;
    }

    public String getAlamatPeternakan() {
        return alamatPeternakan;
    }

    public void setAlamatPeternakan(String alamatPeternakan) {
        this.alamatPeternakan = alamatPeternakan;
    }

    public int getJumlahHewan() {
        return jumlahHewan;
    }

    public void setJumlahHewan(int jumlahHewan) {
        this.jumlahHewan = jumlahHewan;
    }

    @Override
    public String toString() {
        return "Peternakan{" +
                "idPeternakan=" + idPeternakan +
                ", namaPeternakan='" + namaPeternakan + '\'' +
                ", alamatPeternakan='" + alamatPeternakan + '\'' +
                ", jumlahHewan=" + jumlahHewan +
                '}';
    }
}