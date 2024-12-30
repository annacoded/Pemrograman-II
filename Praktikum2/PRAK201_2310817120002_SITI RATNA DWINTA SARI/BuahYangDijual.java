package PRAK201_2310817210004_AllanoLintangErtantora;

public class BuahYangDijual {
    String namaBuah;
    double beratPerBuah, hargaPerSatuan, jumlahBeli, HargaSebelumDiskon, HargaSetelahDiskon;
    
    public BuahYangDijual(String namaBuah, double beratPerBuah, double hargaPerSatuan, double jumlahBeli) {
        this.namaBuah = namaBuah;
        this.beratPerBuah = beratPerBuah;
        this.hargaPerSatuan = hargaPerSatuan;
        this.jumlahBeli = jumlahBeli;
        this.HargaSebelumDiskon = (jumlahBeli / beratPerBuah) * hargaPerSatuan;
    }
    
    public void hitungTotalDiskon() { 
   	 hargaPerSatuan = (Math.floor(jumlahBeli / 4) * 0.02 * hargaPerSatuan * 4);
   	 HargaSetelahDiskon = HargaSebelumDiskon - hargaPerSatuan; 
   	 
   } 
    
    void informasiHargaBuah(){
        System.out.println("Nama Buah : "+namaBuah);
        System.out.println("Berat : "+beratPerBuah);
        System.out.println("Harga : "+hargaPerSatuan);
        System.out.println("Jumlah Beli : "+jumlahBeli+"kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", HargaSebelumDiskon);
        hitungTotalDiskon();
        System.out.printf("Total Diskon : Rp%.2f\n", hargaPerSatuan); 
        System.out.printf("Harga Setelah Diskon : Rp%.2f\n\n", HargaSetelahDiskon); 
    }
}