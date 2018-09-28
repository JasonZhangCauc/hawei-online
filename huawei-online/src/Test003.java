import java.util.Arrays;
import java.util.Scanner;

/**
 * 题目描述
	明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机
	生成了N个1到1000之间的随机整数（N≤1000），对于其中重复的数字，只保留一个，
	把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，
	按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作
	(同一个测试用例里可能会有多组数据，希望大家能正确处理)。

	Input Param
	
	n               输入随机数的个数
	inputArray      n个随机整数组成的数组
	
	Return Value
	OutputArray    输出处理后的随机整数

	注：测试用例保证输入参数的正确性，答题者无需验证。测试用例不止一组。

 * 输入描述:
	输入多行，先输入随机整数的个数，再输入相应个数的整数

 * 输出描述:
	返回多行，处理后的结果

 * 示例1
	输入                         输出
	11        	 10
	10     		 15
	20      	 20
	40       	 32
	32      	 40
	67       	 67
	40       	 89
	20      	 300
	89      	 400
	300       
	400       
	15       
 *
 */

public class Test003 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int num = scanner.nextInt();//num为输入个数
			int tmpnum = num;			//循环条件用
			int endnum = 0;				//最终数组的下标
			boolean flag = true;		//标志位，用于去重
			int[] arrays = new int[num];	//初始数组
			int[] endarrays = new int[num];	//最终输出数组
			int i = 0;
			while ((--tmpnum) >= 0) {
				arrays[i] = scanner.nextInt();//将输入存入数组
				i++;
			}

			for (i = 0; i < num; i++) {
				flag = true;
				for (int j = 0; j < endnum; j++) {
					if (endarrays[j] == arrays[i]) {//判断是否重复 “去重”
						flag = false;
					}
				}
				if (flag) {
					endarrays[endnum] = arrays[i];//不重复则存入最终数组
					endnum++;
				}
			}
			
			Arrays.sort(endarrays); //排序
			for (int k = 0; k < num; k++) {
				if(endarrays[k]!=0) {//0为空位
					System.out.println(endarrays[k]);
				}
			}
			
		}
	}

}
