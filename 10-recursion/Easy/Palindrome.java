import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(isPalindrome(s));
        in.close();
    }
    public static boolean isPalindrome(String s) {
        // Define base case / stopping condition
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }

        // Do some work to shrink the problem size
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }

        // Additional base case to handle non-palindromes
        return false;
    }
}
