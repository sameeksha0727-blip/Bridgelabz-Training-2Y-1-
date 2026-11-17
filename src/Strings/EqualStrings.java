package recursion.Strings;

import java.util.Scanner;

public class EqualStrings {
        static boolean compare(String s1, String s2, int i) {
            if (i == s1.length() && i == s2.length()) {
                return true;
            }

            if (i >= s1.length() || i >= s2.length()) {
                return false;
            }

            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }

            return compare(s1, s2, i + 1);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter first string:");
            String s1 = sc.nextLine();

            System.out.println("Enter second string:");
            String s2 = sc.nextLine();

            if (compare(s1, s2, 0)) {
                System.out.println("Strings are equal");
            } else {
                System.out.println("Strings are not equal");
            }
        }
}
