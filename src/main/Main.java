/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import peternakan.Ternak;
import CRUD.database1;

/**
 *
 * @author muham
 */
    public class Main {

//    private static Scanner scanner = new Scanner(System.in);
//    private static List<Ternak> daftarTernak = new ArrayList<>();

    public static void main(String[] args) {
        database1 dbConnect = new database1();
//        dbConnect.simpanUji("2210010359", "Muhammad Alfin", "085435662716", "Jl.Kecubung");
//        dbConnect.ubahUji("2210010359", "Muhammad Arull", "085435662716", "Jl.Sunglut");
//        dbConnect.hapusUji("2210010359", "", "", "");
//        
//        dbConnect.simpanPenyakit(100, "demam", "badan hewan lemas", "diberi pakan yang bersih", "10px");
//        dbConnect.ubahPenyakit(100, "batuk", "batuk berdahak", "diberi obat komik", "10px");
//        dbConnect.hapusPenyakit(100, "", "", "", "");
//        dbConnect.dataPenyakit();
//        dbConnect.cariPenyakit(100);

//        dbConnect.simpanPeternak(111, "Arull", "086766535344", "arull@gmail.com", 100);
//        dbConnect.ubahPeternak(111, "Alfin", "087555377837", "alfin@gmail.com", 100);
//        dbConnect.hapusPeternak(111, "", "", "", 0);
//        dbConnect.dataPeternak();
//        dbConnect.cariPeternak(111);

//        dbConnect.simpanPeternakan(1, "peternakan kucing", "Jl.Kecubung", 3, 111, "verified");
//        dbConnect.ubahPeternakan(1, "peternakan lundu", "Jl.Kecubung", 3, 111, "non verified");
//        dbConnect.hapusPeternakan(1, "", "", 0, 0, "");
//        dbConnect.dataPeternakan();
//        dbConnect.cariPeternakan(1);

//        dbConnect.simpanTernak(11, "Kucing Kampung", 100);
//        dbConnect.ubahTernak(11, "Kucing AnggoraXKampung", 100);
//        dbConnect.hapusTernak(11, "", 0);
//        dbConnect.dataTernak();
        dbConnect.cariTernak(11);


        

    }
//        tampilMenuUtama();
    }

//    private static void tampilMenuUtama() {
//        while (true) {
//            System.out.println("\n*Menu Peternakan*");
//            System.out.println("1. Input Data Ternak");
//            System.out.println("2. Tampilkan Data Ternak");
//            System.out.println("3. Keluar");
//            System.out.print("Pilih menu: ");
//
//            try {
//                int pilihan = scanner.nextInt();
//                scanner.nextLine(); // Consuming newline character
//
//                switch (pilihan) {
//                    case 1:
//                        inputDataTernak();
//                        break;
//                    case 2:
//                        tampilDataTernak();
//                        break;
//                    case 3:
//                        System.out.println("Keluar dari program.");
//                        System.exit(0);
//                    default:
//                        System.out.println("Pilihan tidak valid. Silahkan pilih menu 1-3.");
//                }
//            } catch (InputMismatchException e) {
//                System.out.println("Input tidak valid. Silahkan masukkan angka.");
//                scanner.nextLine(); // Consuming invalid input
//            }
//        }
//    }
//
//    private static void inputDataTernak() {
//        System.out.println("\n*Input Data Ternak*");
//
//        try {
//            System.out.print("ID Peternakan: ");
//            int idPeternakan = scanner.nextInt();
//            scanner.nextLine();
//
//            System.out.print("Nama Peternakan: ");
//            String namaPeternakan = scanner.nextLine();
//
//            System.out.print("Alamat Peternakan: ");
//            String alamatPeternakan = scanner.nextLine();
//
//            System.out.print("Jumlah Hewan: ");
//            int jumlahHewan = scanner.nextInt();
//            scanner.nextLine();
//
//            System.out.print("ID Ternak: ");
//            int idTernak = scanner.nextInt();
//            scanner.nextLine();
//
//            System.out.print("Nama Hewan: ");
//            String namaHewan = scanner.nextLine();
//
//            System.out.print("ID Penyakit (0 jika tidak ada penyakit): ");
//            int idPenyakit = scanner.nextInt();
//            scanner.nextLine();
//
//            Ternak ternakBaru = new Ternak(idPeternakan, namaPeternakan, alamatPeternakan, jumlahHewan, idTernak, namaHewan, idPenyakit);
//            daftarTernak.add(ternakBaru);
//
//            System.out.println("Data ternak baru berhasil ditambahkan.");
//        } catch (InputMismatchException e) {
//            System.out.println("Input tidak valid. Silahkan masukkan angka untuk ID Peternakan, Jumlah Hewan, ID Ternak, dan ID Penyakit.");
//            scanner.nextLine(); // Consuming invalid input
//        }
//    }
//
//    private static void tampilDataTernak() {
//        if (daftarTernak.isEmpty()) {
//            System.out.println("\nBelum ada data ternak yang diinputkan.");
//            return;
//        }
//
//        System.out.println("\n*Daftar Data Ternak*");
//        for (Ternak ternak : daftarTernak) {
//            System.out.println(ternak);
//        }
//    }
//}

