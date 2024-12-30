//Pada baris ini terjadi error karna nama class tidak sesuai dengan  nama file
// public class Employee {
public class Pegawai {
    public String nama;
    public String asal; //Terjadi error karena tipe data "char" tidak sesuai untuk menyimpan nama tempat, sebaiknya diganti dengan tipe data "String"
    // public char asal;
    public String jabatan;
    public int umur = 17; //Tambahkan inisialisasi umur karena di class Soal3Main.java tidak ada setter yang mengatur nilai ini.

    public String getNama() {
        return nama;
    }
    // Pada baris ini terjadi error karena tipe return dari `getAsal` adalah `char`, padahal seharusnya `String`.
    // public String getAsal() {
    //     return asal;
    // }
    public String getAsal() {
        return asal;
    }
    // Pada baris ini terjadi error karena tidak ada parameter untuk mengatur `jabatan`, sehingga tidak bisa menetapkan nilai "j".
    // public void setJabatan() {
    //     this.jabatan = j;
    // }
    public void setJabatan(String j) {
        this.jabatan = j;
    }
 }

