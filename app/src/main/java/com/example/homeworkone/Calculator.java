package com.example.homeworkone;

import java.io.Serializable;

public class Calculator implements Serializable {
    private String str_count = "";
    private int count;
    private int q;


    private String zero = "0";
    private String one = "1";


    private String two = "2";
    private String three = "3";
    private String four = "4";
    private String five = "5";
    private String six = "6";
    private String seven = "7";
    private String eight = "8";
    private String nine = "9";


    public String getStr_count() {
        return str_count;
    }

    public void setStr_count(String str_count) {
        this.str_count = str_count;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public String getZero() {
        return zero;
    }

    public String getOne() {
        return one;
    }

    public String getTwo() {
        return two;
    }

    public String getThree() {
        return three;
    }

    public String getFour() {
        return four;
    }

    public String getFive() {
        return five;
    }

    public String getSix() {
        return six;
    }

    public String getSeven() {
        return seven;
    }

    public String getEight() {
        return eight;
    }

    public String getNine() {
        return nine;
    }

    public int getCount() {
        return count;
    }

    public void delChar() {
        str_count = str_count.substring(0, str_count.length() - 1);
    }

    public int sum(int a, int b) {
        count = a + b;
        return count;
    }

    public int min(int a, int b) {
        count = a - b;
        return count;
    }

    public int multip(int a, int b) {
        count = a * b;
        return count;
    }

    public int div(int a, int b) {
        count = a / b;
        return count;
    }


}
