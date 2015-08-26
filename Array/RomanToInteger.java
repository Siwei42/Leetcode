package Array;
import java.util.*;
public class RomanToInteger {
	public int romanToInt(String s) {
		int res = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for(int i = s.length()-1; i >= 0; i--){
            if(i == s.length()-1 || map.get(s.charAt(i)) >= map.get(s.charAt(i+1)))
                res += map.get(s.charAt(i));
            else
                res -= map.get(s.charAt(i));
        }
        return res;
	}
	public static void main(String[] args){
		RomanToInteger ri = new RomanToInteger();
    	System.out.println(ri.romanToInt("MCMXCVI"));
    }
}
