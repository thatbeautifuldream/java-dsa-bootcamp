import java.io.*;
import java.util.*;
public class FloodFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        floodFill(arr, 0, 0, "");
    }
    public static void floodFill(int[][] maze, int row, int col, String psf) {
        if(row < 0 || col < 0 || row == maze.length || col == maze[0].length) {
            return;
        }

        floodFill(maze, row-1, col, psf + "t"); // top movement
        floodFill(maze, row, col-1, psf + "l"); // left movement
        floodFill(maze, row+1, col, psf + "d"); // down movement
        floodFill(maze, row, col+1, psf + "r"); // right movement
    }
}