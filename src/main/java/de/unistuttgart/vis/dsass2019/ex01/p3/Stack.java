package de.unistuttgart.vis.dsass2019.ex01.p3;

import de.unistuttgart.vis.dsass2019.ex01.p2.SpeedList;

public class Stack<T> implements IStack<T> {

    private SpeedList<T> internalStack = new SpeedList<>();


    @Override
    public void push(T t) {
        internalStack.prepend(t);
    }

    @Override
    public T pop() {

        T element = internalStack.getElementAt(0);
        internalStack.removeFirst();

        return element ;
    }

    @Override
    public T top() {
        return internalStack.getElementAt(0);
    }

    @Override
    public boolean isEmpty() {

        return internalStack.getHead() == null;
    }
}
