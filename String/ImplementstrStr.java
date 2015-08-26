package String;

public class ImplementstrStr {
	public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null)
            return -1;
        if(needle.length() == 0)
            return 0;
        for(int i = 0; i < haystack.length()-needle.length()+1; i++){
            for(int j = 0; j < needle.length(); j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
                if(j == needle.length())
                    return i;
            }
        }
        return -1;
    }
	public static void main(String[] args){
		ImplementstrStr is = new ImplementstrStr();
		System.out.println(is.strStr("a", "a"));
	}
}
