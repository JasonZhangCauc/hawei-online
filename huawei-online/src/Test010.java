import java.util.Scanner;

/**
 * 
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。

 * 输入描述:
	输入N个字符，字符在ACSII码范围内。

 * 输出描述:
	输出范围在(0~127)字符的个数。

 * 示例1
	输入
	abc
	输出
	3
 *
 */
public class Test010 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String string =scanner.nextLine();	//输入字符串
		int num=0;	//记录不同的字符的个数
		int []arrays = new int[128];
		for(int i=0;i<string.length();i++) {//遍历
			char tmp = string.charAt(i);
			if(tmp>-1&&tmp<128) {			//满足条件
				if(arrays[tmp]!=1) {		//置数组标志位为1
					arrays[tmp]=1;
					num++;
				}
			}
		}
		System.out.println(num);
	}

}
