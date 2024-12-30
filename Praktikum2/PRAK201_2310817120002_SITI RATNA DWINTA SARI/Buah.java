public class Buah {
    String nama;
    double berat, harga, jumlahBeli;

    public Buah(String nama, double berat, double harga, double jumlahBeli) {
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }
    public double HargaSebelumDiskon() {
        return (jumlahBeli / berat) *harga;
    }
    public double hitungDiskon(){
        double totalDiskon = (int) (jumlahBeli / 4) * 0.02 * harga * 4;
        return totalDiskon;
    }
    public double HargaSetelahDiskon(){
        return HargaSebelumDiskon() - hitungDiskon();
    }
    public void menampilkanData(){
        System.out.println("Nama Buah : "+nama);
        System.out.println("Berat : "+berat);
        System.out.println("Harga : "+harga);
        System.out.println("Jumlah Beli : "+jumlahBeli+"kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", HargaSebelumDiskon());
        System.out.printf("Total Diskon : Rp%.2f\n", hitungDiskon());
        System.out.printf("Harga Setelah Diskon : Rp%.2f\n\n", HargaSetelahDiskon());
        System.out.println();
    }
}