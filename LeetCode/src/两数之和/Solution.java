package ����֮��;

import java.util.HashMap;
import java.util.Map;

/***
 * 
 * @author Administrator
 *
 *
 * 		����һ����������nums��һ��Ŀ��ֵtarget�������ڸ��������ҳ���ΪĿ��ֵ�����������������������ǵ������±�
 *
 *
 *	����Լ���ÿ������ֻ���Ӧһ���𰸡� ����������ͬһ��Ԫ�ز���ʹ������	
 *
 *	ʾ����
 *		����nums = [2,7,11,15], target = 9
 *		
 *		��Ϊnums[0] + nums[1] = 2 + 7 = 9 
 *		���Է���[0,1]
 *
 */

public class Solution {
	
	public static void main(String[] args) throws IllegalAccessException {
		int []nums = new int[] {2,7,11,15};
		int target = 9;
		int []arr = sum2(nums,target);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);			
		}
	}
	// ����һ
	public static int[] sum(int[] nums ,int target) throws IllegalAccessException {
		
		for (int i = 0; i < nums.length; i++) {
	
			for (int j = i+1; j < nums.length; j++) {			
				int numA = nums[i];
				int numB = nums[j];
				if(numA + numB == target) {
					return new int[] {i,j};
				}
			}	
		}
		throw new IllegalAccessException("û��������ӵ���target");
	}
	
	//������
	public static int[] sum2(int[] nums,int target) throws IllegalAccessException {
		
		Map<Integer, Integer> map = new HashMap<>();
				
		for (int i = 0; i < nums.length; i++) {
			
			int complement = target - nums[i];
			
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement),i};
			}
			map.put(nums[i], i);			
		}
		throw new IllegalAccessException("û��������ӵ���target");		
	}
}




/**
 * 	 ʱ�临�Ӷ���ռ临�Ӷȣ� https://blog.csdn.net/zolalad/article/details/11848739
 */