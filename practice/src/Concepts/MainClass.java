package Concepts;

import Concepts.Collections.Set.HashSet.HashSetTest;
import Concepts.Collections.Set.Treeset.TreesetTest;

public class MainClass {
    public static void main(String[] args) {
//        ArrayListTest arrayListTest = new ArrayListTest();
//        arrayListTest.operations();
        HashSetTest hashSetTest = new HashSetTest();
        hashSetTest.operations();
        //TreeSet
        TreesetTest treesetTest = new TreesetTest();
        treesetTest.operations();
    }
}
