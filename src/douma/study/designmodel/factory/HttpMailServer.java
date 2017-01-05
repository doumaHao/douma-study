/*
 * Copyright 2017 Wicresoft, Inc. All rights reserved.
 */
package douma.study.designmodel.factory;

/**
 * Description of HttpMailServer
 *
 * @author larry.quns
 *         Created on 2017/1/4
 * @version $$Id:$$
 */
public class HttpMailServer extends MailServer {

    public void getConnect(){
        System.out.println("HTTP类型--连接邮件服务器");
    }
}
