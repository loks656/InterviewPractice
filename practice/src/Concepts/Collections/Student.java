package Concepts.Collections;

import java.util.Comparator;

public class Student implements Comparable<Student> {
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
    public int compareTo(Student s1) {
        return this.name.compareToIgnoreCase(s1.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
