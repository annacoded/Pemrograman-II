package soal2;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Negara> negaraList = new LinkedList<>();
        HashMap<Integer, String> bulanMap = new HashMap<>();

        // Mengisi HashMap dengan nama bulan
        bulanMap.put(1, "Januari");
        bulanMap.put(2, "Februari");
        bulanMap.put(3, "Maret");
        bulanMap.put(4, "April");
        bulanMap.put(5, "Mei");
        bulanMap.put(6, "Juni");
        bulanMap.put(7, "Juli");
        bulanMap.put(8, "Agustus");
        bulanMap.put(9, "September");
        bulanMap.put(10, "Oktober");
        bulanMap.put(11, "November");
        bulanMap.put(12, "Desember");

    
        System.out.print("Jumlah negara: ");
        int jumlahNegara = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < jumlahNegara; i++) {
            System.out.print("Nama negara: ");
            String nama = scanner.nextLine();
            System.out.print("Jenis kepemimpinan: ");
            String jenisKepemimpinan = scanner.nextLine();
            System.out.print("Nama pemimpin: ");
            String namaPemimpin = scanner.nextLine();

            int tanggalKemerdekaan = 0;
            int bulanKemerdekaan = 0;
            int tahunKemerdekaan = 0;

            if (!jenisKepemimpinan.equalsIgnoreCase("Monarki")) {
                System.out.print("Tanggal kemerdekaan: ");
                tanggalKemerdekaan = scanner.nextInt();
                System.out.print("Bulan kemerdekaan (1-12): ");
                bulanKemerdekaan = scanner.nextInt();
                System.out.print("Tahun kemerdekaan: ");
                tahunKemerdekaan = scanner.nextInt();
                scanner.nextLine(); 
            }

            Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin,
                    tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            negaraList.add(negara);
            System.out.println(); // Menambah baris kosong antara input negara
        }

        for (Negara negara : negaraList) {
            negara.tampilkanInformasi(bulanMap);
            System.out.println(); // Menambah baris kosong antara output negara
        }
    }
}
        