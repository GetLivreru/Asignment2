public class MyLinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;
        public Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
