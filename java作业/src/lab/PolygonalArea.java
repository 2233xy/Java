package lab;
/**
 * 任务：计算一个由正方形和等腰三角形组成的多边形的面积，其中正方形边长4厘米，等腰三角形底边为正方形的一条边，其到对角顶点的高为2.6厘米。
 * 类名为：PolygonalArea
 */
 
public class PolygonalArea {
    public static void main(String[] args) {
    	 
         
         int square_length = 4;  // 声明int型变量square_length用于表示正方形边长，并赋值 4
         double triangle_h = 2.6;  // 声明double型变量triangle_h用于表示三角形底边上的高，并赋值 2.6
         // 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
         /********** Begin **********/
         // 第1步：计算正方形面积，赋值给变量area_square
            double area_square = square_length * square_length;

         // 第2步：计算等腰三角形面积，赋值给变量area_triangle
            double area_triangle = triangle_h * square_length / 2;

         // 第3步：计算多边形面积，即正方形面积和等腰三角形面积，赋值给变量area_total
            double area_total = area_square + area_triangle;

         // 第4步：打印输出多边形面积，即使用不换行输出语句输出变量area_total的值 输出格式：该多边形的面积为 xxx      其中xxx 为多边形的面积
            System.out.println("该多边形的面积为 " + area_total);

        /********** End **********/

    }
} 
