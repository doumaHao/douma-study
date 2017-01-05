/*
 * Copyright 2017 Wicresoft, Inc. All rights reserved.
 */
package douma.study.designmodel.factory;

/**
 * Description of InterfaceFactory
 *
 * @author larry.quns
 *         Created on 2017/1/4
 * @version $$Id:$$
 */
public interface InterfaceFactory {

    public MailServer getMailServer(String type);

}
