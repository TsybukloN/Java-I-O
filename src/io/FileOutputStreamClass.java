package io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamClass {
    public static void main(String[] args) {
        String path = "data/out.txt";
        try (FileOutputStream output = new FileOutputStream(path)) {
            output.write(55);
            byte[] buffer = {48, 49, 50};
            output.write(buffer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
