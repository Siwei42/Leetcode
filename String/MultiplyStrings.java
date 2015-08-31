package String;

public class MultiplyStrings {
	public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] temp = new int[m+n]; 
        for(int i = 0; i < m; i++){
            int p = num1.charAt(m-1-i) - '0';
            for(int j = 0; j < n; j++){
                int q = num2.charAt(n-1-j) - '0';
                temp[i+j] += p * q;
            }
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < m+n; i++){
            int digit = temp[i] % 10;
            int carry = temp[i] / 10;
            res.insert(0, digit);
            if (i < m + n - 1)
                temp[i + 1] += carry;
        }
        while (res.length() > 0 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }
        return res.length() == 0 ? "0" : res.toString();
    }
}
