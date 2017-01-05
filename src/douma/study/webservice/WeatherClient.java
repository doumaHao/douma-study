/*
 * Copyright 2017 Wicresoft, Inc. All rights reserved.
 */
package douma.study.webservice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Description of WeatherClient
 *
 * @author douma
 *         Created on 2017/1/5
 * @version $$Id:$$
 */
public class WeatherClient {

    public static void main(String[] args) throws IOException {

        //请求查询的城市
        String city = "宣城";

        //1,创建Socket对象，和服务器端建立联系
        Socket socket = new Socket("127.0.0.1", 12345);

        //2,取得输出流，传入请求以及参数
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        dataOutputStream.writeUTF(city);
        System.out.println("客户端请求查询["+city+"]的天气");

        //3,取得输入流，获得服务器端返回的结果
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        String result = dataInputStream.readUTF();
        System.out.println("客户端接受到查询结果,"+city+"为"+result);

        //4,关闭流
        dataOutputStream.close();
        dataInputStream.close();

    }

}
