import java.util.Scanner;

public class CS50 {
    public static void main(String[] args) {
        System.out.println(1);
    }


    class Rekursia {
        int sumAll(int n) {
            if (n == 1)
                return 1;
            return n + sumAll(n - 1);
//        Rekursia rek = new Rekursia();
//        Scanner in = new Scanner(System.in);
//        int inputKey = in.nextInt();
//        System.out.println(rek.sumAll(inputKey));
        }
    }

    // шифр цезаря и
    class Crypt2 {
        void crypt(String text, String key) {
            char out;
            for (int i = 0; i < text.length(); i++) {
                char keyIn = (char) (key.charAt(i % key.length()) - 96);
                System.out.println((int) (keyIn));
                if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                    out = (char) ((text.charAt(i) - 97 + keyIn));
                    System.out.print((char) (out + 97));
                }
                if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                    out = (char) ((text.charAt(i) - 65 + keyIn));
                    System.out.print((char) (out + 65));
                }

            }

//        String key = "bacon";
//        String text = "Meet me at the park at eleven am";
//        Crypt2 crypt2 = new Crypt2();
//        crypt2.crypt(text, key);
        }
    }

    class Crypt {
        void crypt(String text, int key) {
            char out;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                    out = (char) ((text.charAt(i) - 97 + key));
                    System.out.print((char) (out + 97));
                }
                if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                    out = (char) ((text.charAt(i) - 65 + key));
                    System.out.print((char) (out + 65));
                }

            }


        }
    }

}
