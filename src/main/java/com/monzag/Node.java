package com.monzag;

public class Node {

    private Object data;
    private Node next;
    private Node previous;

    public Node(Object data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(Object data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
