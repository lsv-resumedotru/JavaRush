package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    public void initialize(int top, int left, int width, int height)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(int width, int height)
    {
        this.height = width;
        this.width = height;
    }

    public void initialize(int height)
    {
       this.width = height;
    }

    public void initialize (Rectangle rectangle)
    {

    }

    public static void main(String[] args) {

    }
}
