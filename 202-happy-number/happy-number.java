class Solution {
    public boolean isHappy(int n)
    {
        int t=n;
         
        while(t!=1&&t!=4)
        {
          int sum=0;
        while(t>0)
        {
           int d=t%10;
           sum+= d*d;
           t/=10;
        }
           t=sum; 
        }
        return t==1;
         
    }
}