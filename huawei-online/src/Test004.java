import java.util.Scanner;

/**
 * 
 * 题目描述
	•连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组； 
	•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。 
 * 输入描述:
	连续输入字符串(输入2次,每个字符串长度小于100)

 * 输出描述:
	输出到长度为8的新字符串数组

 * 示例1
	输入
	abc
	123456789
	输出
	abc00000
	12345678
	90000000
 *
 */
public class Test004 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1=scanner.nextLine();
		String str2=scanner.nextLine();
		int length1=str1.length();
		int length2 = str2.length();
		eightStr(str1, length1);
		eightStr(str2, length2);
	}
	//输出函数
	public static void eightStr(String str ,int length ) {
		int eight=length/8;	//不需要补0的字符串个数
		String tmp;		//中间变量
		for(int i=0;i<eight;i++) {//将不需要补0的字符串输出
			tmp = str.substring(0, 8);
			System.out.println(tmp);
			str = str.substring(8,str.length());
		}
		if(length%8!=0) {//有多余字符串的补0输出
			for(int j=8-str.length();j>0;j--) {
				str=str+"0";
			}
			System.out.println(str);
		}
	}
}
