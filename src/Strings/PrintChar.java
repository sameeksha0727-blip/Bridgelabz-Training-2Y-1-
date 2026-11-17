package recursion.Strings;

import java.util.Scanner;

public class PrintChar {
        static void printChar(String str, int i) {
            if (i == str.length()) {
                return;
            }

            System.out.println(str.charAt(i));
            printChar(str, i + 1);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a string:");
            String str = sc.nextLine();

            printChar(str, 0);
        }
}
