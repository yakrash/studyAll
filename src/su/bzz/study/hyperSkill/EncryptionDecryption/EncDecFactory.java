package su.bzz.study.hyperSkill.EncryptionDecryption;

public class EncDecFactory {

    public static EncryptionDecryption make(String alg) {
        switch (alg) {
            case "unicode":
                return new EncryptionDecryptionUnicode();
            case "shift":
                return new EncryptionDecryptionShift();
            default:
                return null;
        }
    }
}
