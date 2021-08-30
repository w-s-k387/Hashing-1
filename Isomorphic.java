package Hashing2;

import java.util.HashMap;

public class Isomorphic {
	 public boolean isIsomorphic(String s, String t) {
	        //checking for string length
	        if(s.length()!=t.length()) return false;
	        //maintaining the HashMaps for character mapping.
	    HashMap<Character,Character> smap= new HashMap<Character,Character>();
	    HashMap<Character,Character> tmap= new HashMap<Character,Character>();
	    for(int i=0;i<s.length();i++){
	        char schar=s.charAt(i);
	        char tchar=t.charAt(i);
	        if(smap.containsKey(schar)){
	            if(smap.get(schar)!=tchar) return false;
	         
	        }
	        else{
	            smap.put(schar,tchar);
	        }
	        if(tmap.containsKey(tchar)){
	            if(tmap.get(tchar)!=schar) return false;
	         
	        }
	        else{
	            tmap.put(tchar,schar);
	        }
	    }
	        return true;
	        
	    }

}
