import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t1d = scn.nextInt();
        int t2d = scn.nextInt();
        int t3d = scn.nextInt();
        toh(n, t1d, t2d, t3d);
        scn.close();
    }

    public static void toh(int n, int t1id, int t2id, int t3id) {
        if (n == 0) {
            return;
        }
        else {
            toh(n - 1, t1id, t3id, t2id);
            System.out.println(n + "[" + t1id + " -> " + t2id + "]");
            toh(n - 1, t3id, t2id, t1id);
        }
    }
}