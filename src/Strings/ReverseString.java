package recursion.Strings;

import java.util.Scanner;

public class ReverseString {

        static void reverse(String str, int i) {
            if (i < 0) {
                return;
            }

            System.out.print(str.charAt(i));
            reverse(str, i - 1);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a string:");
            String str = sc.nextLine();

            reverse(str, str.length() - 1);
        }
}
