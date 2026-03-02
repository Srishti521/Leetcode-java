class Solution {
    public double myPow(double x, int n) {
       long N = n; //store Integer.MAX_VALUE safely

       if(N<0){
        x = 1/x; //if power is negative, take the reciprocal
        N = -N; //make power positive
       }
       return power(x,N); //call helper function
       }
       private double power(double x , long n){
        if(n == 0){
         return 1;
       }
       Double half = power (x,n/2);

       if(n % 2 ==0){
        return half * half;
       } else {
        return half* half* x;
       }
    }
}