class Solution {
    public int[] countBits(int n) {
        Map<Integer,Integer>map=new HashMap<>();
        
        for(int i=0;i<=n;i++){
            int num=i;
            int cnt=0;
            while(num>0){
                num=num&(num-1);
                cnt++;
            }
            if(!map.containsKey(i)){
                map.put(i,cnt);
            }
        }
      int[] ans=new int[n+1];
      for(int i=0;i<ans.length;i++){
        ans[i]=map.get(i);
      }
      return ans;
    }
}
