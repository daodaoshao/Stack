package com.company;

public class LinkedListNode<T> {
     private T data;
     private LinkedListNode next;

    public void visit(){
        for (LinkedListNode x = this; x.next != null; x = x.next){
            System.out.println(x.data);
        }
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
    public LinkedListNode(T t){
            this.setData(t);
    }

    public LinkedListNode<T> getNext() {
        return next;
    }

    public T getData() {
        return data;
    }
}
