package com.example.homeworkone;

import java.io.Serializable;

public class Calculator implements Serializable {
    private int count;
    private int zero = 0;
    private int one = 1;
    private int two = 2;
    private int three = 3;
    private int four = 4;
    private int five = 5;
    private int six = 6;
    private int seven = 7;
    private int eight = 8;
    private int nine = 9;

    public int getZero() {
        count=zero;
        return zero;
    }

    public int getOne() {
        count=one;
        return one;
    }

    public int getTwo() {
        count=two;
        return two;
    }

    public int getThree() {
        count=three;
        return three;
    }

    public int getFour() {
        count=four;
        return four;
    }

    public int getFive() {
        count=five;
        return five;
    }

    public int getSix() {
        count=six;
        return six;
    }

    public int getSeven() {
        count=seven;
        return seven;
    }

    public int getEight() {
        count=eight;
        return eight;
    }

    public int getNine() {
        count=nine;
        return nine;
    }

    public int getCount() {
        return count;
    }

    public int sum(int a, int b){
        int c = a+b;
        return c;

    }



}
