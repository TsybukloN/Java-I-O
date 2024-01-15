package io;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable{
    static String faculty = "MMF";
    private final String name;
    private final int id;
    private final transient String password;
    @Serial
    private static final long serialVersionUID = 1L;

    public Student(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public String toString() {
        return "\nfaculty " + faculty + "\nname " + name + "\nID " + id + "\npassword " + password;
    }
}
