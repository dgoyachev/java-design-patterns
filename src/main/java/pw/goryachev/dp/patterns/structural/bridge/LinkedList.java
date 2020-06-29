package pw.goryachev.dp.patterns.structural.bridge;

/**
 * Created by morgan on 30.06.2020
 */

//This is the implementor.
//Note that this is also an interface
//As implementor is defining its own hierarchy which not related
//at all to the abstraction hierarchy.
public interface LinkedList<T> {

    void addFirst(T element);

    T removeFirst();

    void addLast(T element);

    T removeLast();

    int getSize();
}