package yanyi.leetcode.easy;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * @author shangoyanyi
 * @since 2017/2/21
 */
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		
        for(int i=0; i<nums.length; i++){
            for(int j=0;j<nums.length; j++){
                if(i == j){
                    continue;
                }else{
                    int sum = nums[i] + nums[j];
                    if(sum == target){
                        result[0] = Math.min(i, j);
                        result[1] = Math.max(i, j);
                    }
                }
            }
        }
        
        return result;
    }
}
