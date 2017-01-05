/*
 * Copyright 2017 Wicresoft, Inc. All rights reserved.
 */
package douma.study.designmodel.productconsume;

import java.util.concurrent.BlockingQueue;

/**
 * Description of Consumer
 *
 * @author larry.quns
 *         Created on 2017/1/5
 * @version $$Id:$$
 */
public class Consumer implements Runnable {

    private BlockingQueue storageQueue;

    Consumer(BlockingQueue storageQueue){
        this.storageQueue = storageQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.currentThread().sleep(10);
                Counter.getInstance().setConsumeNum(Counter.getInstance().getConsumeNum()+1);
                System.out.println("消费了"+storageQueue.take()+"，现在有"+storageQueue.size()+"个");;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
