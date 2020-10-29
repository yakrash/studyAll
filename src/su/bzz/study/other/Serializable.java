package su.bzz.study.other;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Serializable {
    private static final String FILE_NAME = "data.dat";

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");


        try (ObjectOutput output = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
             ObjectInput input = new ObjectInputStream(new FileInputStream(FILE_NAME));) {

            output.writeObject(map);

            map2 = (Map<Integer, String>) input.readObject();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        map2.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
