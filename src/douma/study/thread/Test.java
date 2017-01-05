/*
 * Copyright 2017 Wicresoft, Inc. All rights reserved.
 */
package douma.study.thread;

/**
 * Description of Test
 *
 * @author douma
 *         Created on 2017/1/5
 * @version $$Id:$$
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread();
        System.out.println(a.getState());
        a.start();
        System.out.println(a.getState());
        a.stop();
        System.out.println(a.getState());
        a.sleep(100);
        a.run();
        System.out.println(a.getState());
    }


}
