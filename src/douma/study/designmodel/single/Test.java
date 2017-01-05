/*
 * Copyright 2017 Wicresoft, Inc. All rights reserved.
 */
package douma.study.designmodel.single;

/**
 * Description of Test
 *
 * @author larry.quns
 *         Created on 2017/1/4
 * @version $$Id:$$
 */
public class Test {

    public static void main(String[] args) {

        Single single1 = Single.getInstance();
        Single single2 = Single.getInstance();
        single1.setData("111");
        single2.setData("222");
        System.out.println(single1.getData());
        System.out.println(single2.getData());

    }

}
