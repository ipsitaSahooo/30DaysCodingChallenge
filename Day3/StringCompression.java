class Solution {
    public int compress(char[] chars) 
    {
        int p=0;
        int q=0;
        StringBuilder ans = new StringBuilder();
        while(p<chars.length && q<chars.length){
            int c = 0;
            while(q< chars.length && chars[p] == chars[q]){
                c++;
                q++;
            }
            ans.append(chars[p]);
            p=q;
            if(c > 1){
                ans.append(c);
            }
        }
        for(int  i = 0 ; i < ans.length(); i++){
            chars[i] = ans.charAt(i);
        }
        return ans.length();
    }
    }
