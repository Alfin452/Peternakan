/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peternakan;

/**
 *
 * @author muham
 */
public class Ternak extends Peternakan {

    private int idTernak;
    private String namaHewan;
    private int idPenyakit;

    public Ternak(int idPeternakan, String namaPeternakan, String alamatPeternakan, int jumlahHewan, int idTernak, String namaHewan, int idPenyakit) {
        super(idPeternakan, namaPeternakan, alamatPeternakan, jumlahHewan);
        this.idTernak = idTernak;
        this.namaHewan = namaHewan;
        this.idPenyakit = idPenyakit;
    }

    // Getters and setters

    public int getIdTernak() {
        return idTernak;
    }

    public void setIdTernak(int idTernak) {
        this.idTernak = idTernak;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public int getIdPenyakit() {
        return idPenyakit;
    }

    public void setIdPenyakit(int idPenyakit) {
        this.idPenyakit = idPenyakit;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ternak{" +
                "idTernak=" + idTernak +
                ", namaHewan='" + namaHewan + '\'' +
                ", idPenyakit=" + idPenyakit +
                '}';
    }
}
