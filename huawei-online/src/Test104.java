import java.util.Scanner;

/**
 * 字符串分割
 * 连续输入字符串(输出次数为N,字符串长度小于100)，请按长度为8拆分每个字符串后输出到新的字符串数组，
 * 长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
	首先输入一个整数，为要输入的字符串个数。
	
	例如：
	输入：	2
	      	abc
	      	12345789
	
	输出：	abc00000
	      	12345678
	      	90000000
 *
 */
public class Test104 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			String[] arr = new String[n];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.next();
			}
			for (int i = 0; i < arr.length; i++) {
				eightStr(arr[i], arr[i].length());
			}
		}

		scanner.close();
	}

	// 输出函数
	public static void eightStr(String str, int length) {
		int eight = length / 8; // 不需要补0的字符串个数
		String tmp; // 中间变量
		for (int i = 0; i < eight; i++) {// 将不需要补0的字符串输出
			tmp = str.substring(0, 8);
			System.out.println(tmp);
			str = str.substring(8, str.length());
		}
		if (length % 8 != 0) {// 有多余字符串的补0输出
			for (int j = 8 - str.length(); j > 0; j--) {
				str = str + "0";
			}
			System.out.println(str);
		}
	}
}
