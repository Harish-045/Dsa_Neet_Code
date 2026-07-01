class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
        int ans=0,leftmax=0,rightmax=0;

        while(i<j){
           if(height[i]<=height[j]){
            if(height[i]>=leftmax){
                leftmax=height[i];
            }
            else{
                ans+=leftmax-height[i];
            }
            i++;
           }
           else{
            if(height[j]>=rightmax){
                rightmax=height[j];
            }
            else{
                ans+=rightmax-height[j];
            }
            j--;
           }
    }
    return ans;
 }
}
