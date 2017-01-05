/*
 * Copyright 2017 Wicresoft, Inc. All rights reserved.
 */
package douma.study.designmodel.observer;

/**
 * Description of ConcreteSubject
 * 主题类
 * @author douma
 *         Created on 2017/1/5
 * @version $$Id:$$
 */
public class ConcreteSubject extends Subject {

    private String state;

    public ConcreteSubject(String state, String name){
        this.state = state;
        this.name =name;
    }

    public void change(String state){
        this.nodifyAll(state);
    }

}
