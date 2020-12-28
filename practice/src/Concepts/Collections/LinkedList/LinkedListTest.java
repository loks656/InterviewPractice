package Concepts.Collections.LinkedList;

import Concepts.Collections.Student;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    LinkedList<Student> cseA = new LinkedList();

    /**
     * add method
     * public boolean add(Student s);
     */
    public boolean add_student(String name, long rollNumber) {
        return cseA.add(new Student(name,rollNumber));
    }
}
