/*
 * Copyright 2017 Wicresoft, Inc. All rights reserved.
 */
package douma.study.designmodel.productconsume;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Description of Test
 *
 * @author larry.quns
 *         Created on 2017/1/5
 * @version $$Id:$$
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {

        //定义长度为5的队列，限制生产者最多生产5个产品，当队列中有>=5个产品时，生产者不再继续生产，反之生产者继续生产
        BlockingQueue<String> storageQueue = new LinkedBlockingDeque<String>(5);

        Thread producter1 = new Thread(new Producter(storageQueue, "厂A"));
        Thread producter2 = new Thread(new Producter(storageQueue, "厂B"));
        Thread comsumer = new Thread(new Consumer(storageQueue));

        producter1.start();
        producter2.start();
        comsumer.start();

        Thread.currentThread().sleep(1000);
        producter1.stop();
        producter2.stop();
        comsumer.stop();

        System.out.println("生产了"+Counter.getInstance().getProductNum());
        System.out.println("消费了"+Counter.getInstance().getConsumeNum());
        System.out.println("队列中还剩余"+storageQueue.size());

    }
}
