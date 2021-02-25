package su.bzz.study.hyperSkill;

import java.util.Scanner;

public class EncryptionDecryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        int key = sc.nextInt();
        String cypherText = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (Character.isLetter(ch)) {
                ch = alphabet.charAt((alphabet.indexOf(ch) + key) % 26);
            }
            cypherText += ch;
        }
        System.out.println(cypherText);
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