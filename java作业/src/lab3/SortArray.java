/*
 * @Author: 2233xy 94818928+2233xy@users.noreply.github.com
 * @Date: 2022-05-31 10:29:51
 * @LastEditors: 2233xy 94818928+2233xy@users.noreply.github.com
 * @LastEditTime: 2022-05-31 10:31:42
 * @FilePath: \java作业\src\lab3\SortArray.java
 * @Description: 
 * 
 * Copyright (c) 2022 by 2233xy 94818928+2233xy@users.noreply.github.com, All Rights Reserved. 
 */
package lab3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SortArray {

	public static void main(String[] args) {

		// 创建保存整型数据的数组(数组大小10)
        int[] arr = new int[10];
                                                              

		// 给数组赋随机值，取值范围1~100
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }
                                                              

		// 将数组元素按有小到大顺序排列
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
		                                                              

		try {

			// 创建数据保存文件，如果文件不存在，重新创建
            File file = new File("data.txt");
                                                          

			// 创建FileOutputStream和DataOutputStream 输出流
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream dos = new DataOutputStream(fos);
                                                          

			// 利用输出流向文件中写入数组数据
            for (int i = 0; i < arr.length; i++) {
                dos.writeInt(arr[i]);
            }
                                                          

			// 关闭输出流
            dos.close();
                                                          

			// 创建FileInputStream和DataInputStream 输入流
            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);
                                                          

			// 利用输入流从文件读取数据并输出
            for (int i = 0; i < arr.length; i++) {
                System.out.println(dis.readInt());
            }
                                                          

			// 关闭输入流
            dis.close();
                                                          

		} catch (IOException e) {

			// 异常处理

			System.out.println("读写发生异常");

		}

	}

}