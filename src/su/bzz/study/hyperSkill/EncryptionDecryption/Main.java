package su.bzz.study.hyperSkill.EncryptionDecryption;

public class Main {
    public static void main(String[] args) {
        String mode = "enc";
        String message = "";
        int key = 0;
        boolean isData = false;
        String pathFileIn = "";
        String pathFileOUt = "";
        String alg = "shift";

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
                            message = Utils.readTxt(pathFileIn);
                        }
                        break;
                    case "-out":
                        pathFileOUt = args[i + 1];
                        break;
                    case "-alg":
                        alg = args[i + 1];
                        break;
                    default:
                        break;
                }
            }
        }

        if ("".equals(message) || message.isEmpty()) {
            System.out.println("Error");
        } else {
            EncryptionDecryption encryptionDecryption = EncDecFactory.make(alg);
            String cypherText = encryptionDecryption.toDo(mode, message, key);
            if (isData) {
                System.out.println(cypherText);
            } else {
                Utils.writeToFile(pathFileOUt, cypherText);
            }
        }
    }
}


//            if ("enc".equals(mode)) {
//                String cypherText = encryptionDecryption.doEnc(message, key);
//                if (isData) {
//                    System.out.println(cypherText);
//                } else {
//                    Utils.writeToFile(pathFileOUt, cypherText);
//                }
//            } else {
//                String normalText = encryptionDecryption.doDec(message, key);
//                if (isData) {
//                    System.out.println(normalText);
//                } else {
//                    Utils.writeToFile(pathFileOUt, normalText);
//                }
//            }

