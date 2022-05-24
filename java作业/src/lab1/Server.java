/*
 * @Author: 2233xy 94818928+2233xy@users.noreply.github.com
 * @Date: 2022-05-20 18:52:26
 * @LastEditors: 2233xy 94818928+2233xy@users.noreply.github.com
 * @LastEditTime: 2022-05-24 17:13:13
 * @FilePath: \Java\java作业\src\lab1\Server.java
 * @Description: 
 * 
 * Copyright (c) 2022 by 2233xy 94818928+2233xy@users.noreply.github.com, All Rights Reserved. 
 */
package lab1;

import java.awt.*;// 导入java.awt包
import java.awt.event.*;// 导入java.awt.event包
import java.io.*;// 导入java.io包
import java.net.*;// 导入java.net包

public class Server extends Frame implements ActionListener {
	ServerSocket ss = null;//创建服务器套接字，用于监听客户端的连接请求
	Socket s = null;//创建客户端套接字，用于与客户端通信
	private DataInputStream is = null;//创建输入流，用于接收客户端发送的信息
	private DataOutputStream os = null;//创建输出流，用于向客户端发送信息
	private boolean connected = false;//判断是否连接成功
	Label ipLabel = new Label();//创建标签，用于显示服务器的IP地址
	Label portLabel = new Label("端口");//创建标签，用于显示服务器的端口号
	TextField portTextField = new TextField("8000");//创建文本框，用于输入服务器的端口号
	Button listenButton = new Button("监听");//创建按钮，用于监听客户端的连接请求
	Button closeButton = new Button("关闭");//创建按钮，用于关闭服务器
	Panel panel = new Panel();//创建面板，用于放置各种组件
	TextField inputTextField = new TextField();//创建文本框，用于输入要发送的信息
	TextArea contentTextArea = new TextArea();//创建文本区域，用于显示接收到的信息
	Thread recvThread = new Thread(new RecvThread());//创建接收线程，用于接收客户端发送的信息

	public Server() {
		setTitle("服务器端");//设置窗口标题
		setLocation(400, 300);//设置窗口位置
		setSize(500, 500);//设置窗口大小
		setLayout(new BorderLayout());//设置布局管理器
		panel.setLayout(new FlowLayout());//设置面板布局管理器
		try {   //获取本机IP地址
			ipLabel.setText("本机IP信息：" + InetAddress.getLocalHost().toString());
		} catch (HeadlessException e) {//捕获异常
			e.printStackTrace();//打印异常信息
		} catch (UnknownHostException e) {//捕获异常
			e.printStackTrace();//打印异常信息
		}
		panel.add(ipLabel);//将标签添加到面板
		panel.add(portLabel);//将标签添加到面板
		panel.add(portTextField);//将文本框添加到面板
		panel.add(listenButton);//将按钮添加到面板
		panel.add(closeButton);//将按钮添加到面板
		add(panel, BorderLayout.NORTH);//将面板添加到窗口
		add(contentTextArea, BorderLayout.CENTER);//将文本区域添加到窗口
		add(inputTextField, BorderLayout.SOUTH);//将文本框添加到窗口
		listenButton.addActionListener(this);//添加监听器
		closeButton.addActionListener(this);//添加监听器
		inputTextField.addActionListener(this);//添加监听器

		addWindowListener(new WindowAdapter() {//添加窗口监听器
			@Override
			public void windowClosing(WindowEvent e) {//窗口关闭事件
				disconnect();   //断开连接
			}
		});

		pack();//使窗口适应组件的大小
		setVisible(true);//设置窗口可见
	}

	public void start() {   //启动服务器
		try {//异常处理
			int port = Integer.parseInt(portTextField.getText());//获取端口号
			connected = true;//设置连接成功
			ss = new ServerSocket(port);//创建服务器套接字
			s = ss.accept();//接收客户端连接
			os = new DataOutputStream(s.getOutputStream());//创建输出流
			is = new DataInputStream(s.getInputStream());//创建输入流
			recvThread.start();//启动接收线程
		} catch (IOException e) {//捕获异常
            e.printStackTrace();//打印异常信息
		} finally {//最终处理
			try {//异常处理
				ss.close();//关闭服务器套接字
			} catch (IOException e) {//捕获异常
                e.printStackTrace();//打印异常信息
			}
		}
	}

	public void disconnect() {//断开连接
		try {
			if (os != null)//如果输出流不为空
				os.close();//关闭输出流
			if (is != null)//如果输入流不为空
				is.close();//关闭输入流
			if (s != null)//如果套接字不为空
				s.close();//关闭套接字
		} catch (IOException e) { //捕获异常
            e.printStackTrace();//打印异常信息
		}
		System.exit(0);//退出程序
	}

	private class RecvThread implements Runnable {//接收线程
		public void run() {//运行
			try {//异常处理
				while (connected) {//如果连接成功
					String str = is.readUTF();//读取字符串
					contentTextArea.setText(contentTextArea.getText() + "client:" + str + '\n');//将字符串添加到文本区域
				}
			} catch (EOFException e) {//捕获异常
                e.printStackTrace();//打印异常信息
				contentTextArea.setText("Client closed!");//将字符串添加到文本区域
			} catch (IOException e) {//捕获异常
                e.printStackTrace();//打印异常信息
			}
		}
	}

	public void actionPerformed(ActionEvent e) {//动作事件
		// 如果按下的是监听按钮
		if (e.getSource() == listenButton) {
			listenButton.setEnabled(false);//设置监听按钮不可用
			start();//启动服务器
		} else if (e.getSource() == closeButton) {//如果按下的是关闭按钮
			disconnect();//断开连接
		} else if (e.getSource() == inputTextField) {//如果按下的是文本框
			String str = inputTextField.getText().trim();//获取文本框内容
			inputTextField.setText("");//清空文本框
			try {//异常处理
				os.writeUTF(str);//写入字符串
				os.flush();//刷新输出流
				contentTextArea.setText(contentTextArea.getText() + "server:" + str + '\n');//将字符串添加到文本区域
			} catch (IOException e1) {//捕获异常
                e1.printStackTrace();//打印异常信息
			}
		}
	}

	public static void main(String[] args) {//主函数
		new Server();//创建服务器
	}

}