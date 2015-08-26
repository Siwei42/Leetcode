package String;

public class CountAndSay {
	public String countAndSay(int n) {
        if(n < 1)
            return "";
        String res = "1";
        int m = 0;
        while(m < n-1){
            int count = 1;
            StringBuilder temp = new StringBuilder();
            for(int j = 1; j < res.length(); j++){
                if(res.charAt(j) == res.charAt(j-1))
                    count++;
                else{
                    temp.append(count);
                    temp.append(res.charAt(j-1));
                    count = 1;
                }
            }
            temp.append(count);
            temp.append(res.charAt(res.length()-1));
            res = temp.toString();
            m++;
        }
        return res;
    }
}
