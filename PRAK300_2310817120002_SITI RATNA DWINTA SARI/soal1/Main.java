package soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner untuk membaca input dari user
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah dadu
        int jumlahDadu = scanner.nextInt();

        // Membuat LinkedList untuk menyimpan objek Dadu
        LinkedList<Dadu> daftarDadu = new LinkedList<>();

        // Menambahkan objek Dadu ke dalam LinkedList
        for (int i = 0; i < jumlahDadu; i++) {
            Dadu daduBaru = new Dadu(); // Membuat objek Dadu baru
            daftarDadu.add(daduBaru);   // Menambahkan objek Dadu ke LinkedList
        }
        // Menampilkan nilai masing-masing dadu
        int totalNilai = 0;
        for (int i = 0; i < daftarDadu.size(); i++) {
            Dadu dadu = daftarDadu.get(i); // Mengambil objek Dadu ke-i
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + dadu.getNilai());
            totalNilai += dadu.getNilai(); // Menambahkan nilai dadu ke total
        }
        // Menampilkan total nilai dadu
        System.out.println("Total nilai dadu keseluruhan " + totalNilai);

        scanner.close(); // Menutup scanner setelah digunakan
    }
}

