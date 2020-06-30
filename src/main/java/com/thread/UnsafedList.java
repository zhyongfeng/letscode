package com.thread;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 9:23 AM 2020/5/25
 * @Modified By:
 */
public class UnsafedList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
