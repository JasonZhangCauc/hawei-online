import java.util.Scanner;

/**
 * 
 * 记负均正II
 * 题目描述
	从输入任意个整型数，统计其中的负数个数并求所有非负数的平均值
 * 输入描述:
	输入任意个整数
 * 输出描述:
	输出负数个数以及所有非负数的平均值

 * 示例1
	输入
	-13
	-4
	-7
	输出
	3
	0.0
 *
 */
public class Test105 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num = 0;
		int pcount = 0;// 正数个数
		int ncount = 0;// 负数个数
		while (scanner.hasNext()) {
			int tmp = scanner.nextInt();
			if (tmp > 0) {
				num = num + tmp;
				pcount++;
			} else {
				ncount++;
			}
		}
		scanner.close();
		System.out.println(ncount);
		System.out.printf("%g", num / pcount);
	}

}
