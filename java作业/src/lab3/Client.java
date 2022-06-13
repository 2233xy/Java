/*
 * @Author: 2233xy 94818928+2233xy@users.noreply.github.com
 * @Date: 2022-05-31 10:35:45
 * @LastEditors: 2233xy 94818928+2233xy@users.noreply.github.com
 * @LastEditTime: 2022-05-31 11:09:40
 * @FilePath: \java作业\src\lab3\Client.java
 * @Description: 
 * 
 * Copyright (c) 2022 by 2233xy 94818928+2233xy@users.noreply.github.com, All Rights Reserved. 
 */
package lab3;

import java.io.DataInputStream;

import java.io.DataOutputStream;

import java.io.IOException;

import java.net.Socket;



import javax.swing.JOptionPane;



public class Client {



	public static void main(String[] args) {

		try {

//创建客户端Socket，指定服务器端IP地址和端口号

			Socket s = new Socket("", 8000);

			DataOutputStream dos = new DataOutputStream(s.getOutputStream());

			DataInputStream dis = new DataInputStream(s.getInputStream());
            while(true) {

                System.out.println(dis.readUTF());
            
                String num = JOptionPane.showInputDialog("请输入一个整数");
            
                dos.writeUTF(num);
            
            }

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}

