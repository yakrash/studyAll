package su.bzz.study.hyperSkill.EncryptionDecryption;

public class EncryptionDecryptionShift extends EncryptionDecryption {
    @Override
    String doEnc(String message, int key) {
        StringBuilder cypherText = new StringBuilder();
        for (char ch : message.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                int actualPosition = ch - 'A';
                int newPosition = (actualPosition + key) % 26;
                char newCh = (char) (newPosition + 'A');
                cypherText.append(newCh);
            } else if (ch >= 'a' && ch <= 'z') {
                int actualPosition = ch - 'a';
                int newPosition = (actualPosition + key) % 26;
                char newCh = (char) (newPosition + 'a');
                cypherText.append(newCh);
            } else cypherText.append(ch);
        }
        return cypherText.toString();
    }

    @Override
    String doDec(String message, int key) {
        return doEnc(message, 26 - (key % 26));
    }
}
