package lab;


/**
 * 任务描述
本关任务：根据控制台接收的数据，创建数组，对数组中的每个值求平方，将得到的结果进行升序排序，并输出最后的结果。

编程要求
仔细阅读右侧编辑区内给出的代码框架及注释，在 Begin-End 间编写程序代码，根据控制台接收的数据，创建数组，对数组中的每个值求平方，将得到的结果进行升序排序，并输出最后的结果，具体要求如下：  

接收给定的一行整数（如：12 345 646 44 365 23 56 5 1 6 58 12 3 %。其中第一个数为数组长度，其余数为数组元素，最后一个 % 用于从控制台终止输入，中间用空格分隔）；  

对数组中的每个值求平方，放入数组中；

对数组进行升序排序，并输出排序后的数组。

测试说明
平台将使用测试集运行你编写的程序代码，若全部的运行结果正确，则通关。

例：
测试输入：  

12 345 646 44 365 23 56 5 1 6 58 12 3 %  
预期输出：  

[1, 9, 25, 36, 144, 529, 1936, 3136, 3364, 119025, 133225, 417316]  
开始你的任务吧，祝你成功！
 */
public class ArrTest {
        public static void main(String[] args) {
            int arr[] = {345 , 646 , 44 , 365 , 23 , 56 , 5 , 1 , 6 , 58 , 12 , 3};
            int num;
            for(int i = 0; i < arr.length; i++){
                num = (int)Math.pow(arr[i],2);
                bubbleSort(arr,num);   
                System.out.println(num);
            }
        }
        private static void bubbleSort(int[] arr, int num) {
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr.length - 1; j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
    }

