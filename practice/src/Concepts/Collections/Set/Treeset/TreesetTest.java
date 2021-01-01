package Concepts.Collections.Set.Treeset;

import Concepts.Collections.Set.HashSet.HashSetTest;
import Concepts.Collections.Student;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet
 * TreeSet -> AstractSet --> Set => Collection => Iterable
 */


public class TreesetTest {
    /**
     * Stores unique elements
     * Access and Retrieval times are fast
     * Null elements are not allowed
     * non synchronized
     * Sorts in ascending order
     */
    TreeSet<Student> sts;
    Student s1;
    TreeSet<Student> sts1;
    public TreesetTest() {
        sts = new TreeSet();
        s1 = new Student("dogga",19);
        sts1 = (TreeSet<Student>) sts.clone();
    }
    public void operations() {
        add();
        System.out.println(sts.ceiling(s1));
        System.out.println("Poll First"+ sts1.pollFirst());
        System.out.println("Poll Last"+sts.pollLast());

    }

    /**
     * adds elements into set
     */
    public void add() {
        sts.add(new Student("Venki",57));
        sts.add(new Student("loks",56));
        sts.add(new Student("Srinith",49));
        sts.add(new Student("Vijay",58));
        sts.add(s1);
    }

    /**
     * Iterator
     */
    public void print() {
        Iterator<Student> itr = sts.iterator();
        System.out.println("Iterator");
        while (itr.hasNext())
            System.out.println(itr.next());
    }
    public void printDesc() {
        System.out.println("Descenging Iterator");
        Iterator<Student> itr1 = sts1.descendingIterator();
        while (itr1.hasNext())
            System.out.println(itr1.next());
    }
}
