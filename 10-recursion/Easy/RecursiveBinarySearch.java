import java.util.Scanner;
public class RecursiveBinarySearch {
    public static int binarySearch(int[] A, int start, int end, int key) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (A[mid] == key) {
            return mid;
        }
        if (key < A[mid]) {
            return binarySearch(A, start, mid - 1, key);
        }
        return binarySearch(A, mid + 1, end, key);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the " + n +" elements of array : ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the key : ");
        int key = sc.nextInt();
        int index = binarySearch(A, 0, n - 1, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("The element " + key + " was found at " + index + "th position in the array(0-based-index).");
        }
    }
}
