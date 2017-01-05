/*
 * Copyright 2017 Wicresoft, Inc. All rights reserved.
 */
package douma.study.designmodel.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Description of Subject
 * 观察者类
 * @author douma
 *         Created on 2017/1/5
 * @version $$Id:$$
 */
public abstract class Subject {

    //观察对象list
    List<Observer> list = new ArrayList<Observer>();

    //观察者名称
    public String name;

    //观察者状态
    private String state = "STATE-1";

    //增加观察对象
    public void registObserver(Observer observer){
        observer.setState(this.state);
        list.add(observer);
        System.out.println(observer.getName()+"关注了主题"+name);
    }

    //删除观察对象
    public void deleteObserver(Observer observer){
        list.remove(observer);
    }

    //通知观察对象
    public void nodifyAll(String state){
        if(!this.state.equals(state)){
            System.out.println("观察者状态改变，从["+this.state+"]变为["+state+"]");
            this.state = state;
        }
        for(int i=0; i<list.size(); i++){
            list.get(i).doNodify(state);
        }
    }

}
