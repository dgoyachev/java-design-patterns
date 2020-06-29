package pw.goryachev.dp.patterns.structural.bridge;

/**
 * Created by morgan on 30.06.2020
 */

//A refined abstraction.
public class Queue<T> implements FifoCollection<T>{

    private LinkedList<T> list;

    public Queue(LinkedList<T> list) {
        this.list = list;
    }

    @Override
    public void offer(T element) {
        list.addLast(element);
    }

    @Override
    public T poll() {
        return list.removeFirst();
    }
}