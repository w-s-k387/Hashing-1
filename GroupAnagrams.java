package Hashing2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	 public List<List<String>> groupAnagrams(String[] strs) {
//       returning list of lists of strings
      if(strs.length==0) return new ArrayList();
     Map<String,List> ans= new HashMap<String,List>();
      for(String s:strs){
//           convert the string into char array and then sort
         char[] ca = s.toCharArray();
          Arrays.sort(ca);
          String key=String.valueOf(ca);
          if(!ans.containsKey(key))
              ans.put(key,new ArrayList());
                ans.get(key).add(s);
          
          
      }
      return new ArrayList(ans.values());
  }

}
