/*
 * Copyright 2017 Wicresoft, Inc. All rights reserved.
 */
package douma.study.designmodel.factory;

/**
 * Description of Test
 *
 * @author larry.quns
 *         Created on 2017/1/4
 * @version $$Id:$$
 */
public class Test {

    public static void main(String[] args) {
        ServerFactory serverFactory = new ServerFactory();
        MailServer mailServer = serverFactory.getMailServer("HTTP");
        mailServer.getConnect();
    }
}
