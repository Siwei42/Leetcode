package Array;
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s == null)
            return 0;
        HashSet<Character> set = new HashSet<Character>(); 
        int pre = 0, max = 0;
        for(int cur = 0; cur < s.length(); cur++){
            if(set.contains(s.charAt(cur))){
                while(pre < cur && s.charAt(pre) != s.charAt(cur)){
                    set.remove(s.charAt(pre));   
                    pre++;
                }
                pre++;
            }
            else{
                set.add(s.charAt(cur));
                max = Math.max(cur - pre + 1, max);
            }    
        }
        return max;
    }
}