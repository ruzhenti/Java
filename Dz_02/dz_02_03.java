public class dz_02_03 {
    public static void main(String[] args)  {
    }    
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
}