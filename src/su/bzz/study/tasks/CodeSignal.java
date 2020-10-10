package su.bzz.study.tasks;

import java.util.Arrays;

public class CodeSignal {

    public static void main(String[] args) {

    }
}

        // Given a string, find out if its characters can be rearranged to form a palindrome.
//        String inputString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbcccc";
//        int []countChar = new int[26];
//
//        for(int i=0; i<inputString.length(); i++)
//            countChar[inputString.charAt(i)-97]++;
//
//        for (int d : countChar)
//            System.out.print(d + " ");
//
//        int chek=0;
//        for(int i=0; i<countChar.length; i++)
//            if(countChar[i]%2!=0) {
//                chek++;
//            }
//        System.out.println(chek<=1);


//
//        char[] change = inputString.toCharArray();
//        Arrays.sort(change);
//        char[] pal = new char[change.length];
//        for (int i = 0, k = 0, j = change.length - 1; i < change.length; i++){
//            if(i % 2 == 0) {
//                pal[k] =change[i];
//                k++;
//            }
//            if(i % 2 != 0){
//                pal[j] = change[i];
//                j--;
//            }
//        }
//        String sortPal = String.valueOf(pal);
//        System.out.println(sortPal);
//        StringBuilder result = new StringBuilder (sortPal);
//
//        System.out.println(result.reverse().toString().equals(sortPal));


//      border
//    String[] picture = {"abc", "ded"};
//    int sizeArray = picture.length + 2;
//    String[] result = new String [sizeArray];
//        Arrays.fill(result, "*");
//                int sizeWord = picture[0].length() + 2;
//
//                for (int i = 0; i < sizeArray; i++) {
//
//        if (i == 0 || i == sizeArray - 1){
//        for (int j = 0; j < sizeWord - 1; j++) {
//        result[i] += "*";
//        } continue;
//        }
//        result[i] = "*" + picture[i-1] + "*";
//
//        }
//        for (int k=0; k < result.length; k++) {
//        System.out.println(result[k]);
//        }

//   (abc)d(efg)
//    String inputString = "(abc)d(efg)";
//    StringBuilder str = new StringBuilder (inputString);
//    int finish = 0;
//        while(finish == 0){
//                finish = 1;
//                int inxLeft = -1;
//                int inxRight = -1;
//                for (int i = 0; i < str.length(); i++){
//
//        if (str.charAt(i) == '(') {
//        inxLeft = i;
//        continue;
//        }
//        if (str.charAt(i) == ')') {
//        inxRight = i;
//        StringBuilder buf = new StringBuilder (str.substring(inxLeft+1, inxRight));
//        buf.reverse();
//        str.delete(inxLeft, inxRight+1);
//        str.insert(inxLeft, buf);
//        finish = 0;
//        break;
//        }
//        }
//        }
//        System.out.println(str.toString());





//        public String printTextPerRole(String[] roles, String[] textLines) {
//    StringBuilder alltext = new StringBuilder();
//        for (int i = 0; i < roles.length; i++) {
//            alltext.append(roles[i] + ":");
//            for (int j = 0; j < textLines.length; j++) {
//                if (textLines[j].startsWith(roles[i])+":") {
//                    alltext.append("\n" + (j + 1) + ")" + textLines[j].substring(roles[i].length() + 1));
//                }
//            }
//            alltext.append("\n\n");
//        }
//
//        return alltext.toString();
//    }
//    String[] roles = {
//            "Городничий", "Аммос Федорович",
//            "Артемий Филиппович",
//            "Лука Лукич"};
//    String[] textLines = {
//            "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
//            "Аммос Федорович: Как ревизор?",
//            "Артемий Филиппович: Как ревизор?",
//            "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
//            "Аммос Федорович: Вот те на!",
//            "Артемий Филиппович: Вот не было заботы, так подай!",
//            "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
//    Main result2 = new Main();
//        System.out.println(result2.printTextPerRole(roles, textLines));
//


//    String[] inputArray = {
//                "abc",
//                "eeee",
//                "abcd",
//                "dcd"};
//        int num = inputArray[0].length();
//        int index = 0;
//        int count = 0;
//        for (int i = 0; i < inputArray.length; i++) {
//            if (inputArray[i].length() > num) {
//                num = inputArray[i].length();
//
//            }
//        }
//        for (int i = 0; i < inputArray.length; i++) {
//            if (inputArray[i].length() == num) {
//                index += 1;
//            }
//        }
//        String[] mas2 = new String[index];
//        for (int i = 0; i < inputArray.length; i++) {
//            if (inputArray[i].length() == num) {
//                mas2[count] = inputArray[i];
//                count++;
//            }
//        }
//
//
//        System.out.println(num);
//        System.out.println(index);
//        System.out.println("");
//               for (String j : mas2) {
//            System.out.println(j);
//        }

//        matrixElementsSum:

//        int [] [] matrix = {{0,1,1,2},
//                            {0,5,0,0},
//                            {2,0,3,3}};
//        int sum = 0;
//        for (int i = 0; i < matrix.length; i++){
//            for (int j = 0; j < matrix [i].length; j++){
//                sum += matrix[i][j];
//                if (i != matrix.length-1 && matrix[i][j] == 0)   matrix [i+1][j] = 0;
//            }
//        }


