package String;
import java.util.*;
public class IntegerToEnglishWords {
	public String numberToWords(int num) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        StringBuilder res = new StringBuilder();
        if(num == 0)
            return "Zero";
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(10, "Ten");
        map.put(11, "Eleven");
        map.put(12, "Twelve");
        map.put(13, "Thirteen");
        map.put(14, "Fourteen");
        map.put(15, "Fifteen");
        map.put(16, "Sixteen");
        map.put(17, "Seventeen");
        map.put(18, "Eighteen");
        map.put(19, "Nineteen");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");
        map.put(50, "Fifty");
        map.put(60, "Sixty");
        map.put(70, "Seventy");
        map.put(80, "Eighty");
        map.put(90, "Ninety");
        map.put(100, "Hundred");
        // map.put(1000, "Thousand");
        // map.put(1000000, "Million");
        // map.put(1000000000, "Billion");
        if(num/1000000000 > 0){
            res.append(helper(num/1000000000, map)).append("Billion ");
            num = num % 1000000000;
        }
        if(num/1000000 > 0){
            res.append(helper(num/1000000, map)).append("Million ");
            num = num % 1000000;
        }
        if(num/1000 > 0){
            res.append(helper(num/1000, map)).append("Thousand ");
            num = num % 1000;
        }
        if(num > 0){
            res.append(helper(num, map));
        }
        return res.toString().trim();
    }
    public String helper(int num, HashMap<Integer, String> map){
        StringBuilder tmp = new StringBuilder();
        if(num/100 > 0){
            tmp.append(map.get(num/100)).append(" ");
            tmp.append(map.get(100)).append(" ");
            num = num % 100;
        }
        if(num/20 > 0){
            tmp.append(map.get(num - num%10)).append(" ");
            num = num % 10;
        }
        if(num > 0){
            tmp.append(map.get(num)).append(" ");
        }
        return tmp.toString();
    }
}
