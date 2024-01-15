package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Buffered {
    public static void main(String[] args) {
        String inputPath = "data/in.txt";
        try (FileReader reader = new FileReader(inputPath);
             BufferedReader bufferedReader = new BufferedReader(reader))
        {
            ArrayList<String> strings = new ArrayList<>();
            //bufferedReader.lines().forEach(System.out::println);
            bufferedReader.lines().forEach(strings::add);
            System.out.println(strings);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
