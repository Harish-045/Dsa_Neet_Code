class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,max=0;
        Set<Character> map=new HashSet<>();
        while(r<s.length()){
            while(map.contains(s.charAt(r))){
                map.remove(s.charAt(l));
                l++;
            }
            map.add(s.charAt(r));
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}
