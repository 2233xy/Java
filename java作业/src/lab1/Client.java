/*
 * @Author: 2233xy 94818928+2233xy@users.noreply.github.com
 * @Date: 2022-05-20 18:50:37
 * @LastEditors: 2233xy 94818928+2233xy@users.noreply.github.com
 * @LastEditTime: 2022-05-23 23:24:23
 * @FilePath: \Java\java作业\src\lab1\Client.java
 * @Description: 
 * 
 * Copyright (c) 2022 by 2233xy 94818928+2233xy@users.noreply.github.com, All Rights Reserved. 
 */
package lab1;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class Client extends Frame implements ActionListener {
 /**
  * @description: 
  * @return {*}
  */    
	Socket s = null;
	DataOutputStream os = null;
	DataInputStream is = null;
	private boolean connected = false;
	Label ipLabel = new Label("IP");
	TextField ipTextField = new TextField("127.0.0.1");
	Label portLabel = new Label("端口");
	TextField portTextField = new TextField("8000");
	Button connectButton = new Button("连接");
	Button closeButton = new Button("关闭");
	Panel panel = new Panel();
	TextField inputTextField = new TextField();
	TextArea contentTextArea = new TextArea();
	Thread recvThread = new Thread(new RecvThread());

	public Client() {
		setTitle("客户端");
		setLocation(400, 300);
		setSize(500, 500);
		setLayout(new BorderLayout());
		panel.setLayout(new FlowLayout());
		panel.add(ipLabel);
		panel.add(ipTextField);
		panel.add(portLabel);
		panel.add(portTextField);
		panel.add(connectButton);
		panel.add(closeButton);
		add(panel, BorderLayout.NORTH);
		add(contentTextArea, BorderLayout.CENTER);
		add(inputTextField, BorderLayout.SOUTH);
		connectButton.addActionListener(this);
		closeButton.addActionListener(this);
		inputTextField.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				disconnect();
			}
		});

		pack();
		setVisible(true);
	}

	public void connect() {
		try {
			String host, port;
			host = ipTextField.getText();
			port = portTextField.getText();
			s = new Socket(host, Integer.parseInt(port));
			os = new DataOutputStream(s.getOutputStream());
			is = new DataInputStream(s.getInputStream());
			connected = true;
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*********************************/
	public void disconnect() {
		try {
			if (os != null)
				os.close();
			if (is != null)
				is.close();
			if (s != null)
				s.close();
		} catch (IOException e) {
		}
		System.exit(0);
	}

	private class RecvThread implements Runnable {
		public void run() {
			try {
				while (connected) {
					String str = is.readUTF();
					contentTextArea.setText(contentTextArea.getText() + "server:" + str + '\n');
				}
			} catch (IOException e) {
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == connectButton) {
			connectButton.setEnabled(false);
			connect();
			recvThread.start();
		} else if (e.getSource() == closeButton) {
			disconnect();
		} else if (e.getSource() == inputTextField) {
			String str = inputTextField.getText().trim();
			inputTextField.setText("");
			try {
				os.writeUTF(str);
				os.flush();
				contentTextArea.setText(contentTextArea.getText() + "client:" + str + '\n');
			} catch (IOException e1) {
			}
		}
	}

	public static void main(String[] args) {
		new Client();
	}
}

