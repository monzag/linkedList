package com.monzag;

public class NodeDoubly {

    private Object data;
    private Node previous;
    private Node next;

    public NodeDoubly(Object data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    public NodeDoubly(Object data, Node previous, Node next) {
        this.data = data;
        this.previous = previous;
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

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
