/*
 * Copyright 2017 Wicresoft, Inc. All rights reserved.
 */
package douma.study.designmodel.factory;

/**
 * Description of ServerFactory
 *
 * @author larry.quns
 *         Created on 2017/1/4
 * @version $$Id:$$
 */
public class ServerFactory implements InterfaceFactory{

    public MailServer getMailServer(String type) {
        if("POP3".equals(type)) {
            return new Pop3MailServer();
        } else if("HTTP".equals(type)) {
            return new HttpMailServer();
        } else {
            return null;
        }
    }
}
