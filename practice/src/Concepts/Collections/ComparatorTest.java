package Concepts.Collections;

import java.util.Comparator;

/**
 * Comparator
 * Compares two objects and sort them
 *
 * We need to mention the logic of sort in Comparator object in collections.sort method.
 * Class where we need to sort the object of it's type should implement the comparator.
 *
 */
public class ComparatorTest implements Comparator<ComparatorTest> {

    @Override
    public int compare(ComparatorTest o1, ComparatorTest o2) {
        return 0;
    }
}
