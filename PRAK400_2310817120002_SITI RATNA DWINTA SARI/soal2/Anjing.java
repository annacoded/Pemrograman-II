package soal2;
import soal1.HewanPeliharaan;
public class Anjing extends HewanPeliharaan {
    String warnaBulu;
    String[] kemampuan;

   Anjing(String n, String r, String w, String[]k) {
        super(n, r);
        this.warnaBulu = w;
        this.kemampuan = k;
    }

    void displayDetailAnjing(){
        super.display();
        System.out.println("Memiliki warna bulu: " + this.warnaBulu);
        System.out.print("Memiliki kemampuan: ");
        for (int i = 0; i < kemampuan.length; i++) {
            System.out.print(kemampuan[i]);
            if (i < kemampuan.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }   

}
