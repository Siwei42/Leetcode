package String;

public class AddBinary {
	public String addBinary(String a, String b) {
        String res = new String();
        int length = Math.max(a.length(), b.length());
        int carry = 0;
        for(int i = 0; i < length; i++){
            int p = 0;
            int q = 0;
            if(a.length() > i)
                p = a.charAt(a.length()-1-i) - '0';
            else
                p = 0;
            if(b.length() > i)
                q = b.charAt(b.length()-1-i) - '0';
            else
                q = 0;
            int sum = p + q + carry;
            carry = sum / 2;
            res = sum % 2 + res;
        }
        return carry == 0 ? res : "1" + res;
    }
}
