package lab;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class 记事本 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("小本本");
        frame.setLocation(480,270);
        JTextArea hello = new JTextArea("你好，我是小本本，我可以记录你的日记！");
        hello.setFont(new Font("",Font.BOLD,20));
        frame.add(hello);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
        hello.setLineWrap(true);
        JMenuBar menuBar = new JMenuBar();
        JMenu ziti = new JMenu("字体");
        JMenuItem ziti1 = new JMenuItem("粗体");
        JMenuItem ziti2 = new JMenuItem("斜体");
        JMenu zihao = new JMenu("字号");
        JMenuItem zihao1 = new JMenuItem("小");
        JMenuItem zihao2 = new JMenuItem("中");
        JMenuItem zihao3 = new JMenuItem("大");
        ziti.setFont(new Font("",Font.BOLD,20));
        ziti1.setFont(new Font("s",Font.BOLD,20));
        ziti2.setFont(new Font("s",Font.BOLD,20));
        zihao.setFont(new Font("",Font.BOLD,20));
        zihao1.setFont(new Font("s",Font.BOLD,20));
        zihao2.setFont(new Font("s",Font.BOLD,20));
        zihao3.setFont(new Font("s",Font.BOLD,20));
        zihao1.addActionListener(e->hello.setFont(new Font("",Font.BOLD,20)));
        zihao2.addActionListener(e->hello.setFont(new Font("",Font.BOLD,30)));
        zihao3.addActionListener(e->hello.setFont(new Font("",Font.BOLD,40)));
        ziti1.addActionListener(e->hello.setFont(new Font("",Font.BOLD,20)));
        ziti2.addActionListener(e->hello.setFont(new Font("",Font.ITALIC,20)));
        ziti.add(ziti1);
        ziti.add(ziti2);
        zihao.add(zihao1);
        zihao.add(zihao2);
        zihao.add(zihao3);
        menuBar.add(ziti);
        menuBar.add(zihao);
        frame.setJMenuBar(menuBar);
    }
}