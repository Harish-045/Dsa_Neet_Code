class Solution {
    public int rob(int[] nums) {
       if(nums.length==1){
        return nums[0];
       }
       int[] arr=new int[nums.length-1];
       int[] arr2=new int[nums.length-1];
       int k=0,j=0;
       for(int i=0;i<nums.length;i++){
        if(i!=0){
            arr[k]=nums[i];
            k++;
        }
        if(i!=nums.length-1){
            arr2[j]=nums[i];
            j++;
        }
       }
       return Math.max(MaxSum(arr),MaxSum(arr2));
        
    }
    public int MaxSum(int[] nums){
        int prev=nums[0];
        int prev2=0;
        for(int i=1;i<nums.length;i++){
           int take=nums[i];
           if(i>1){
            take+=prev2;
           }
           int notTake=0+prev;
           int cur=Math.max(take,notTake);
           prev2=prev;
           prev=cur;
          
        
     
        }
        return prev;
    }
}
