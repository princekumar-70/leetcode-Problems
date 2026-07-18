class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
       Map<String, List<String>> map = new HashMap<>();

        for (String str : arr) {

           char[] ch = str.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);


    
        }   
        return new ArrayList<>(map.values());
    }
}