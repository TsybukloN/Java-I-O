package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamClass {
    public static void main(String[] args) {
        String path = "data/in.txt";
        try (FileInputStream input = new FileInputStream(path)) {
            int code = input.read();
            System.out.println(code + " char: " + (char)code);

            byte[] buffer = new byte[6];
            int num = input.read(buffer);
            System.out.println("num = " + num);
            System.out.println(Arrays.toString(buffer));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
