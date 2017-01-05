/*
 * Copyright 2017 Wicresoft, Inc. All rights reserved.
 */
package douma.study.designmodel.productconsume;

import java.util.concurrent.BlockingQueue;

/**
 * Description of Producter
 *
 * @author larry.quns
 *         Created on 2017/1/5
 * @version $$Id:$$
 */
public class Producter implements Runnable {

    private BlockingQueue storageQueue;
    private String productMark;
    private int no = 1;

    Producter(BlockingQueue storageQueue,String productMark) {
        this.storageQueue = storageQueue;
        this.productMark = productMark;
    }

    @Override
    public void run() {

        while (true){
            try {
                Thread.currentThread().sleep(30);
                storageQueue.put(productMark+no);
                Counter.getInstance().setProductNum(Counter.getInstance().getProductNum()+1);
                System.out.println("生产了"+(productMark+no)+"，现在有"+storageQueue.size()+"个");
                no++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
