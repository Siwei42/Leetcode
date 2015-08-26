package String;
import java.util.*;
public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		if(s.length() != t.length())
			return false;
		if((s == null && t != null) || (t == null && s != null))
			return false;
        if(s != null && t != null){
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            for(int i = 0; i < s.length(); i++){
                if(!map.containsKey(s.charAt(i)))
                    map.put(s.charAt(i),1);
                else
                    map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            for(int i = 0; i < t.length(); i++){
                if(!map.containsKey(t.charAt(i)))
                    return false;
                else
                    map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }
            for(int i = 0; i < t.length(); i++){
                if(map.get(s.charAt(i)) != 0)
                    return false;
            }
        }
        return true;
    }
	public static void main(String[] args){
		ValidAnagram va = new ValidAnagram();
		System.out.println(va.isAnagram("a", "ab"));
	}
}
