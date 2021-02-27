package su.bzz.study.hyperSkill;

import java.util.Scanner;
// try catch
public class EncryptionDecryption {
    public static void main(String[] args) {
        String mode = "enc";
        String message = "";
        int key = 0;

        for (int i = 0; i < args.length; i++) {
            if (i % 2 == 0) {
                switch (args[i]) {
                    case "-mode":
                        mode = args[i + 1];
                        break;
                    case "-key":
                        key = Integer.parseInt(args[i + 1]);
                        break;
                    case  "-data":
                        message = args[i + 1];
                        break;
                    default:
                        break;
                }
            }
        }

        if ("enc".equals(mode)) {
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