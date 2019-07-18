package EpamLessons.EpLessons.EpamLessons.Lesson16072019;

import java.util.Iterator;

public class MySortedSet<E extends Comparable<E>> extends MyAbstractSortedSet<E> {
    private Node<E> head;
    private int size;

    @Override
    public boolean add(E e) {
        //If empty
        if (head == null) {
            head = new Node<>(e, null);
            ++size;
            return true;
        } else {
            Node<E> n = head;
            if (n.item.compareTo(e) > 0) {
                head = new Node<>(e, n);
                ++size;
                return true;
                // If head less than new
            } while (n!= null &&)
        }
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        Node temp = null;
        // if only one element
        if (head != null && head.next == null) {
            temp = head;
            head = null;
            size--;
            return true;
        }
    }

    @Override
    public void clear() {
        while (size > 0) {
            eNode.remove();
        }

    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
