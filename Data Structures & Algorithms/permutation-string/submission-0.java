class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] need=new int[26];
        int[] window=new int[26];
        for(char c:s1.toCharArray()){
             need[c-'a']++;
        }
        int l=0,r=0;
        while(r<s2.length()){
           window[s2.charAt(r)-'a']++;
           if(r-l+1>s1.length()){
            window[s2.charAt(l)-'a']--;
            l++;
           }
           if(r-l+1==s1.length()){
             if(isMatch(need,window)){
                return true;
             }
           }
           r++;
           
        }
        return false;
    }
    static boolean isMatch(int[] need,int[] window){
        for(int i=0;i<need.length;i++){
            if(need[i]!=window[i]){
                return false;
            }
        }
        return true;
    }
}
