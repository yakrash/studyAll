package su.bzz.study;

    import java.util.Scanner;

public class Test {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int firstColumns = sc.nextInt();
        int secondColumns = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int temp;
            temp = arr[i][firstColumns];
            arr[i][firstColumns] = arr[i][secondColumns];
            arr[i][secondColumns] = temp;
        }

        for (int[] arr2 : arr) {
            for (int num : arr2) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }
    }
}


enum Secret {
    STAR, CRASH, START
}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        // put your code here
//    }
//}
