class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(0,candidates,target,new ArrayList<>());
        return ans;
    }
    void backtrack(int index,int[] candidates,int target,List<Integer> cur){
     
        if(target==0){
                ans.add(new ArrayList<>(cur));
                return;
            }
        for(int i=index;i<candidates.length;i++){
           if(i>index&&candidates[i]==candidates[i-1]){
            continue;
           }
           if(candidates[i]>target){
            break;
           }
 
           cur.add(candidates[i]);
           backtrack(i+1,candidates,target-candidates[i],cur);
           cur.remove(cur.size()-1);
          
        }
    }
}
