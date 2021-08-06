import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements Iterable<T>, List<T> {
    private Node first;
    private Node last;
    private int N;

    public LinkedList() {
        //insert code here
        //should initialize empty list
    }

    public void add(T item) {
        //insert code here
        ////adds an item to the end of a list
    }

    public boolean remove(T item) {
        //insert code here
        //removes a specified item from the list, returns true if successful, false if not
    }

    public int size() {
        //insert code here
        //returns the size of the list
    }

    public boolean isEmpty() {
        //insert code here
        // tells you if the list is empty, returns true if empty, false if not
    }

    private class Node {
        private T data;
        private Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public Iterator<T> iterator() { return new LinkedListIterator(); }

    private class LinkedListIterator implements Iterator<T> {
        private Node current = first;

        public T next() {
            if (!hasNext()) { throw new NoSuchElementException(); }
            T item = current.data;
            current = current.next;
            return item;
        }

        public boolean hasNext() { return current != null; }

        public void remove() { throw new UnsupportedOperationException(); }
    }

    @Override public String toString() {
        StringBuilder s = new StringBuilder();
        for (T item : this)
            s.append(item + " ");
        return s.toString();
    }
}