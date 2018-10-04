import java.util.Scanner;

/**
 * 求最小公倍数
 * 题目描述
	正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。

 * 输入描述:
	输入两个正整数A和B。

 * 输出描述:
	输出A和B的最小公倍数。
 * 示例1
	输入	输出
	5 	35
	7
 *
 */
public class Test108 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int tmp = a;
		int num = 1;
		if(a<b) {
			a = b;
			b = tmp;
			tmp = a;
		}
		while(tmp%b!=0) {
			tmp = a*num;
			num++;
		}
		System.out.println(tmp);
		scanner.close();
	}

}
