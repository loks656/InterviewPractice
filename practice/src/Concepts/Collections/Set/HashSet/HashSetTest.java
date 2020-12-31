package Concepts.Collections.Set.HashSet;

import Concepts.Collections.Student;

import java.util.*;

/**
 * HashSet
 *
 * HashSet -> AbstractSet --> Set -> Collection -> Iterable
 *
 */

/**
 * Stores elements using Hashing.
 *
 */
public class HashSetTest {
    HashSet<Student> cseb = new HashSet<>();

    public void operations() {
        cseb.add(new Student("loks",56));
        cseb.add(new Student("venky",57));
        cseb.add(new Student("Srinith",49));
        for (Student student : cseb) {
            System.out.println(student);
        }
        //size
        System.out.println(cseb.size());
        Iterator<Student> itr = cseb.iterator();
        //Iterator
        System.out.println("Iterator");
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        //clear
        cseb.clear();
        System.out.println("After clear");
        for (Student student : cseb) {
            System.out.println(student);
        }
        cseb.add(new Student("loks",56));
        cseb.add(new Student("venky",57));
        cseb.add(new Student("Srinith",49));
        //reatain all
        HashSet<Student> csea = (HashSet<Student>) cseb.clone();
        csea.add(new Student("Vijju",58));
        System.out.println("After clone");
        for (Student student : csea) {
            System.out.println(student);
        }
        System.out.println("cseb after adding in csea");
        for (Student student : cseb) {
            System.out.println(student);
        }
    }
}
