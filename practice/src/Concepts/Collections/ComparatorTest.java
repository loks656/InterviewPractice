package Concepts.Collections;

import java.util.Comparator;

/**
 * Comparator
 * Compares two objects and sort them
 *
 * We need to mention the logic of sort in Comparator object in collections.sort method.
 *
 *
 *
 */

/**
 * Compatator vs Comparable
 *
 * Comparator
 * Can be used when we have a class where we cannot edit the source code
 * return type int : 1=> greater -1 => less 0=> equals
 *
 *
 *
 * Comparable
 * Can be used when we are writing the class from scratch, like custom class
 * return type int : 1=> greater -1 => less 0=> equals
 * Default Classes like Integer, String, Double implements Comparable
 *
 *
 */
public class ComparatorTest implements Comparator<ComparatorTest> {

    @Override
    public int compare(ComparatorTest o1, ComparatorTest o2) {
        return 0;
    }
}
