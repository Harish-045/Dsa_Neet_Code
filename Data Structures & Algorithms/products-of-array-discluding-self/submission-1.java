class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul=1,cnt=0;
        for(int i:nums){
            if(i==0){
                cnt++;
            }
             else{
                mul*=i;
             }

          
        }
        int[] arr=new int[nums.length];
        if(cnt>1){
            return arr;
        }
      if(cnt==1){
           for(int i=0;i<nums.length;i++){
               if(nums[i]==0){
                   arr[i]=mul;
               }
               else{
                arr[i]=0;
               }
                
            
               
            
        }
        return arr;
      }
        for(int i=0;i<nums.length;i++){
            arr[i]=mul/nums[i];
        }
        return arr;
    }
}  
