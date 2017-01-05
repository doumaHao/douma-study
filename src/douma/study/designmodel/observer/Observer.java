/*
 * Copyright 2017 Wicresoft, Inc. All rights reserved.
 */
package douma.study.designmodel.observer;

/**
 * Description of Observer
 * 被观察者对象类
 * @author douma
 *         Created on 2017/1/5
 * @version $$Id:$$
 */
public abstract class Observer {

    //被观察对象状态
    private String state;
    //被观察对象名称
    private String name;

    Observer(String name){
        this.name = name;
    }

    public void doNodify(String state){
        System.out.println("被观察对象"+name+"状态由["+this.state+"]改变为["+state+"]");
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
