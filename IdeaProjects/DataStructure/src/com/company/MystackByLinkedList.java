package com.company;

public class MystackByLinkedList<T> {
    private LinkedListNode<T> head = new LinkedListNode<T>(null);

    public boolean push(T t){
        head.setNext(new LinkedListNode<T>(t));
        head = head.getNext();
        return true;
    }
    public T pop(){
        while (head.getNext() != null){
            head = head.getNext();
        }
        T temp = head.getData();
        head.setNext(null);
        return temp;

    }

}
