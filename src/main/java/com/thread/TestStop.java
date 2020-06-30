package com.thread;

/**
 * @Author: yfzhang
 * @Description:
 * 1) 试用自定义的flag控制线程，不要试用deprecated方法或者JDK的stop，destroy
 * 2）推荐让线程自己停下来
 * @Date: Created in 9:56 PM 2020/5/24
 * @Modified By:
 */
public class TestStop implements Runnable {

    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            System.out.println("thread ts is running");
        }
    }

    public void stop() {
        this.flag = false;
    }

    public static void main(String[] args) {
        TestStop ts = new TestStop();
        new Thread(ts).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("main " + i);
            if (i == 900) {
                ts.stop();
                System.out.println("ts stopped");
            }
        }
    }

}
