package recursion.Strings;

import java.util.Scanner;

public class StringLength {
        static int findLength(String str, int i) {
            if (i == str.toCharArray().length) {
                return 0;
            }

            return 1 + findLength(str, i + 1);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a string:");
            String str = sc.nextLine();

            System.out.println("Length: " + findLength(str, 0));
        }
}
