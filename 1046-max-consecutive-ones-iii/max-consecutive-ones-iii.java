class Solution {
    public int longestOnes(int[] nums, int k) {
        int count = k;

        int left = 0;
        int max = 0;
        int len = nums.length;
        for(int right = 0;right<len;right++){

            if(nums[right] == 0)count--;

            while(count < 0){
                if(nums[left] == 0){
                    count++;
                }
                left++;
            }

            max = Math.max(max,right-left+1);

        }
        return max;
    }
}