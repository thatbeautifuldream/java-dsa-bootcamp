import java.util.Scanner;
public class DisplayArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        displayArray(array, 0);
        sc.close();
    }
    
    public static void displayArray(int[] array, int index) {
        if (index == array.length) {
            return;
        }
        System.out.print(array[index] + " ");
        displayArray(array, index + 1);
    }
}
