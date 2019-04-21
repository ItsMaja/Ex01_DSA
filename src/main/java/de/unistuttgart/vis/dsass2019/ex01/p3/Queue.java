package de.unistuttgart.vis.dsass2019.ex01.p3;


import de.unistuttgart.vis.dsass2019.ex01.p2.SpeedList;

public class Queue<T> implements IQueue<T> {

    private SpeedList<T> internalQueue = new SpeedList<>();


    @Override
    public void enqueue(T t) {
        internalQueue.append(t);
    }

    @Override
    public T dequeue() {
        T element = internalQueue.getElementAt(0);
        internalQueue.removeFirst();
        return element;
    }

    @Override
    public T front() {
        return internalQueue.getElementAt(0);
    }

    @Override
    public boolean isEmpty() {

        return internalQueue.getHead() == null;
    }
}
