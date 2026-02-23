class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
      int n=nums2.length;
      int []nge=new int[n];
      int []stack=new int[n];
      int top=-1;
      for(int i=n-1;i>=0;i--)
      {
        while(top!=-1&&stack[top]<=nums2[i])
        {
            top--;
        }
        if(top==-1)
        {
            nge[i]=-1;
        }
        else
        {
            nge[i]=stack[top];
        }
        stack[++top]=nums2[i];
      }   
      int []ans=new int[nums1.length];
      for(int i=0;i<nums1.length;i++)
      {
        for(int j=0;j<n;j++)
        {
            if(nums1[i]==nums2[j])
            {
                ans[i]=nge[j];
                break;
            }
        }
      }
      return ans;
    }
}