class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> li=new ArrayList<>();
        int max=0,r=0;
        
        for(int i=0;i<nums.length-k+1;i++){
            max=nums[i];
            r=i;
             while(r<i+k){
                if(nums[r]>max){
                    max=nums[r];
                }
                r++;
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
