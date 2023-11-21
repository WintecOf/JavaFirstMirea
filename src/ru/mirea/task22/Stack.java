package ru.mirea.task22;

import java.util.Arrays;

public class Stack {
    private Node top;
    private int size;

    public Stack() {
        size = 0;
    }

    public Stack(double[] dataArray){
        Arrays.stream(dataArray).forEach(this::push);
        size = dataArray.length;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    //Добавление сверху
    public void push(double data){
        if(top == null)
            top = new Node(data);
        else
        {
            top = new Node(data,top);
        }
        size++;
    }
    //Просмотр верхнего элемента
    public double peekTop() {
        return top.getData();
    }
    //Удаление верхнего элемента
    public double pop() {
        final double data = top.getData();
        top = top.getNext();
        size--;
        return data;
    }
    //Вывод стека с указанием вершины
    public void print() {
        if(top == null)
            System.out.println("The stack is empty");

        Node current = top;
        System.out.println(current.getData() + " <--");
        current = current.getNext();

        while(current != null)
        {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}
