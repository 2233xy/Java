/*
 * @Author: 2233xy 94818928+2233xy@users.noreply.github.com
 * @Date: 2022-03-10 12:31:14
 * @LastEditors: 2233xy 94818928+2233xy@users.noreply.github.com
 * @LastEditTime: 2022-05-25 00:07:08
 * @FilePath: \Java\java作业\src\lab\请输入您的姓名.java
 * @Description: 
 * 
 * Copyright (c) 2022 by 2233xy 94818928+2233xy@users.noreply.github.com, All Rights Reserved. 
 */
package lab;
import java.util.Scanner;

public class 请输入您的姓名 {
    public static void main(String[] args) throws Exception {
        System.out.println("请输入您的姓名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name+"，您好！欢迎学习Java程序设计！");
        scanner.close();
    }
}
