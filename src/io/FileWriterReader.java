package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileWriterReader {
    public static void main(String[] args) {
        String inputPath = "data/in.txt";
        String outputPath = "data/out.txt";
        try (FileReader reader = new FileReader(inputPath);
             FileWriter writer = new FileWriter(outputPath, true)) {
            writer.write("Java");

            int code = reader.read();
            System.out.println(code + " char: " + (char)code);

            char[] buffer = new char[3];
            //reader.skip(3);
            int charNum  = reader.read(buffer);

            while(charNum != -1) {
                writer.write(buffer, 0, charNum);
                charNum  = reader.read(buffer);
            }

            writer.write(buffer, 0, 3);
            System.out.println(Arrays.toString(buffer));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
