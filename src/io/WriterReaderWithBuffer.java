package io;

import java.io.*;

public class WriterReaderWithBuffer {
    public static void main(String[] args) {
        String inputPath = "data/in.txt";
        String outputPath = "data/out.txt";
        try (FileReader reader = new FileReader(inputPath);
             BufferedReader bufferedReader = new BufferedReader(reader);
             FileWriter writer = new FileWriter(outputPath, true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer))
        {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line, 0, line.length());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
