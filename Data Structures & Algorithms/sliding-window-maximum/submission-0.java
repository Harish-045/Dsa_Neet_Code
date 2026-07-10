class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> li=new ArrayList<>();
        int max=0;
        
        for(int i=0;i<nums.length-k+1;i++){
            max=nums[i];
            
            for(int j=i;j<i+k;j++){
                if(nums[j]>max){
                    max=nums[j];
                  
                }
                  
            }
       
            li.add(max);
        }
        int[] arr=new int[li.size()];
        int j=0;
        for(int i=0;i<li.size();i++){
            arr[j++]=li.get(i);
        }
         return arr;
    }
}
