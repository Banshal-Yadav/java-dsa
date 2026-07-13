package revision;
import java.util.*;
class ValidAnagram {
    public boolean ValidAnagrram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length()) return false;
        
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int j = 0; j < t.length(); j++) {
            if(!map.containsKey(t.charAt(j))) {
                return false;
            } else if(map.get(t.charAt(j)) == 0) {
                return false;
            }
            map.put(t.charAt(j), map.get(t.charAt(j)) - 1);
        }

        return true;
    }
}