import java.util.Scanner;

public class PRAK105_2310817120002_SitiRatnaDwintaSari {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        float r2 = input.nextFloat();

        System.out.print("Masukkan tinggi: ");
        float t = input.nextFloat();

        float phi = 3.14f;
        float volume = phi * (r2 * r2) * t;
        System.out.println("Volume tabung dengan jari-jari " + r2 + " cm dan tinggi " + t + " cm adalah " + String.format("%.3f", volume) + " m3");
    }
}