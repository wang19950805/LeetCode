package ������ת;

/***
 * 
 * @author Administrator
 *
 *         ����һ��32λ���з�����������Ҫ�����������ÿλ�ϵ����ֽ��з�ת ʾ���� ���룺123 �����312 ʾ���� ���룺120 �����21
 * 
 *         ע�⣺�������ǵĻ���ֻ�ܴ洢����32λ���з���������������ֵ��ΧΪ[-2^31,2^31-1]
 *         �����������裬�����ת�����������ô�ͷ���0
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