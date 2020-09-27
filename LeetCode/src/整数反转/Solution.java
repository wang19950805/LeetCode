package 整数反转;

/***
 * 
 * @author Administrator
 *
 *         给出一个32位的有符号整数，需要将这个整数中每位上的数字进行反转 示例： 输入：123 输出：312 示例： 输入：120 输出：21
 * 
 *         注意：假设我们的环境只能存储得下32位的有符号整数，则其数值范围为[-2^31,2^31-1]
 *         请根据这个假设，如果反转后整数溢出那么就返回0
 */

public class Solution {

	public static void main(String[] args) {

	}

	public int reverse(int x) {
		int ans = 0;
		while (x != 0) {
			int pop = x % 10;
			if (ans > Integer.MAX_VALUE / 10 || pop > 7) {
				return 0;
			}
			if (ans < Integer.MIN_VALUE || pop < -8) {
				return 0;
			}

		}

		return 0;

	}
}