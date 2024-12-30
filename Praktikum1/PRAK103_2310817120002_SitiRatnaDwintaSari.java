import java.util.Scanner;

public class PRAK103_2310817120002_SitiRatnaDwintaSari {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); // Jumlah bilangan yang ingin dicetak
        int angka = input.nextInt(); // Bilangan awal

        int count = 0; 
        int bilangan = angka;
        // Perulangan do-while
        do {
            if (bilangan % 2 != 0) { // Cek jika bilangan ganjil
                count++;
                if (count == N) {
                    System.out.print(bilangan); // Cetak tanpa koma untuk bilangan terakhir
                } else {
                    System.out.print(bilangan + ", "); // Cetak dengan koma
                }
            }
            bilangan++; // Bilangan berikutnya
        } while (count < N); // Berhenti setelah N bilangan ganjil dicetak
        
        input.close(); // Tutup scanner
    }
}
