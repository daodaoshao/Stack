package com.company;

public class MystackByLinkedList<T> {
    private LinkedListNode<T> head = new LinkedListNode<T>(null);

    public boolean push(T t){
       // head.setNext(new LinkedListNode<T>(t));
        LinkedListNode<T> temp = new LinkedListNode<T>(t);
        temp.setNext(head);
        head = temp;
        return true;
    }
    public T pop(){

        T temp = head.getData();
        head = head.getNext();
        return temp;

    }

}
