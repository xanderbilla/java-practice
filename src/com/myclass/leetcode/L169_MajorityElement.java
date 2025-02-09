package com.myclass.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 169 - Majority Element
 * 
 * Given an array nums of size n, return the majority element that appears more than ⌊n/2⌋ times.
 * The majority element is guaranteed to exist in the array.
 *
 * Problem Statement:
 * - Input: nums = [2,2,1,1,1,2,2]  
 * - Output: 2
 * - Explanation: The element 2 appears 4 times which is greater than ⌊7/2⌋ = 3
 *
 * Time Complexity: O(N) where N is length of input array
 * Space Complexity: O(N) to store counts in HashMap
 *
 * @author Vikas Singh
 * @since February 09, 2025
 * @see https://leetcode.com/problems/majority-element/
 */
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
            if (counts.get(num) > nums.length / 2) {
                return num;
            }
        }
        return nums[0];
    }
}

public class L169_MajorityElement {
    public static void run() {
        int[] nums = { 3, 2, 6, 2, 2 };
        Solution solution = new Solution();
        System.out.println(solution.majorityElement(nums));
    }
}
