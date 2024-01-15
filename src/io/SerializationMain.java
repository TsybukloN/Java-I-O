package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationMain {
    public static void main(String[] args) {
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("data/out.dat"));
            Student student = new Student("Alex", 555777, "qwerty");
            output.writeObject(student);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
