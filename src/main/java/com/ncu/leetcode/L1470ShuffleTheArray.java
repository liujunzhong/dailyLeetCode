package com.ncu.leetcode;

/**
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 *
 * Example 1:
 *
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7]
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 * Constraints:
 * 1 <= n <= 500
 * nums.length == 2n
 * 1 <= nums[i] <= 10^3
 */
public class L1470ShuffleTheArray {
        public int[] shuffle(int[] nums, int n) {
            // 方法一，空间复杂度比较大
            // int[] res = new int[n*2];
            // for(int i=0,j=0;i<n;i++,j=j+2){
            //     res[j] = nums[i];
            //     res[j+1] = nums[n+i];
            // }
            // return res;


            // 方法2，利用了左移，位运算
            int j=0;
            for(int i=n;i<2*n;i++){
                nums[i] <<= 10;
                nums[i] |= nums[j++];
            }
            j=0;
            for(int i=n;i<2*n;i++){
                int right = nums[i] & 1023;
                int left = nums[i]>>10;
                nums[j++] = right;
                nums[j++] = left;
            }
            return nums;
        }
}
