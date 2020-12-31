package Concepts.Collections.List.LinkedList;

import Concepts.Collections.Student;

import java.util.LinkedList;

/**
 * LinkedList
 * Doubly Linked List
 * Easy to add/ modify
 * Search takes time
 */
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
