import java.util.Scanner;

/**
 * 
 * 题目描述
	输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。

 * 输入描述:
 	输入一个整数（int类型）

 * 输出描述:
 	这个数转换成2进制后，输出1的个数

 * 示例1
	输入
	5
	输出
	2
 *
 */
public class Test015 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		int num = 0;
		int count = 0;
		//先算出转换为2进制后的最高位
		while (start >= 2 << num) {
			num++;
		}
		//每次检验一位2进制的位数
		for (int i = num; i >= 0; i--) {
			if (start >= 1 << i) {
				count++;
				start -= 1 << i;
			}
		}
		System.out.println(count);
		scanner.close();
	}

}
//其他方式
/*
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            System.out.println(countOnes(input));
        }

        scanner.close();
    }

    private static int countOnes(int input) {
        int result = 0;
        //>>> 右移，左边空出的位以0填 充
        while (input != 0) {
           result += input & 1;
            input >>>= 1;
        }

        return result;
    }
}

*/