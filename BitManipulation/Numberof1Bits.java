package BitManipulation;

public class Numberof1Bits {
	// you need to treat n as an unsigned value
    public int hammingWeight(int n) {
    	if (n == 0) {
            return 0;
        }
    	int res = 0;
        while(n > 0){
        	res++;
        	n &= n-1;
        }
        return res;
    }
    public static void main(String[] args){
    	Numberof1Bits nb = new Numberof1Bits();
    	System.out.println(nb.hammingWeight(2));
    }
}
