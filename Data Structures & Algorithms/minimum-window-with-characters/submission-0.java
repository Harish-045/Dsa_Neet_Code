class Solution {
    public String minWindow(String s, String t) {
        String ans="";
        int minLen=Integer.MAX_VALUE;
        int index=-1;
       
        for(int i=0;i<s.length();i++){
          
             int cnt=0;
            int[] freq=new int[256];
            
             for(int j=0;j<t.length();j++){
                freq[t.charAt(j)]++;
             }
             for(int j=i;j<s.length();j++){
                if(freq[s.charAt(j)]>0){
                    cnt++;
                    freq[s.charAt(j)]--;
                }
                if(cnt==t.length()){
                    if(j-i+1<minLen){
                        minLen=j-i+1;
                        index=i;
                        break;
                    }
                }
             }
        }
        if(index==-1){
            return "";
        }
       for(int i=index;i<index+minLen;i++){
        ans+=s.charAt(i);
       }
       return ans;
    }
    
}
