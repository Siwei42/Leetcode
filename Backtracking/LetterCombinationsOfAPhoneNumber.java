package Backtracking;
import java.util.*;
public class LetterCombinationsOfAPhoneNumber {
	public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        String item = new String();
        if(digits == null || digits.length() == 0)
            return res;
        HashMap<Character, String> map = new HashMap<Character, String>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        helper(digits, map, res, item);
        return res;
    }
    public void helper(String digits, HashMap<Character, String> map, List<String> res, String item){
        if(0 == digits.length()){
            res.add(new String(item));
            return;
        }
        for(int i = 0; i < map.get(digits.charAt(0)).length(); i++){
        	if(!map.containsKey(digits.charAt(0)))
        		continue;
            if(digits.length() > 1){
                helper(digits.substring(1), map, res, item + map.get(digits.charAt(0)).charAt(i));
            }
            else{
                helper(new String(), map, res, item + map.get(digits.charAt(0)).charAt(i));
                continue;
            }
            if(item.length() > 1)
                item.substring(0, item.length()-2);
            else
                item = new String();
        }
    }
    public static void main(String[] args){
    	LetterCombinationsOfAPhoneNumber l = new LetterCombinationsOfAPhoneNumber();
    	System.out.println(l.letterCombinations("234"));
    }
}
