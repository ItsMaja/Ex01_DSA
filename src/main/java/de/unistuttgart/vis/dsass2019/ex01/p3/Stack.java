package de.unistuttgart.vis.dsass2019.ex01.p3;

import de.unistuttgart.vis.dsass2019.ex01.p2.SpeedList;

public class Stack<T> implements IStack<T> {

    private SpeedList<T> internalStack = new SpeedList<>();

    /** Adds new element to the top */
    @Override
    public void push(final T t) {
        internalStack.prepend(t);
    }

    /** Removes and returns the top element */
    @Override
    public T pop() {
        T element = internalStack.getElementAt(0);
        internalStack.removeFirst();
        return element ;
    }

    /** Returns the top element without removing */
    @Override
    public T top() {
        return internalStack.getElementAt(0);
    }

    /** Checks if the stack is empty */
    @Override
    public boolean isEmpty() {
        return internalStack.size() == 0;
    }
}
