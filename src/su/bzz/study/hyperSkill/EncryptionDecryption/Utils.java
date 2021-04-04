package su.bzz.study.hyperSkill.EncryptionDecryption;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Utils {

    public static void writeToFile(String pathFileOut, String text) {
        File fileOut = new File(pathFileOut);
        try (FileWriter fw = new FileWriter(fileOut)) {
            fw.write(text);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public static String readTxt(String pathFileIn) {
        File file = new File(pathFileIn);
        try (Scanner sc = new Scanner(file)) {
            return sc.nextLine();
        } catch (IOException e) {
            System.out.println("Error");
        }
        return "";
    }
}
