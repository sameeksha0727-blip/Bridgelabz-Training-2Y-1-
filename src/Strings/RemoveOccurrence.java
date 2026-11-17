package recursion.Strings;

import java.util.Scanner;

public class RemoveOccurrence {
        static String removeChar(String str, char ch, int i) {
            if (i == str.length()) {
                return "";
            }

            if (str.charAt(i) == ch) {
                return removeChar(str, ch, i + 1);
            }

            return str.charAt(i) + removeChar(str, ch, i + 1);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a string:");
            String str = sc.nextLine();

            System.out.println("Enter character to remove:");
            char ch = sc.next().charAt(0);

            System.out.println(removeChar(str, ch, 0));
        }
}
