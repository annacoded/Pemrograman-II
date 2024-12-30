package soal2;

import soal1.HewanPeliharaan;

public class Kucing extends HewanPeliharaan {
    String warnaBulu;

    Kucing(String n, String r, String w) {
        super(n, r);
        this.warnaBulu = w;
    }

    void displayDetailKucing(){
        super.display();
        System.out.println("Memiliki warna bulu: " + warnaBulu);
    }
}
