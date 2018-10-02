import java.util.Scanner;

/**
 * 题目描述
	写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，
	然后输出输入字符串中含有该字符的个数。不区分大小写。

 * 输入描述:
	输入一个有字母和数字以及空格组成的字符串，和一个字符。

 * 输出描述:
	输出输入字符串中含有该字符的个数。

 * 示例1
	输入
	ABCDEF A
	输出
	1
 * 
 */
public class Test002 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String stringstr=scanner.next();
		String charstr=scanner.next();
		String upstr=stringstr.toUpperCase();//转大写
		String upchar=charstr.toUpperCase();
		int num=0;//计数
		while(upstr.contains(upchar)) {
			upstr=upstr.substring(upstr.indexOf(upchar)+1,upstr.length());
			num++;
		}
		System.out.println(num);
	}

}
