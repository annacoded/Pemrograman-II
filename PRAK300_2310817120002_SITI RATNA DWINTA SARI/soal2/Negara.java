package soal2;

import java.util.HashMap;

public class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;

    // Constructor
    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, 
                  int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }

    // Method untuk menampilkan informasi negara
    public void tampilkanInformasi(HashMap<Integer, String> bulanMap) {
        if (jenisKepemimpinan.equalsIgnoreCase("Monarki")) {
            System.out.println("Negara " + nama + " mempunyai Raja bernama " + namaPemimpin);
        } else {
            System.out.println("Negara " + nama + " mempunyai " + jenisKepemimpinan + " bernama " + namaPemimpin);
            String bulan = bulanMap.get(bulanKemerdekaan);
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " " + bulan + " " + tahunKemerdekaan);
        }
    }

    public String getJenisKepemimpinan() {
        return jenisKepemimpinan;
    }
}