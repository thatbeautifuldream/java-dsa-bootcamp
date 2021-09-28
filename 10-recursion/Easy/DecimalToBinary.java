import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String decimal = sc.nextLine();
        String binary = decimalToBinary(Integer.parseInt(decimal), "");
        System.out.println(binary);
        sc.close();
    }
    public static String decimalToBinary(int decimal, String binary) {
        if (decimal == 0) {
            return binary;
        }
        binary = decimal % 2 + binary;
        return decimalToBinary(decimal / 2, binary);
    }
}
