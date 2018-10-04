import java.util.Scanner;

/**
 * 
 * 求解立方根
 * 题目描述
	•计算一个数字的立方根，不使用库函数
 * 详细描述：
	•接口说明
	原型：public static double getCubeRoot(double input)
 * 输入:double 待求解参数
	返回值:double  输入参数的立方根，保留一位小数
 * 输入描述:
	待求解参数 double类型
 * 输出描述:
	输入参数的立方根 也是double类型
 * 示例1
	输入
	216
	输出
	6.0
 *
 */
public class Test107 {
	
	public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            double input = scanner.nextDouble();
            double result = getCubeRoot(input);
            System.out.printf("%.1f\n", result);
        }
        scanner.close();
    }
	 // 使用二分查找算法
    public static double getCubeRoot(double input)
    {
        double min = 0;
        double max = input;
        double mid = 0;
         
        // 注意，这里的精度要提高一点，否则某些测试用例无法通过
        while ((max - min) > 0.001)
        {
            mid = (max + min) / 2;
            if (mid * mid * mid > input)
                max = mid;
            else if (mid * mid * mid < input)
                min = mid;
            else
                return mid;
        }
        return max;
    }
}

