
public class soal1buah {
    public static void main(String[] args) {
        Buah apel = new Buah("Apel", 0.4, 7000.0, 40);
        Buah mangga = new Buah("Mangga", 0.2, 3500.0, 15);
        Buah alpukat = new Buah("Alpukat", 0.25, 10000.0, 12);

        apel.menampilkanData();
        mangga.menampilkanData();
        alpukat.menampilkanData();
    }
}
