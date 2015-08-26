package String;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
        String res = "";
        if(strs == null || strs.length == 0)
            return res;
        if(strs.length == 1)
            return strs[0];
        for(int i = 0; i < strs[0].length(); i++){
            char a = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(strs[j].length() <= i)
                    return res;
                else{
                    if(strs[j].charAt(i) != a)
                        return res;
                }
            }
            res += a;
        }
        return res;
    }
}
