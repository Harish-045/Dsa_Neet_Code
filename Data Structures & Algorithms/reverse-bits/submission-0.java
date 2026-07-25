class Solution {
    int ans=0;
    public int reverseBits(int n) {
    for(int i=0;i<32;i++){
        int bit=n&1;
        ans=ans<<1;
        ans=ans|bit;
        n=n>>>1;
        }
      return ans;
    }
}
