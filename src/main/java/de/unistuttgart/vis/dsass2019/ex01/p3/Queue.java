package de.unistuttgart.vis.dsass2019.ex01.p3;


import de.unistuttgart.vis.dsass2019.ex01.p2.SpeedList;

public class Queue<T> implements IQueue<T> {

    private SpeedList<T> internalQueue = new SpeedList<>();

    /** Enqueues an element */
    @Override
    public void enqueue(final T t) {
        internalQueue.append(t);
    }

    /** Dequeues the first element */
    @Override
    public T dequeue() {
        T element = internalQueue.getElementAt(0);
        internalQueue.removeFirst();
        return element;
    }

    /** Returns the first element */
    @Override
    public T front() {
        return internalQueue.getElementAt(0);
    }

    /** Checks if the queue is empty */
    @Override
    public boolean isEmpty() {
        return internalQueue.size() == 0;
    }
}
