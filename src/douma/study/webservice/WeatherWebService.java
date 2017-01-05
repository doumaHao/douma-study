/*
 * Copyright 2017 Wicresoft, Inc. All rights reserved.
 */
package douma.study.webservice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Description of HelloWebService
 *
 * @author douma
 *         Created on 2017/1/5
 * @version $$Id:$$
 */

public class WeatherWebService {

    public static void main(String[] args) throws IOException {

        //1，创建ServerSocket对象
        ServerSocket serverSocket = new ServerSocket(12345);
        while(true) {
            //2.等待客户端连接，阻塞的方法
            final Socket socket = serverSocket.accept();

            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        //3.使用输入流接受客户端发送的请求
                        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                        String city = dataInputStream.readUTF();
                        System.out.println("服务端获取到客户端请求的数据 city="+city);

                        Thread.currentThread().sleep(2000);

                        //4.逻辑处理
                        String result = "";
                        if("上海".equals(city)){
                            result = "雷阵雨";
                        } else if("北京".equals(city)){
                            result = "雾霾";
                        } else if("成都".equals(city)){
                            result = "晴天";
                        } else if("宣城".equals(city)){
                            result = "绝逼好天气";
                        } else{
                            result = "暂时只支持【上海，北京，成都，宣城】四个城市的天气查询";
                        }

                        //5.使用输出流，返回查询结果
                        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                        dataOutputStream.writeUTF(result);
                        System.out.println("服务端返回天气查询结果"+city+"为"+result);

                        //6.关闭流
                        dataInputStream.close();
                        dataOutputStream.close();


                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

            new Thread(runnable).start();
        }
    }
}
