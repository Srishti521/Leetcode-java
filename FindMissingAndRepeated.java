class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long actualSum=0,  actualSquareSum=0;
        int n = grid.length;
        long N = (long) n*n;

       for(int i =0;i<n; i++){
         for(int j =0; j<n;j++){
            int num = grid[i][j];
            actualSum += num;
            actualSquareSum += (long) num*num;
          }
        }
         //compute expected sum and expectedsquaresum
         long expectedSum=(N*(N+1))/2;
         long expectedSquareSum=(N*(N+1)*(2*N+1))/6;

         //compute sumDiff and squareSumDiff
         long sumDiff = actualSum-expectedSum;
         long squareSumDiff= actualSquareSum-expectedSquareSum;

         long sumAb = squareSumDiff/sumDiff;

         int repeated=(int)((sumAb+sumDiff)/2);
         int missing = (int) ((sumAb-(sumDiff))/2);
       
       return new int[]{repeated,missing};

    }
}