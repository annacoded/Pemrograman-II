public class Soal3Main {
    public static void main(String[] args) {
        // Pada baris ini terjadi error karena nama class yang diinisialisasi tidak sesuai dengan nama file Pegawai.
        // Pegawai p1 = new Pegawai();
        Pegawai p1 = new Pegawai();

        //Pada baris ini terjadi error karena kurang tanda titik koma(;) pada akhir baris.
        // p1.nama = "Roi"
        p1.nama = "Roi";

        // Pada baris ini terjadi error karena tipe data dari `asal` adalah `char`, seharusnya menggunakan `String`.
        // p1.asal = "Kingdom of Orvel";
        p1.asal = "Kingdom of Orvel";

        // Pada baris ini terjadi error karena method `setJabatan` membutuhkan parameter untuk menetapkan nilai `jabatan`.
        // p1.setJabatan("Assasin");
        p1.setJabatan("Assasin");

        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);

        // Pada baris ini terjadi error karena `umur` tidak diinisialisasi dalam `Soal3Main.java`. Solusinya adalah memberikan nilai default pada class `Pegawai`.
        // System.out.println("Umur: " + p1.umur);
        // perlu ditambahkan kata "tahun" sesuai dengan output yang diminta
        System.out.println("Umur: " + p1.umur + " tahun");
        }
       
}
