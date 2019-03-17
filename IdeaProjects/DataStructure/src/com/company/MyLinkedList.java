package com.company;

import java.util.concurrent.CountDownLatch;

//实现一个带头结点的单链表
    public class MyLinkedList<T>{
        private static  int CAPICITY;
        private int count;
        private Node first = new Node();

        public MyLinkedList(int n) {
            this.CAPICITY = n;
        }
        public MyLinkedList() { }


        private class Node<T>{
            T item;
            Node next;
            public Node(T t){
                this.item = t;
            }
            public Node(){

            }

        }

    public int getCount() {
        return count;
    }

    //链表的遍历
       public void visit(){
            for (Node x = first.next; x!= null; x = x.next){
                System.out.println(x.item);
            }
        }
        //链表是否为空
        public boolean isEmpty(){
            return(first.next == null);
        }
        //在链表头部增加结点
        public  void add(T t){
            Node temp = new Node(t);
            temp.next = first.next;
            first.next = temp;
            ++count;
        }
        //在链表的头部删除结点
        public void delete(){
            if(first.next != null){
                first.next = first.next.next;
                --count;
            }
            else{
                System.out.println("List is empty");
            }

        }
        //在链表的尾部插入结点
        public void addAtTail(T t){
            Node temp = first.next;
            if(temp == null){
                add(t);
            }
            else{
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = new Node(t);
                ++count;



            }

        }
        // 从链表的尾部删除结点
        public void deleteAtTail(){
            Node temp = first.next;
            Node temp2 = null;
            if(temp == null){
                System.out.println("List is empty");
            }
            else{
                while(temp.next != null){
                    temp2 = temp;
                    temp = temp.next;


                }
                temp2.next = null;
            }

        }
        // 在指定结点前插入一个结点,t为要寻找的元素，k为待插入的元素。
        public boolean  insert(T t,T k){
            Node temp = first.next;
            Node temp2 = null;
            Node newNode = new Node(k);
            if(t.equals(temp.item)){   //为第一个结点
                this.add(k);
                return true;
            }
            while( temp.next !=null && !(t.equals(temp.item))){
                temp2 = temp;
                temp = temp.next;

            }
            if(temp.next == null){
                if(!t.equals(temp.item)){
                    System.out.println("未找到对应的元素值");
                    return false;
                }

                else{
                    temp2.next = newNode;
                    newNode.next = temp;
                }
            }
            else{
                temp2.next = newNode;
                newNode.next = temp;
            }
            return true;

        }
        //删除某结点
        public boolean  delete(T t){
            Node temp = first.next;
            Node temp2 = null;
            if(t.equals(temp.item)){   //为第一个结点
                first.next = temp.next;
                --count;
            }
            while (temp != null && !t.equals(temp.item)){
                temp2 = temp;
                temp = temp.next;
                --count;
            }
            temp2.next = temp.next;
            return true;
        }
        //链表反转
        public MyLinkedList<T> reverseLinkedList(){
            MyLinkedList<T> temp = new MyLinkedList<T>();
            for(Node<T> x = first.next; x != null; x = x.next){
                temp.add(x.item);
            }

            return temp;

        }
        //检测链表是否有序
        public boolean isOrdered(){
            boolean flag = true;
            for(Node x = first.next; x.next != null; x = x.next){
                if(Integer.parseInt(x.item.toString()) > Integer.parseInt(x.next.item.toString())  ){
                    flag = false;
                }
            }
            return flag;
        }


    }

