package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        MyLinkedList<Integer>  list = new MyLinkedList<Integer>();
//        //System.out.println(list.isEmpty());
//        list.addAtTail(1);
//        list.addAtTail(3);
//        list.addAtTail(4);
//        list.addAtTail(100);
//        // boolean a = list.insert("a", "wwwww");
//
//        //list = list.reverseLinkedList();
//        MyLinkedList<Integer>  list2 = new MyLinkedList<Integer>();
//        list2.addAtTail(56);
//        list2.addAtTail(63);
//        list2.addAtTail(89);
//        list2.addAtTail(250);
//        //MyLinkedList<Integer> list3 = list.merge(list2);
//        //list3.visit();
//        // list2.visit();
//        MystackByLinkedList<Double> stack = new MystackByLinkedList<>();
//        stack.push(3.56);
//        stack.push(5.6);
//        stack.push(24.44);
//        stack.push(8.07);
//        stack.push(78.07);
//        stack.push(123.07);
//        stack.push(456.08);
//        stack.push(890.09);
//        stack.push(43.10);
//        stack.push(76.11);
//        stack.push(166.11);
//        Double temp = Double.parseDouble(stack.pop().toString());
//       System.out.println(temp);
//        temp = Double.parseDouble(stack.pop().toString());
//        System.out.println(temp);
//        temp = Double.parseDouble(stack.pop().toString());
//        System.out.println(temp);
//        temp = Double.parseDouble(stack.pop().toString());
//        System.out.println(temp);
//        temp = stack.pop();
//        temp = stack.pop();
//        temp = stack.pop();
//        stack.push(5.3);
//        stack.push(3214.45);
//        stack.push(12.44);
//        stack.push(89.45);
//        temp = stack.pop();
//        System.out.println(temp);
//        temp = stack.pop();
//        System.out.println(temp);
        MyLinkedList<Integer> list2 = new MyLinkedList(5);
        list2.addAtTail(56);
        list2.addAtTail(63);
       list2.addAtTail(89);
       list2.addAtTail(250);
       list2.visit();
       list2.delete(56);
       list2.visit();
        System.out.println(list2.getCount());

    }
}
