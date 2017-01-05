/*
 * Copyright 2017 Wicresoft, Inc. All rights reserved.
 */
package douma.study.designmodel.productconsume;

/**
 * Description of Storage
 *
 * @author larry.quns
 *         Created on 2017/1/5
 * @version $$Id:$$
 */
public class Storage{

    //仓库最大库存
    public static final int MAX_NUM = 3;

    //仓库当前库存
    public static int CUR_NUM = 0;

    //仓库实例
    public static Storage instence = null;


    private Storage(){}

    //获得仓库实例
    public static synchronized Storage getInstence() {
        if(instence == null) {
            instence = new Storage();
        }
        return instence;
    }

    public synchronized void product() {
        if(CUR_NUM >= MAX_NUM){
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        CUR_NUM++;
        System.out.println("生产：【"+Thread.currentThread().getName()+"】生产了1个商品，现在仓库中有"+CUR_NUM+"个商品");

        notify();
    }

    public synchronized void consume() {
        if(CUR_NUM<=0) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        CUR_NUM--;
        System.out.println("消费：【"+Thread.currentThread().getName()+"】消费了1个商品，现在仓库中有"+CUR_NUM+"个商品");

        notify();
    }

}
