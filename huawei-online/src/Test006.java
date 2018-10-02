import java.util.Scanner;

/**
 * 
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）
 * 最后一个数后面也要有空格
	详细描述：
	函数接口说明：
	public String getResult(long ulDataInput)

	输入参数：
	long ulDataInput：输入的正整数

	返回值：
	String

 * 输入描述:
	输入一个long型整数

 * 输出描述:
	按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。

 * 示例1
	输入
	180

	输出
	2 2 3 3 5
 *
 */
public class Test006 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextLong();
		System.out.println(getResult(num));
	}
	public static String getResult(long ulDataInput) {
		StringBuilder builder = new StringBuilder(128);
        long i = 2;
        while (i <= ulDataInput) {
            // 每次的i一定是质数时才会满足
            // 因为如果是一个合数，那那它一定是由更小的质数相乘得来的，
            // 而在i前的质数已经全部被使用过了，不能再整除num了
            while (ulDataInput % i == 0) {
                builder.append(i).append(' ');
                ulDataInput /= i;
            }
            i++;
        }

       return builder.toString();
	}
}
