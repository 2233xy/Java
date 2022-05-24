package lab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class 整数加法器 extends JFrame implements ActionListener{
    static String[] buttonName = {"0","1","2", "3","4","5", "6","7","8", "9","加","等于"};
    static JButton button;
    static JButton buttonTop;
    static String str = "";
    static JPanel panelNorth;
    static double number;
    static String str_num = "";
    static double result;
    public 整数加法器(){
        super("整数加法器");
        panelNorth = new JPanel(new BorderLayout());
        buttonTop = new JButton("清空");
        buttonTop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonTop.setText("清空");
                str = "";
                str_num = "";
                result = 0;
            }
        });
        panelNorth.add(buttonTop);
        this.add(panelNorth,BorderLayout.NORTH);
        //中部
        JPanel panelSouth = new JPanel();
        panelSouth.setLayout(new GridLayout(3,3));//三行三列的网格布局
        for(int i = 0;i<buttonName.length;i++){
            button=  new JButton(buttonName[i]);
            //注册监听事件
            button.addActionListener(this);
            panelSouth.add(button);
        }
        this.add(panelSouth,BorderLayout.CENTER);
        //窗体设置
        this.setBounds(600,300,450,256);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void  main(String[] args){
        整数加法器 frame = new 整数加法器();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            String str1 = e.getActionCommand();//获取按钮的名称
            if(str1.equals("加")){
                str1 = "+";
                number = Integer.valueOf(str_num);//获取加号之前的数字
                result += number;
                str_num = "";
            }
            else if(str1.equals("等于")){
                str1 = "=" + String.format("%.0f",(result + Integer.valueOf(str_num)));
            }
            else{
                str_num += str1;
            }
            str += str1;
            buttonTop.setText(str);
        }
    }
