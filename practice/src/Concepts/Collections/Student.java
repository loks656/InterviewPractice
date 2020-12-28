package Concepts.Collections;

import java.util.Comparator;

public class Student implements Comparator<Student> {
     String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(long rollNumber) {
        this.rollNumber = rollNumber;
    }

    long rollNumber;
    public Student(String name, long rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareToIgnoreCase(s2.name);
    }
}
