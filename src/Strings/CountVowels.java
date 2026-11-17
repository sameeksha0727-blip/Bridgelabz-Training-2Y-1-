package recursion.Strings;

import java.util.Scanner;

public class CountVowels {
        static int countVowels(String str, int i) {
            if (i == str.length()) {
                return 0;
            }

            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                return 1 + countVowels(str, i + 1);
            }

            return countVowels(str, i + 1);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a string:");
            String str = sc.nextLine();

            System.out.println("Vowels: " + countVowels(str, 0));
        }
}
