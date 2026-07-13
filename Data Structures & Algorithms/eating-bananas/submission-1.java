class Solution {
     static int valid(int[] piles,int ban){
        int sum=0;
           for(int i=0;i<piles.length;i++){
                sum+=(int)Math.ceil((double)piles[i]/ban);
           } 
           
           return sum;
      }
    public int minEatingSpeed(int[] piles, int h) {
      
      int min=0,max=Integer.MAX_VALUE;
      for(int i:piles){
        min=Math.min(i,min);
        max=Math.max(i,max);
      }
      int l=min,h1=max,ans=0;
      while(l<=h1){
        int mid=(l+h1)/2;
        if(valid(piles,mid)<=h){
              ans=mid;
              h1=mid-1;
        }
        else{
            l=mid+1;
        }

      }
      return ans;
           
    }

}
