package com.wm;

public class Test {

    public static void main(String[] argc){
        long a=90000000l;
        long b =100000l;
        int c = Integer.MAX_VALUE;
        long d = Long.MAX_VALUE;
        if(a * b > c){
            System.out.println("超过Int");
        }
        if(a * b > d){
            System.out.println("超过Long");
        }
    }
}
