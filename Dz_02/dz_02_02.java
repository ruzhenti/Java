public class dz_02_02 {
    public static void main(String[] args)  {
    }    
class Solution {
    public double myPow(double x, int n) {
        if(n == 0)
            return 1;
        if(x == 1)
            return 1;
        if(x == -1)
            return n % 2 == 0 ? 1: -1;
        
        double ret = 1.0;
        // this is to handle exceptional minimum case
        if(n == Integer.MIN_VALUE)
            return 0;
        
        if(n<0){
            n = -n;
          	//if power is less than 0 x is reciprocal.
            x = 1/x;
        }
        // while n > 0
        while(n > 0){
          	//if current right most is 1 than multiply return with x(calculated for each binary level).
            if((n & 1) == 1){
                ret *= x;
            }
          	//this compensates calculating of binary leveling up
            x = x * x;
          	//for each step n is divided by 2, which is same as n bitshift 1
            n = n >> 1;
        }
        
        return ret;
        
    }
}
}