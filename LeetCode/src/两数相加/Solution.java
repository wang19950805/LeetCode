package �������;

import �������.ListNode;
/***
 * 
 * @author Administrator
 *
 *
 * 	�������� �ǿ� ������������ʾ�����Ǹ������������У����Ǹ��Ե�λ���ǰ��� ���� �ķ�ʽ�洢�ģ��������ǵ�ÿ���ڵ�ֻ�ܴ洢һλ���� 
 * 	������ǽ��������������������᷵��һ���µ���������ʾ���ǵĺ� 
 * 	���Լ����������0֮�⣬����������������0��ͷ
 *  
 * 	ʾ����
 * 		���룺	(2 -> 4 -> 3) + (5 -> 6 -> 4)
 *		�����	7 -> 0 -> 8
 *		ԭ��	342 + 465 = 807
 */


public class Solution {
	
	public static void main(String[] args) throws IllegalAccessException {
		
	}
	

	public static ListNode addTowNumbers(ListNode list1,ListNode list2) {
		
		ListNode dummyHead = new ListNode(0);
		
		ListNode p = list1,q = list2,curr = dummyHead;
		 
		int carry = 0;
		while(p != null||q != null ) {
			int  x = (p!=null)?(int) p.val():0;
			int  y = (q!=null)?(int) q.val():0;
			int sum = carry + x + y ;
			curr.getNext() = new ListNode(sum % 10);
		}
			
			
		
		
		
		return null;
	}
	
	
}

/***
 * 	ʲô������ 	
 * 		 ��������һ����ʽ��ȡ�����ݽṹ����һ���ַ����Ĵ洢��Ԫ������Ա��е�����Ԫ�ء�
 * 	�����е��������Խ������ʾ�ģ�ÿ�����Ĺ���:Ԫ��(����Ԫ�ص�ӳ��) + ָ��(ָʾ���Ԫ�ش洢λ��)��
 * 	Ԫ�ؾ��Ǵ洢���ݵĴ洢��Ԫ��ָ���������ÿ�����ĵ�ַ���ݡ�(�߼���ַ�����������ַ��������
 */
