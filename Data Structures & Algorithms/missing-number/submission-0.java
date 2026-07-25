class Solution {
    public int missingNumber(int[] nums) {
        int a=0,index=0;
      
        for(int i=0;i<nums.length;i++){
            a^=nums[i];
            
        }
        for(int i=0;i<=nums.length;i++){
            index^=i;
        }
        return a^index;
    }

}
