class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        backtrack(0,s,ans,new ArrayList<>());
        return ans;
    }
    static void backtrack(int ind,String s,List<List<String>> ans,List<String> cur){
        if(ind==s.length()){
            ans.add(new ArrayList<>(cur));
            return ;
        }
        for(int i=ind;i<s.length();i++){
            if(isPal(s,ind,i)){
                cur.add(s.substring(ind,i+1));
                backtrack(i+1,s,ans,cur);
                cur.remove(cur.size()-1);
            }
        }
    }
    static boolean isPal(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
