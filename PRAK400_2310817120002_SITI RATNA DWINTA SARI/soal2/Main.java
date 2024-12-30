package soal2;

import java.util.Scanner;

public class Main {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      //Menginputkan jenis hewan yang akan dipilih
      System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
      System.out.println("1. Kucing");
      System.out.println("2. Anjing");
      System.out.print("Masukkan Pilihan: ");
      int pilihan = input.nextInt();
      input.nextLine();

      //Pilihan untuk Kucing
      if (pilihan == 1){
      System.out.print("Nama Hewan Peliharaan: ");
      String nama = input.nextLine();
      System.out.print("Ras: ");
      String ras = input.nextLine();
      System.out.print("Warna Bulu: ");
      String warnaBulu = input.nextLine();

      System.out.println();

      Kucing kucing = new Kucing(nama, ras, warnaBulu);
      kucing.displayDetailKucing();
      
      //Pilihan untuk Anjing
      } else if (pilihan == 2){
      System.out.print("Nama Hewan Peliharaan: ");
      String nama = input.nextLine();
      System.out.print("Ras: ");
      String ras = input.nextLine();
      System.out.print("Warna Bulu: ");
      String warnaBulu = input.nextLine();
      System.out.print("Kemampuan: ");
      String[] kemampuan = input.nextLine().split(",\\s*");
      
      System.out.println();
      
      Anjing anjing = new Anjing(nama, ras, warnaBulu, kemampuan);
      anjing.displayDetailAnjing();
      } else {
      System.out.println("Pilihan tidak tersedia");
      }

      input.close();
   } 
}
