class Solution {
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int size=temperatures.length;
        int []ans=new int[size];
        int []stack=new int[size];
        int top=-1;
        for(int i=0;i<size;i++)
        {
            int temp=temperatures[i];
            while(top>=0&&temp>temperatures[stack[top]])
            {
                int index= stack[top--];
                ans[index]=i-index;
            }
            stack[++top]=i;
        }
    return ans;
    }
}