import java.util.Scanner;

public class PRAK101_2310817120002_SitiRatnaDwintaSari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input data
        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempat = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggal = input.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulan = input.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahun = input.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int TB = input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        float BB = input.nextFloat();

        input.close();

        // output data
        System.out.println("\nNama Lengkap " + nama + ", Lahir di " + tempat
                + " pada Tanggal " + tanggal + " " + getBulan(bulan) + " " + tahun + 
                ". Tinggi Badan " + TB + " cm dan Berat Badan " + BB + " kilogram.");
    }

    // fungsi untuk nama bulan
    public static String getBulan(int bulan) {
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        return namaBulan[bulan - 1];  //nama bulan berdasarkan indeks (bulan-1)
    }
}
