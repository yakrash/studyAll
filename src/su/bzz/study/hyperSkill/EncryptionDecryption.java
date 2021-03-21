package su.bzz.study.hyperSkill;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// try catch
public class EncryptionDecryption {
    public static void main(String[] args) {
        String mode = "enc";
        String message = "";
        int key = 0;
        boolean isData = false;
        String pathFileIn = "";
        String pathFileOUt = "";

        for (int i = 0; i < args.length; i++) {
            if (i % 2 == 0) {
                switch (args[i]) {
                    case "-mode":
                        mode = args[i + 1];
                        break;
                    case "-key":
                        key = Integer.parseInt(args[i + 1]);
                        break;
                    case "-data":
                        message = args[i + 1];
                        isData = true;
                        break;
                    case "-in":
                        if (!isData) {
                            pathFileIn = args[i + 1];
                            message = readTxt(pathFileIn);
                        }
                        break;
                    case "-out":
                        pathFileOUt = args[i + 1];
                        break;
                    default:
                        break;
                }
            }
        }

        if ("".equals(message) || message.isEmpty()) {
            System.out.println("Error");
        } else {
            if ("enc".equals(mode)) {
                String cypherText = doEnc(message, key);
                if (isData) {
                    System.out.println(cypherText);
                } else {
                    writeToFile(pathFileOUt, cypherText);
                }
            } else {
                String normalText = doDec(message, key);
                if (isData) {
                    System.out.println(normalText);
                } else {
                    writeToFile(pathFileOUt, normalText);
                }
            }
        }
    }

    static void writeToFile(String pathFileOut, String text) {
        File fileOut = new File(pathFileOut);
        try (FileWriter fw = new FileWriter(fileOut)) {
            fw.write(text);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    static String readTxt(String pathFileIn) {
        File file = new File(pathFileIn);
        try (Scanner sc = new Scanner(file)) {
            return sc.nextLine();
        } catch (IOException e) {
            System.out.println("Error");
        }
        return "";
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