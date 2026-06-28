class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char[] ch=str.toCharArray();
        char[] ch2=new char[ch.length];
        int j=0;
        for(int i=ch.length-1;i>=0;i--){
            ch2[j++]=ch[i];
        }
        for(int i=0;i<ch.length;i++){
            if(ch[i]!=ch2[i]){
                return false;
            }
        }
        return true;
    }
}
