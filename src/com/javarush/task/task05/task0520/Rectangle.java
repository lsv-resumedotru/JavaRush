package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    int top, left, width, height;

    public Rectangle(int top){
        this.top = top;
    }
    public Rectangle(int width, int top){
        this.width = width;
        this.top = top;
    }
    public Rectangle(int left, int height, int width){
        this.left = left;
        this.height = height;
        this.width = width;
    }

    public Rectangle(Rectangle rectangle){

    }

    public static void main(String[] args) {

    }
}
