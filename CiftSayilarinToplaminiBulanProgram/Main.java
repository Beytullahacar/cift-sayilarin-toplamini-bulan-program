package CiftSayilarinToplaminiBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input, total = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz : ");
            input = scan.nextInt();
            if (input % 2 == 0){
                total += input;
            }
        }while (input % 2 == 0);

        System.out.println("Toplam : " + total);
    }
}
