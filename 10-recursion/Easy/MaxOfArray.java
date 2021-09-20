import java.util.Scanner;
public class MaxOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int max = maxOfArray(a, 0);
        System.out.println(max);
        in.close();
    }
    // recursively find the max of an array
    public static int maxOfArray(int[] array, int index) {
        if(index == array.length - 1){
            return array[index];
        }
        int misa = maxOfArray(array, index + 1); // misa : max in smaller array
        if(misa > array[index]){
            return misa;
        }
        else {
            return array[index];
        }
    }
}