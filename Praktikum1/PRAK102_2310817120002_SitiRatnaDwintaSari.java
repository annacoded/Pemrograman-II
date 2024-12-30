import java.util.Scanner;

public class PRAK102_2310817120002_SitiRatnaDwintaSari {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
         int angka = input.nextInt();
         int counter = 0;
         while (counter <= 10){
            if(angka % 5 == 0){
                System.out.print((angka / 5) - 1);
            } else {
                System.out.print(angka);
            }
            if (counter != 10) {
                System.out.print(", ");
            }
            angka++;
            counter++;
         }  input.close();
    }
}