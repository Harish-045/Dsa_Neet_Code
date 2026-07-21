class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        int[] ans=new int[n1+n2];
         
        for(int i=0;i<n1;i++){
            ans[i]=nums1[i];
            
        }
       
        for(int i=0;i<n2;i++){
            ans[i+n1]=nums2[i];
        }
        Arrays.sort(ans);
        int n3=ans.length;
       
      
        if(n3%2==0){
            return (double)(ans[n3/2]+ans[n3/2-1])/2;
        }
        
        return ans[n3/2];
        
    }
}
