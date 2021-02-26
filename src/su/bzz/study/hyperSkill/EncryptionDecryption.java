package su.bzz.study.hyperSkill;

import java.util.Scanner;

public class EncryptionDecryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String whatDo = sc.nextLine();
        String message = sc.nextLine();
        int key = sc.nextInt();
        if ("enc".equals(whatDo)) {
            System.out.println(doEnc(message, key));
        } else {
            System.out.println(doDec(message, key));
        }
    }

    static String doDec(String message, int key) {
        String cypherText = "";

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            ch = (char) (ch - key);
            cypherText += ch;
        }
        return cypherText;
    }

    static String doEnc(String message, int key) {
        String cypherText = "";

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            ch = (char) (ch + key);
            cypherText += ch;
        }
        return cypherText;
    }
}


//    public static void main(String[] args) {
//        String text = "we found a treasure!";
//        String alphabet = "abcdefghijklmnopqrstuvwxyz";
//        for (int i = 0; i < text.length(); i++) {
//            char ch = text.charAt(i);
//            if (Character.isLetter(ch)) {
//                System.out.print(alphabet.charAt(25 - alphabet.indexOf(ch)));
//            } else {
//                System.out.print(ch);
//            }
//        }
//    }