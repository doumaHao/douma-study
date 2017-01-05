/*
 * Copyright 2017 Wicresoft, Inc. All rights reserved.
 */
package douma.study.designmodel.productconsume;

/**
 * Description of Counter
 *
 * @author larry.quns
 *         Created on 2017/1/5
 * @version $$Id:$$
 */
public class Counter {

    private static int productNum = 0;
    private static int consumeNum = 0;

    private static Counter instance = null;
    private Counter(){};

    public static synchronized Counter getInstance(){
        if(instance == null){
            instance = new Counter();
        }
        return instance;
    }

    public static int getProductNum() {
        return productNum;
    }

    public static void setProductNum(int productNum) {
        Counter.productNum = productNum;
    }

    public static int getConsumeNum() {
        return consumeNum;
    }

    public static void setConsumeNum(int consumeNum) {
        Counter.consumeNum = consumeNum;
    }
}
