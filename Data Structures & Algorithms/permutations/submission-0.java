class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        boolean[] vis=new boolean[nums.length];
        backtrack(nums,new ArrayList<>(),vis);
        return ans;
    }
    void backtrack(int[] nums,List<Integer> cur,boolean[] vis){
        if(cur.size()==nums.length){
           ans.add(new ArrayList<>(cur));
           return;

        }
        for(int i=0;i<nums.length;i++){
            if(!vis[i]){
                vis[i]=true;
                cur.add(nums[i]);
                backtrack(nums,cur,vis);
                cur.remove(cur.size()-1);
                vis[i]=false;
            }
            
        }
    }
}
