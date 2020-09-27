package 两数之和;

import java.util.HashMap;
import java.util.Map;

/***
 * 
 * @author Administrator
 *
 *
 * 		给定一个整数数组nums和一个目标值target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标
 *
 *
 *	你可以假设每种输入只会对应一个答案。 但是数组中同一个元素不能使用两边	
 *
 *	示例：
 *		给定nums = [2,7,11,15], target = 9
 *		
 *		因为nums[0] + nums[1] = 2 + 7 = 9 
 *		所以返回[0,1]
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
	// 方法一
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
		throw new IllegalAccessException("没有两数相加等于target");
	}
	
	//方法二
	public static int[] sum2(int[] nums,int target) throws IllegalAccessException {
		
		Map<Integer, Integer> map = new HashMap<>();
				
		for (int i = 0; i < nums.length; i++) {
			
			int complement = target - nums[i];
			
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement),i};
			}
			map.put(nums[i], i);			
		}
		throw new IllegalAccessException("没有两数相加等于target");		
	}
}




/**
 * 	 时间复杂度与空间复杂度： https://blog.csdn.net/zolalad/article/details/11848739
 */