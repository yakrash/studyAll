package su.bzz.study.hyperSkill;

import java.util.Scanner;

public class MatrixDemi {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = "YES";
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    result = "NO";
                    break;
                }
            }
        }
        System.out.println(result);

    }
}


//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int m = sc.nextInt();
//    int[][] arr = new int[n][m];
//        for (int i = 0; i < n; i++) {
//        for (int j = 0; j < m; j++) {
//        arr[i][j] = sc.nextInt();
//        }
//        }
//        int firstColumns = sc.nextInt();
//        int secondColumns = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//        int temp;
//        temp = arr[i][firstColumns];
//        arr[i][firstColumns] = arr[i][secondColumns];
//        arr[i][secondColumns] = temp;
//        }
//
//        for (int[] arr2 : arr) {
//        for (int num : arr2) {
//        System.out.print(num + " ");
//        }
//        System.out.println("");
//        }