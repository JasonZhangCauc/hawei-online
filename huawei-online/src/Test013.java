import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * 
 * 题目描述
	将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
	所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 * 接口说明
	**
	 * 反转句子
	 * @param sentence 原句子
	 * @return 反转后的句子
	public String reverse(String sentence);
 * 输入描述:
	将一个英文语句以单词为单位逆序排放。
 * 输出描述:
	得到逆序的句子
 * 示例1
	输入
	I am a boy
	输出
	boy a am I
 *
 */
public class Test013 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String start = scanner.nextLine();
		String[] arrays = start.split("\\s");
		int length = arrays.length;
		for (int i = length - 1; i >= 0; i--) {
			System.out.print(arrays[i] + " ");
		}
		// 每个单词都倒过来
		/*for (int i = length - 1; i >= 0; i--) {
			System.out.print(converse(arrays[i]) + " ");
		}*/
	}

	/*private static String converse(String string) {
		Stack<Character> stack = new Stack<>();
		StringBuilder stringBuilder = new StringBuilder();
		for (int k = 0; k < string.length(); k++) {
			stack.push(string.charAt(k));
		}
		while (!stack.isEmpty()) {
			stringBuilder.append(stack.pop());
		}
		return stringBuilder.toString();
	}*/

}
