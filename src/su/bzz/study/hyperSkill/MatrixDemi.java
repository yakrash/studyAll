package su.bzz.study.hyperSkill;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class MatrixDemi {
    public static void main(String[] args) {
        ReadFile.toDo();
    }
}

// 22 min
class Test {

    public static void toDo() {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        System.out.println(Arrays.stream(arr).distinct().count() == 3);
    }
}

class ReadFile {

    public static void toDo() {
        String path = "src/su/bzz/study/hyperSkill/dataset_91022.txt";
        File file = new File(path);
        int i = 0;
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                i += sc.nextInt();
            }
            /*numArray = Stream.of(sc.nextLine()
                    .split(" "))
                    .mapToInt(Integer::parseInt)
                    .filter(num -> num >= 9999)
                    .toArray();
            System.out.println(numArray.length);*/
            System.out.println(i);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

    }
}

class FindFirstMax {
    public static void toDo() {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        int maxIndex = 0;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (maxNum < arr[i]) {
                maxIndex = i;
                maxNum = arr[i];
            }
        }
        System.out.println(maxIndex);
    }
}

class CheckTwoNum {
    public static void toDo() {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int n;
        int m;
        boolean flag = false;
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < length - 1; i++) {
            if ((arr[i] == n && arr[i + 1] == m) || (arr[i] == m && arr[i + 1] == n)) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
}

/*
3
1 3 2
2 3
 */

class MatrixSym {
    public static void toDo() {
        Scanner sc = new Scanner(System.in);
        String allNum = sc.nextLine();
        int countColumns = allNum.split(" ").length;
        int countRows = 1;
        String lineInput = sc.nextLine();

        while (!"end".equals(lineInput)) {
            allNum = allNum + " " + lineInput;
            lineInput = sc.nextLine();
            countRows++;
        }
        sc.close();

        sc = new Scanner(allNum);
        int[][] arrInput = new int[countRows][countColumns];
        while (sc.hasNext()) {
            for (int i = 0; i < countRows; i++) {
                for (int j = 0; j < countColumns; j++) {
                    arrInput[i][j] = sc.nextInt();
                }
            }
        }
        sc.close();

        int[][] arrOutput = new int[countRows][countColumns];
        for (int i = 0; i < countRows; i++) {
            for (int j = 0; j < countColumns; j++) {
                int left = j == 0 ? countColumns - 1 : j - 1;
                int top = i == 0 ? countRows - 1 : i - 1;
                int right = j == countColumns - 1 ? 0 : j + 1;
                int bot = i == countRows - 1 ? 0 : i + 1;

                arrOutput[i][j] =
                        arrInput[i][left] + arrInput[i][right] + arrInput[top][j] + arrInput[bot][j];
            }
        }

        for (int i = 0; i < countRows; i++) {
            for (int j = 0; j < countColumns; j++) {
                System.out.print(arrOutput[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
/*
9 5 3
0 7 -1
-5 2 9
end
*/
// --------------------------------------------------------
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

// ------------------------------------------------------
//public static void main(String args[]) {
//
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    String result = "YES";
//    int[][] arr = new int[n][n];
//    for (int i = 0; i < n; i++) {
//        for (int j = 0; j < n; j++) {
//            arr[i][j] = sc.nextInt();
//        }
//    }
//
//    for (int i = 0; i < n; i++) {
//        for (int j = 0; j < n; j++) {
//            if (arr[i][j] != arr[j][i]) {
//                result = "NO";
//                break;
//            }
//        }
//    }
//    System.out.println(result);

