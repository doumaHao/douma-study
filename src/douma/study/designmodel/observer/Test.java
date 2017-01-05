/*
 * Copyright 2017 Wicresoft, Inc. All rights reserved.
 */
package douma.study.designmodel.observer;

/**
 * Description of Test
 *
 * @author douma
 *         Created on 2017/1/5
 * @version $$Id:$$
 */
public class Test {

    public static void main(String[] args) {

        ConcreteSubject xinwen = new ConcreteSubject("STATE_1", "新闻");

        ConcreteObserver xiaowang = new ConcreteObserver("小王");
        ConcreteObserver xiaozhang = new ConcreteObserver("小张");
        ConcreteObserver xiaozhao = new ConcreteObserver("小赵");

        xinwen.registObserver(xiaowang);
        xinwen.registObserver(xiaozhang);

        xinwen.nodifyAll("STATE_2");
    }

}
