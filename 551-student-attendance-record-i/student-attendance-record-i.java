class Solution {
    public boolean checkRecord(String s) 
    {
        int counta=0;
        int countl=0;
        for(char ch:s.toCharArray())
        {
            if(ch!='L')
            countl=0;
            if(ch=='L')
            countl++;
            if(ch=='A')
            counta++;
            if(counta==2||countl==3)
            return false;

        }
        return true;
    }
}