import java.util.Scanner;
public class FirstIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int d = in.nextInt();
        int fi = firstIndex(a, 0, d);
        System.out.println(fi);
        in.close();
    }
    public static int firstIndex(int[] a, int idx, int x) {
        if(idx == a.length) {
            return -1;
        }
        if(a[idx] == x) {
            return idx;
        }
        else {
            int fiisa = firstIndex(a, idx + 1, x); // first index in small array
            return fiisa;
        }
    }
}
