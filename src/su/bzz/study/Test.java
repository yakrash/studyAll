package su.bzz.study;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String stringS = sc.nextLine();
        boolean flagPass = false;
        String result = stringS.substring(stringS.indexOf('?') + 1);
        result = result.replace("=", " : ");

        if (result.contains("cookie : &")) {
            result = result.replace("cookie : &", "cookie : not found&");
        }
        if (result.contains("pass")) {
            result = result + "&password : ";
            flagPass = true;
        }

        String[] arrStr = result.split("&");

        if (flagPass) {
            for (String word : arrStr) {
                if (word.contains("pass : ")) {
                    String pass = word.substring(7);
                    arrStr[arrStr.length - 1] += pass;
                }
            }
        }

        for (String word : arrStr) {
            System.out.println(word);
        }
    }
}
// https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost
// https://target.com/index.html?port=8080&name=Bob&cookie=&host=localhost&pass=12345

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        // put your code here
//    }
//}
