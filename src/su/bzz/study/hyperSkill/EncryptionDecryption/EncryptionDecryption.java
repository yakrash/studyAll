package su.bzz.study.hyperSkill.EncryptionDecryption;

public abstract class EncryptionDecryption {

    public String toDo(String mode, String message, int key) {
        switch (mode) {
            case "enc":
                return doEnc(message, key);
            case "dec":
                return doDec(message, key);
            default:
                return "";
        }
    }

    abstract String doEnc(String message, int key);

    abstract String doDec(String message, int key);
}
