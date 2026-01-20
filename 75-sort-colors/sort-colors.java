class Solution {
    public void sortColors(int[] nums)
     {
       int a=nums.length;
       for(int i=0;i<a;i++)
       {
         for(int j=0;j<a-i-1;j++)
         {
            if(nums[j]>nums[j+1])
            {
                int temp=nums[j+1];
                nums[j+1]=nums[j];
                nums[j]=temp;
            }
         }
       }    
    }
}