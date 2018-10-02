import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 
 * 题目描述
	数据表记录包含表索引和数值，请对表索引相同的记录进行合并，
	即将相同索引的数值进行求和运算，输出按照key值升序进行输出。

 * 输入描述:
	先输入键值对的个数
	然后输入成对的index和value值，以空格隔开

 * 输出描述:
	输出合并后的键值对（多行）

 * 示例1
	输入			输出
	4
	0 1			0 3
	0 2			1 2
	1 2			3 4
	3 4
 *
 */
public class Test008 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int num = Integer.parseInt(scanner.nextLine());
			SortedMap<Integer, Integer> sortedMap = new TreeMap<>();
			for (int i = 0; i < num; i++) {
				String[] nums = scanner.nextLine().split(" ");
				add(sortedMap, nums);
			}

			System.out.print(mapToString(sortedMap));
		}

		scanner.close();
	}

	private static String mapToString(SortedMap<Integer, Integer> sortedMap) {
		StringBuilder stringBuilder = new StringBuilder();
		for (Entry<Integer, Integer> tmp : sortedMap.entrySet()) {
			stringBuilder.append(tmp.getKey()).append(" ").append(tmp.getValue()).append("\n");
		}
		return stringBuilder.toString();
	}

	private static void add(SortedMap<Integer, Integer> sortedMap, String[] nums) {
		int key = Integer.parseInt(nums[0]);
		int value = Integer.parseInt(nums[1]);
		if (sortedMap.containsKey(key)) {
			sortedMap.put(key, sortedMap.get(key) + value);
		} else {
			sortedMap.put(key, value);
		}
	}

}
