class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,max=0;
         int[] freq=new int[26];
         int maxFreq=0;
        while(r<s.length()){
              
               freq[s.charAt(r)-'A']++;
               maxFreq=Math.max(maxFreq,freq[s.charAt(r)-'A']);
               while((r-l+1)-maxFreq>k){
                   freq[s.charAt(l)-'A']--;
                   l++;
               }
               max=Math.max(max,r-l+1);
               r++;
             }

        
        return max;
    }
}
