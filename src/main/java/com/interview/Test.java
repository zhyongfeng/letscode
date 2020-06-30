package com.interview;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 10:37 AM 2020/6/26
 * @Modified By:
 */
public class Test {
    public static int aMethod(int i) throws Exception {
        try {
            return i / 10;
        } catch (Exception ex) {
            throw new Exception("exception in a Method");
        } finally {
            System.out.printf("finally");
        }
    }

    public static void main(String[] args) {
        try {
            aMethod(0);
        } catch (Exception ex) {
            System.out.printf("exception in main");
        }
        System.out.printf("finished");
    }
}
