class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        String ans="";
        int minLen=Integer.MAX_VALUE;
        
         int[] freq=new int[256];
         for(int i=0;i<t.length();i++){
            freq[t.charAt(i)]++;
         }
         int index=-1;
         int l=0,r=0,cnt=t.length();

         while(r<s.length()){
            if(freq[s.charAt(r)]>0){
                cnt--;
            }
            freq[s.charAt(r)]--;
            r++;
            while(cnt==0){
                if(r-l<minLen){
                    minLen=r-l;
                    index=l;
                }
                freq[s.charAt(l)]++;
                if(freq[s.charAt(l)]>0){
                    cnt++;

                }
             
                l++;
            }
            
         }
         if(index==-1){
            return "";
         }
         return s.substring(index,index+minLen);
            
    }
    
}
