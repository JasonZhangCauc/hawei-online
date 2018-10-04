import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * 字符逆序
 * 题目描述
	将一个字符串str的内容颠倒过来，并输出。str的长度不超过100个字符。 如：输入“I am a student”，输出“tneduts a ma I”。
 *输入参数：
	inputString：输入的字符串
 *返回值：
	输出转换好的逆序字符串
 *输入描述:
	输入一个字符串，可以有空格
 *输出描述:
	输出逆序的字符串
 *示例1
	输入
	I am a student
	输出
	tneduts a ma I
 *
 */
public class Test106 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String start = scanner.nextLine();
		String[] arrays = start.split("\\s");
		int length = arrays.length;
		// 每个单词都倒过来
		for (int i = length - 1; i >= 0; i--) {
			System.out.print(converse(arrays[i]) + " ");
		}
		scanner.close();
	}

	private static String converse(String string) {
		Stack<Character> stack = new Stack<>();
		StringBuilder stringBuilder = new StringBuilder();
		for (int k = 0; k < string.length(); k++) {
			stack.push(string.charAt(k));
		}
		while (!stack.isEmpty()) {
			stringBuilder.append(stack.pop());
		}
		return stringBuilder.toString();
	}

}
