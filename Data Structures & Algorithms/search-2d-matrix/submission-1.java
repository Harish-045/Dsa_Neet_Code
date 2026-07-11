class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0,h=matrix.length*matrix[0].length-1;
        while(l<=h){
            int m=(l+h)/2;
            int row=m/matrix[0].length;
            int col=m%matrix[0].length;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                l=m+1;
            }
            else{
                h=m-1;
            }

        }
        return false;
    }
}
