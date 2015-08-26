package String;

public class ValidPalindrome {
	public boolean isPalindrome1(String s) {
        if(s == null)
            return false;
        if(s.length() == 0)
            return true;
        s = s.toUpperCase();
        int p1 = 0;
        int p2 = s.length()-1;
        while(p2 > p1){
            if((s.charAt(p1) < '0' || s.charAt(p1) > '9') && (s.charAt(p1) < 'A' || s.charAt(p1) > 'Z')){
                p1++;
                continue;
            }
            if((s.charAt(p2) < '0' || s.charAt(p2) > '9') && (s.charAt(p2) < 'A' || s.charAt(p2) > 'Z')){
                p2--;
                continue;
            }
            if(s.charAt(p1) != s.charAt(p2))
                return false;
            p1++; p2--;
        }
        return true;
    }
//	Regular Expression Method
	public boolean isPalindrome2(String s) {
        if(s.length() == 0)
            return true;
        s = s.toUpperCase();    
        s = s.replaceAll("[^A-Z0-9]","");
        int p1 = 0;
        int p2 = s.length()-1;
        while(p2 > p1){
            if(s.charAt(p1) != s.charAt(p2))
                return false;
            p1++; p2--;
        }
        return true;
    }
}
