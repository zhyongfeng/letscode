package com.interview;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 10:26 AM 2020/6/26
 * @Modified By:
 */
public class Square {
    long width;
    public Square(long l) {
        width = l;
    }
    public static void main(String arg[]) {
        Square a, b, c;
        a = new Square(42L);
        b = new Square(42L);
        c = b;
        long s = 42L;
        System.out.println(a == b);
        System.out.println(a.equals(s));
        System.out.println(c == b);
    }
}
