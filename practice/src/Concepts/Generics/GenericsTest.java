package Concepts.Generics;

/**
 * What is it?
 * instead of providing data type, we provide generics so that we can
 * store generic data types.
 * Example:
 * ArrayList<Integer>() al= new AL() -> al.add("loks"); is not supported
 *
 * Exceptions
 * It works only with class, T should be a class.
 */

//Example
class Container <T> {
    T value;
    public Container(T value) {
        this.value = value;
    }
    public void show() {
        System.out.println(this);
        System.out.println(this.value);
        System.out.println(value.getClass().getName());
    }
}
public class GenericsTest {
    public static void main(String[] args) {
        Container<String> container = new Container("loks");
        Container<Integer> integerContainer = new Container(1);
        container.show();
        integerContainer.show();
    }

}
