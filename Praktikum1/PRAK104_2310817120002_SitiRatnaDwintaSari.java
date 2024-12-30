import java.util.Scanner;

public class PRAK104_2310817120002_SitiRatnaDwintaSari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mainUlang = 3; // Permainan diulang 3 kali

        while(mainUlang > 0) {
            int poinAbu = 0, poinBagas = 0;

            // Input tangan Abu dan Bagas
            System.out.print("Tangan Abu: ");
            String abu = input.nextLine().replaceAll(" ", "");
            System.out.print("Tangan Bagas: ");
            String bagas = input.nextLine().replaceAll(" ", "");

            // Proses 3 ronde
            for (int ronde = 0; ronde < 3; ronde++) {
                char tanganAbu = abu.charAt(ronde);
                char tanganBagas = bagas.charAt(ronde);

                // cek hasil tiap ronde
                switch(cekHasil(tanganAbu, tanganBagas)) {
                    case 1 -> poinAbu++;  // Abu win
                    case -1 -> poinBagas++;  // Bagas win
                }
            }

            // untuk menentukan winner setelah 3 ronde
            if (poinAbu > poinBagas) {
                System.out.println("Pemenang: Abu");
            } else if (poinBagas > poinAbu) {
                System.out.println("Pemenang: Bagas");
            } else {
                System.out.println("Pemenang: Seri");
            }

            mainUlang--;
        }
        
        input.close();
    }

    // Function untuk menentukan winner tiap ronde
    public static int cekHasil(char tanganAbu, char tanganBagas) {
        if (tanganAbu == tanganBagas) {
            return 0; // Seri
        } else if ((tanganAbu == 'B' && tanganBagas == 'G') || 
                   (tanganAbu == 'G' && tanganBagas == 'K') || 
                   (tanganAbu == 'K' && tanganBagas == 'B')) {
            return 1; // Abu win
        } else {
            return -1; // Bagas win
        }
    }
}
