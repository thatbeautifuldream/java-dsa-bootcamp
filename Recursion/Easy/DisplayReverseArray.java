import java.util.Scanner;
public class DisplayReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        displayArrayReverse(array, 0);
        sc.close();
    }
    
    public static void displayArrayReverse(int[] array, int index) {
        if(index == array.length) {
            return;
        }
        displayArrayReverse(array, index + 1);
        System.out.print(array[index] + " ");
    }
}
