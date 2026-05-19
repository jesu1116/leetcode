class Solution {
    public String originalDigits(String s) {
        int a[]=new int[26];
        for(int i=0;i<s.length();i++) a[s.charAt(i)-'a']++;

        int ans[]=new int[10];
        
        ans[0]=a['z'-'a'];
        ans[2]=a['w'-'a'];
        ans[4]=a['u'-'a'];
        ans[6]=a['x'-'a'];
        ans[8]=a['g'-'a'];

       
        ans[1]=a['o'-'a']-(ans[0]+ans[2]+ans[4]);
        ans[3]=a['h'-'a']-(ans[8]);
        ans[5]=a['f'-'a']-(ans[4]);
        ans[7]=a['s'-'a']-(ans[6]);
        ans[9]=a['i'-'a']-(ans[5]+ans[6]+ans[8]);

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<10;i++){
            for(int j=0;j<ans[i];j++){
                sb.append(i);
            }
        }
        return sb.toString();
    }
}