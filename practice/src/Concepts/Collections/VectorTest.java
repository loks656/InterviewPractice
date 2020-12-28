package Concepts.Collections;

import java.util.Vector;



/**
 * Vector
 * Vector -> Abstract List--> List -> Collection -> Iterable
 *
 * Nothing but Dynamic Array
 * Increses it's size by 100%
 * Methods in vector are synchronized
 *
 */

/**
 * Vector vs ArrayList
 * Vector
 * Capacity by 100%
 * Thread Safe
 * Slow
 *
 * ArrayList
 * Capacity by 50%
 * Not threadsafe
 * Fast
 */

/**
 * I use ArrayList over Vector anytime.
 */

public class VectorTest {
    Vector<Student> studentVector = new Vector<>();
    public void vectionOper() {
        studentVector.add(new Student("vec loks",056));

    }
}
