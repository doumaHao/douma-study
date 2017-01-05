/*
 * Copyright 2017 Wicresoft, Inc. All rights reserved.
 */
package douma.study.designmodel.single;

/**
 * Description of Single
 *
 * 设计模式之--单例模式
 * @author larry.quns
 *         Created on 2017/1/4
 * @version $$Id:$$
 */
public class Single {

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    private static Single instance;

    private Single(){}

    public static synchronized Single getInstance() {
        if(instance == null){
            //同步代码块（对象未初始化时，使用同步代码块，保证多线程访问时对象在第一次创建后，不再重复被创建）
            synchronized (Single.class){
                if(instance == null) {
                    instance = new Single();
                }
            }
            instance = new Single();
        }
        return instance;
    }

}
