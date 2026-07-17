class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backtrack(0,nums,target,new ArrayList<>());
        return ans;
    }
    void backtrack(int index,int[] nums,int target,List<Integer>cur){
        if(target==0){
            ans.add(new ArrayList<>(cur));
            return;
        }
        if(target<0||index==nums.length){
            return;
        }
        cur.add(nums[index]);
        backtrack(index,nums,target-nums[index],cur);
        cur.remove(cur.size()-1);
        backtrack(index+1,nums,target,cur);

    }
}
