package su.bzz.study.hyperSkill.EncryptionDecryption;

public class EncryptionDecryptionUnicode extends EncryptionDecryption {
    @Override
    String doEnc(String message, int key) {
        StringBuilder cypherText = new StringBuilder();

        for (char ch : message.toCharArray()) {
            ch = (char) (ch + key);
            cypherText.append(ch);
        }
        return cypherText.toString();
    }

    @Override
    String doDec(String message, int key) {
        return doEnc(message, -key);
    }
}
