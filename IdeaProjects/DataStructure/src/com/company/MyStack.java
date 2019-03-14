package com.company;

public class MyStack<T> {
    private T[] item;
    private int count;
    private int n;

    public MyStack( int n) {
        this.item = (T[]) new Object[n];
        this.count = 0;
        this.n = n;
    }

    public boolean push(T t){
        if(this.count < n){
            item[count] = t;
            ++count;
            return true;
        }
        else {
            return false;
        }
    }
    public T pop(){
        if (this.count > 0){
            --count;
            return this.item[count];
        }
        else {
            System.out.println("Stack is empty");
            return (T) null;
        }
    }
}
