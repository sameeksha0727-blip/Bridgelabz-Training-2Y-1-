package recursion.Strings;

import java.util.Scanner;

public class RemoveDuplicate {
        static String removeDuplicates(String str, int i, String result) {
            if (i == str.length()) {
                return result;
            }

            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }

            return removeDuplicates(str, i + 1, result);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a string:");
            String str = sc.nextLine();

            System.out.println(removeDuplicates(str, 0, ""));
        }
}
