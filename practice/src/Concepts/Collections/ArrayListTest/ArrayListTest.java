package Concepts.Collections.ArrayListTest;


import Concepts.Collections.Student;
import org.w3c.dom.css.CSSRule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListTest {
    ArrayList<Student> CSEA = new ArrayList();
    Comparator<Student> com = (Student s1, Student s2) -> s1.getName().compareToIgnoreCase(s2.getName());
    public void operations() {
        CSEA.add(new Student("loks",56));
        CSEA.add(new Student("Dogga",19));
        CSEA.add(new Student("Venki",57));
        Collections.sort(CSEA,com);
        for (Student student : CSEA) {
            System.out.println(student.getName());
            System.out.println(student.getRollNumber());
        }
    }
}
