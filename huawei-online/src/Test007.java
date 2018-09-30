import java.util.Scanner;

/**
 * 
 * 题目描述
	写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。
	如果小数点后数值大于等于5,向上取整；小于5，则向下取整。

 * 输入描述:
	输入一个正浮点数值

 * 输出描述:
	输出该数值的近似整数值

 * 示例1
	输入
	5.5
	输出
	6
 *
 */
public class Test007 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float num = scanner.nextFloat();
		int tmp = (int) num;
		float ftmp = (float) tmp + (float) 0.5;
		if (num >= ftmp) {
			System.out.println(tmp + 1);
		} else {
			System.out.println(tmp);
		}
	}
}
//其他方法
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            float input = scanner.nextFloat();
            System.out.println(floatToNearInt(input));
        }

        scanner.close();
    }

    private static int floatToNearInt(float f) {
        return (int) ((f*10 + 5)/10);
    }
}

 */
