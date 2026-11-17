package recursion.Strings;

import java.util.Scanner;

public class CountOccurrence {
        static int countChar(String str, char ch, int i) {
            if (i == str.length()) {
                return 0;
            }

            if (str.charAt(i) == ch) {
                return 1 + countChar(str, ch, i + 1);
            }

            return countChar(str, ch, i + 1);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a string:");
            String str = sc.nextLine();

            System.out.println("Enter character:");
            char ch = sc.next().charAt(0);

            System.out.println("Occurrences: " + countChar(str, ch, 0));
        }
}
