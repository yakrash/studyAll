public class CodeSignal {


    public static void main(String[] args) {
        System.out.println(1);
    }
}


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


