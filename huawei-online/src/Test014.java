import java.util.Scanner;

/**
 * 
 * 题目描述
	给定n个字符串，请对n个字符串按照字典序排列。
 * 输入描述:
	输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
 * 输出描述:
	数据输出n行，输出结果为按照字典序排列的字符串。
 * 示例1
	输入		输出
	9		boat
	cap		boot
	to		cap
	cat		card
	card	cat
	two		to
	too		too
	up		two
	boat	up
	boot
 *
 */
public class Test014 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());// 避免数组出现空位scanner.nextInt();
		String[] arrays = new String[num];
		while (scanner.hasNext()) {
			while ((--num) >= 0)
				arrays[num] = scanner.nextLine();
			int length = arrays.length;
			//以下程序通过冒泡排序算法实现，可改进为其他排序算法
			for (int i = 0; i < length; i++) {
				for (int j = 1; j <= length - i - 1; j++) {
					String tmp;
					if (arrays[j - 1].length() > arrays[j].length()) {
						tmp = arrays[j - 1];
						arrays[j - 1] = arrays[j];
						arrays[j] = tmp;
					}
					//num2为两字符串中最短字符串的长度
					int num2 = arrays[j - 1].length() < arrays[j].length() ? arrays[j - 1].length()
							: arrays[j].length();
					for (int p = 0; p < num2; p++) {
						if (arrays[j - 1].charAt(p) != arrays[j].charAt(p)) {
							if (arrays[j - 1].charAt(p) > arrays[j].charAt(p)) {
								tmp = arrays[j];
								arrays[j] = arrays[j - 1];
								arrays[j - 1] = tmp;
								break;
							}
							break;
						}

					}
				}
			}
			for (int p = 0; p < length; p++) {
				System.out.println(arrays[p]);
			}
		}
	}
}

//其他算法
/*
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int num = Integer.parseInt(scanner.nextLine());
            List<String> list = new ArrayList<>(num);

            while ((--num) >= 0) {
                list.add(scanner.nextLine());
            }

            Collections.sort(list);

            for (String s : list) {
                System.out.println(s);
            }
        }

        scanner.close();
    }
}
*/