import java.util.Scanner;

/**
 * 
 * 题目描述
	输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。

 * 输入描述:
	输入一个int型整数
	
 * 输出描述:
	按照从右向左的阅读顺序，返回一个不含重复数字的新的整数

 * 示例1
	输入
	9876673
	输出
	37689
 *
 */
public class Test009 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		int[] arrays = new int[50];// 定义存储结果的数组
		int tmp; // 中间变量
		int num = 0; // 记录整形数字位数
		for (int i = 0; start > 0; i++) {
			tmp = start % 10; // 取末位数字
			start /= 10; // 去掉末位数字
			boolean bool = true; // 标记是否有重复，true代表无重复
			for (int j = 0; j <= i; j++) {
				if (arrays[j] == tmp) {
					bool = false;
				}
			}
			if (bool) { // 无重复则记录
				arrays[num] = tmp;
				num++;
			}
		}
		for (int k = 0; k < num; k++) { // 输出
			System.out.print(arrays[k]);
		}
	}

}


//其他方法
/**
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            System.out.println(extractNumber(input + ""));
        }

        scanner.close();
    }

    private static String extractNumber(String numStr) {
        StringBuilder builder = new StringBuilder();

        HashSet<Character> set = new LinkedHashSet<>();//Character是char的包装类型
        for (int i = numStr.length() - 1; i >= 0; i--) {
            set.add(numStr.charAt(i));
        }

        for (Character c : set) {
            builder.append(c);
        }

        // 如果第一个字符是0
        if (builder.charAt(0) == '0') {
            return builder.substring(1, builder.length());
        }

        return builder.toString();
    }
}
*/