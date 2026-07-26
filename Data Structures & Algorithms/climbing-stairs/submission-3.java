class Solution {
    public int climbStairs(int n) {
        int i=0;
         if(n==1){
            return 1;
        }
        int prev=2,prev2=1;
       

        for(i=3;i<=n;i++){
           int cur=prev+prev2;
           prev2=prev;
           prev=cur;
        }
        return prev;
    }
}
