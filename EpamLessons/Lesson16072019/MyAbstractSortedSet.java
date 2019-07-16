package EpamLessons.Lesson16072019;

import java.util.*;

public abstract class MyAbstractSortedSet<E> extends AbstractSet<E> {
    static class Node<E> {
        E item;
        Node<E> next;

        Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }

    public abstract boolean add(E e);

    public abstract boolean contains(Object o);

    public abstract boolean remove(Object o);

    public abstract void clear();

    public abstract Iterator<E> iterator();

    public abstract int size();


}
