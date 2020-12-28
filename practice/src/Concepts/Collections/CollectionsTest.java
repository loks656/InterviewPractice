package Concepts.Collections;

import java.util.ArrayList;

/**
 * Collection Interface
 * Collection --> Iterable
 * Methods
 * boolean add(E e) : adds an element at the end and returns bool
 * <b>addAll(Collection<E>)</b> -> adds a collection at the end of
 * addAll(int index, Collection<E>) -> adds a collection from specific index
 * public boolean remove(Object o) -> removes an object from collection
 * publcic boolean removeAll(Collection) -> removes all the specified collection
 * public int size() -> returns the size of the collection
 * public void clear() -> removes all the elements in the collection
 *public boolean contains() -> used to search an element in a collection
 * public boolean containsAll() -> used to search a specific collection in a collection
 * public Iterator iterator() -> returns an iterator
 * public Object[] toArray() -> converts a collection into an array
 * public <T> T[] toArray(T[] a) -> It converts collection into array.
 * Here, the runtime type of the returned array is that of the specified array.
 *public boolean isEmpty() -> returns whether a collection is empty or not
 * public boolean equals(Object O) -> compares two objects and returns whether equal or not
 *
 *
 *
 * default boolean removeIf(Predicate<? super E> filter) :
 * It is used to delete all the elements of the collection that satisfy the specified predicate.
 * public boolean retainAll(Collection<?> c) :
 * It is used to delete all the elements of invoking collection except the specified collection.
 *
 */

/**
 * Iterator Interface
 * Root of collection interface
 * public boolean hasNext() -> returns whether there is an element in a collection or not
 * public Object next() -> returns next element of a particular collection
 */

/**
 * List Interface
 * ArrayList
 * Linked List
 * Stack
 * Vector
 */
public class CollectionsTest {

}
