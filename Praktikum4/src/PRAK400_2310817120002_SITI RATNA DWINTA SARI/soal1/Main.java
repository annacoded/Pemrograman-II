package soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        String namaHewan = input.nextLine();
        System.out.print("Ras: ");
        String rasHewan = input.nextLine();

        System.out.println();

        HewanPeliharaan hewan = new HewanPeliharaan(namaHewan, rasHewan);
        hewan.display();
        input.close();
    }
}
