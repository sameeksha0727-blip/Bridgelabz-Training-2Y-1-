package recursion.Strings;

import java.util.Scanner;

public class ReplaceChar {
        static String replace(String str, int i) {
            if (i == str.length()) {
                return "";
            }

            char ch = str.charAt(i);

            if (ch == 'a') {
                ch = 'b';
            }

            return ch + replace(str, i + 1);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a string:");
            String str = sc.nextLine();

            System.out.println(replace(str, 0));
        }
}
