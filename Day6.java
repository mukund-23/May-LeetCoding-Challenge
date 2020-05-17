/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
*/

class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>(); 
            
        int element = nums[0];
        for(int i = 0; i < nums.length; i++) { 
            if (map.containsKey(nums[i])) { 
                    int count = map.get(nums[i]) + 1; 
                    if (count > nums.length / 2) { 
                        element = nums[i];
                    } else
                        map.put(nums[i], count); 
  
            } 
            else
                map.put(nums[i],1); 
        
        }
        return element;
        
    }  
        
}
