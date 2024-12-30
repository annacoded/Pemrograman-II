package soal1;

import java.util.Random;

public class Dadu {
    // Enkapsulasi: variabel nilai dadu hanya bisa diakses melalui metode ini
    private int nilai;

    // Constructor Dadu tanpa parameter
    public Dadu() {
        acakNilai(); // Memanggil metode acakNilai saat objek dibuat
    }

    // Method untuk mengacak nilai dadu antara 1 dan 6
    public void acakNilai() {
        Random rand = new Random();
        this.nilai = rand.nextInt(6) + 1; // Menghasilkan angka acak antara 1 dan 6
    }

    // Getter untuk nilai dadu
    public int getNilai() {
        return this.nilai;
    }
}