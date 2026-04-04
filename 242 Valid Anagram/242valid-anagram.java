import java.util.HashMap;

 class Solution {
	public static boolean isAnagram(String s1, String s2) {
		HashMap<Character , Integer> map = new HashMap<>();
        if(s1.length()!=s2.length()) return false;
		for(int i =0 ;i<s1.length();i++) {
			char ch = s1.charAt(i);
			if(map.containsKey(ch)) {
				int freq = map.get(s1.charAt(i));
				map.put(ch, freq+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		for(int i=0;i<s2.length();i++) {
			
				char ch = s2.charAt(i);
				if(!map.containsKey(ch)|| map.get(ch)==0) {
					return false;
				}
				map.put(ch, map.get(ch)-1);
			
		
		}
		return true;
		
	}

}
