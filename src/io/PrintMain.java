package io;

import java.io.*;

public class PrintMain {
    public static void main(String[] args) {
        File file = new File("data\\res.txt");
        double[] values = {1.10, 1.2, 1.401, 5.01, 6.017, 7, 8};
        try (PrintStream  stream = new PrintStream(new FileOutputStream(file))){
            for (double value : values) {
                stream.printf("Java %.2g\n", value);
                System.setOut(stream);
                System.out.printf("%.2g\n", value);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file)))) {
            new PrintWriter(new PrintStream(new FileOutputStream(file)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;
    }
}
