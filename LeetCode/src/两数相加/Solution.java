package 两数相加;

import 两数相加.ListNode;
/***
 * 
 * @author Administrator
 *
 *
 * 	给出两个 非空 的链表用来表示两个非负的整数。其中，他们各自的位数是按照 逆序 的方式存储的，并且他们的每个节点只能存储一位数字 
 * 	如果我们将这两个数相加起来，则会返回一个新的链表来表示他们的和 
 * 	可以假设除了数字0之外，这两个数都不会以0开头
 *  
 * 	示例：
 * 		输入：	(2 -> 4 -> 3) + (5 -> 6 -> 4)
 *		输出：	7 -> 0 -> 8
 *		原因：	342 + 465 = 807
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
 * 	什么是链表？ 	
 * 		 单链表是一种链式存取的数据结构，用一组地址任意的存储单元存放线性表中的数据元素。
 * 	链表中的数据是以结点来表示的，每个结点的构成:元素(数据元素的映象) + 指针(指示后继元素存储位置)，
 * 	元素就是存储数据的存储单元，指针就是连接每个结点的地址数据。(逻辑地址相连，物理地址不相连）
 */
