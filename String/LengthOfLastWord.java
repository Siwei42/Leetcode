package String;

public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0)
            return 0;
        int res = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                if(res == 0)
                    continue;
                else 
                    break;
            }
            res++;
        }
        return res;
    }
}
