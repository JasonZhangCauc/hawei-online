import java.util.Scanner;

/**
 * 
 * 题目描述
	写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。例如：
 * 输入描述:
	输入N个字符
 * 输出描述:
	输出该字符串反转后的字符串

 * 示例1
	输入
	abcd
	输出
	dcba
 *
 */
public class Test012 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		char tmp;
		char[] charrays = new char[1000];
		int i = 0;
		for (; string.length() != 0; i++) {
			charrays[i] = string.charAt(0);
			string = string.substring(1, string.length());
		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(charrays[j]);
		}
	}

}
