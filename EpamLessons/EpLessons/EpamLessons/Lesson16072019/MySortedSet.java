package EpamLessons.EpLessons.EpamLessons.Lesson16072019;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MySortedSet<E extends Comparable<E>> extends MyAbstractSortedSet<E> {
    private Node<E> head;
    private int size;

    @Override
    public boolean add(E e) {
        //If empty
        Node<E> prev = null;
        Node<E> next = head;
        while (next != null) {
            int comparisonResult = e.compareTo(next.item);
            if (comparisonResult < 0) {
                break;
            }
            if (comparisonResult == 0) {
                break;
            }
            if (comparisonResult == 0) {
                return false;
            }
            prev = next;
            next = next.next;
        }

        Node<E> node = new Node<>(e, next);
        if (prev == null) {
            head = node;
        } else {
            prev.next = node;
        }
        size++;
        return true;
//        if (head == null) {
//            head = new Node<>(e, null);
//            ++size;
//            return true;
//        } else {
//            Node<E> n = head;
//            if (n.item.compareTo(e) > 0) {
//                head = new Node<>(e, n);
//                ++size;
//                return true;
//                // If head less than new
//            } while (n!= null &&) {
//
//            }
//        }
    }


    @Override
    public boolean contains(Object o) {
        if (isEmpty()) {
            return false;
        }
        Node<E> current = head;
        if (current != null && head.next.equals(o)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean remove(Object o) {
        Node<E> temp = null;
        // if only one element
        if (head != null && head.next == null) {
            temp = head;
            head = null;
            size--;

        }
        return true;
    }

    @Override
    public void clear() {
//        while (size > 0) {
//            eNode.remove();
//        }
        head = null;
        size = 0;

    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                E item = current.item;
                current = current.next;
                return item;
            }
        };
    }

    @Override
    public int size() {
        return size;
    }
}
