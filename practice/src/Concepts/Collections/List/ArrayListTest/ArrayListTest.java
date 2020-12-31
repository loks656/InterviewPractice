package Concepts.Collections.List.ArrayListTest;


import Concepts.Collections.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListTest {
    ArrayList<Student> CSEA = new ArrayList();
    Integer a = new Integer(10);
    Comparator<Student> com = (Student s1, Student s2) -> s1.getName().compareToIgnoreCase(s2.getName());
    public void operations() {
        CSEA.add(new Student("loks",56));
        CSEA.add(new Student("Dogga",19));
        CSEA.add(new Student("Venki",57));
        CSEA.add(new Student("Srinith",49));
        Collections.sort(CSEA);
        for (Student student : CSEA) {
//            System.out.println(student.getName());
//            System.out.println(student.getRollNumber());
            System.out.println(student);
        }
    }

}
