import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean cont = false;
        String contYN;
        String word;
        int random = 0;
        System.out.println("Enter a word or phrase:");
        word = scan.nextLine();

        if (word.length() > 1) {
            do {
                random = (int)(Math.random() * word.length());
                word = word.substring(0, random) + word.substring(random +1);
                System.out.println("Your new word or phrase is: " + word);
                if (word.length() > 1) {
                    System.out.println("Again? Y/N");
                    contYN = scan.nextLine();
                    contYN = contYN.toUpperCase();
                    if (contYN.equals("N")) {
                        cont = true;

                    }
                }
                else {
                    System.out.println("Your word is too small to continue");
                    cont = true;
                }
            } while (!cont);
        }




    }
}