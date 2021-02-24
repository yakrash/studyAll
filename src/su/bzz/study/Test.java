package su.bzz.study;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(num + " ");
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            System.out.print(num + " ");
        }
        long lo = Integer.MAX_VALUE; // (1)
        int i = (int) lo; // (2)
        System.out.println(i);
        char ch = (char) i; // (3)
        System.out.println(ch);
        double d = ch; // (4)
        System.out.println(d);
        float f = (float) d; // (5)
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
