package com.interview;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 11:54 AM 2020/3/12
 * @Modified By:
 */
public class VolatileTest {


    private static volatile boolean initFlag = false;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("waiting data ...");
                while (!initFlag) {
                }
                System.out.println("success ...");
            }
        }).start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                prepareData();
            }
        }).start();

    }

    public static void prepareData() {
        System.out.println("preparing data begin...");
        initFlag = true;
        System.out.println("preparing data end...");

    }

}
