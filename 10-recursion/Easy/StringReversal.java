import java.util.Scanner;
public class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseString(s));
        sc.close();
    }
    public static String reverseString(String input) {
        if (input.equals("")) {
            return "";
        }
        return reverseString(input.substring(1)) + input.charAt(0);
    }
}