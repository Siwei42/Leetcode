package String;
import java.util.*;
public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        if(strs == null || strs.length == 0)
            return res;
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(int i = 0; i < strs.length; i++){
            char[] array = strs[i].toCharArray();
            Arrays.sort(array);
            String str = new String(array);
            if(map.containsKey(str)){
                map.get(str).add(strs[i]);
            }
            else{
                ArrayList<String> list = new ArrayList<String>();
                list.add(strs[i]);
                map.put(str, list);
            }
        }
        Iterator<ArrayList<String>> list = map.values().iterator();
        while (list.hasNext()) {
            List<String> item = list.next();
            Collections.sort(item, new Comparator<String>() {
                public int compare(String s1, String s2) {
                    return s1.compareTo(s2);
                }
            });
            res.add(item);
        }
        return res;
    }
}
