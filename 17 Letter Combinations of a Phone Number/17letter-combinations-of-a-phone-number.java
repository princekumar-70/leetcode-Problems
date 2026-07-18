class Solution {
    List<String> ans = new ArrayList<>();
    String[] map = {"" ,"", "abc" , "def","ghi" ,"jkl", "mno","pqrs","tuv","wxyz" };
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return ans;
        }
        Find(digits, 0, new StringBuilder());

        return ans;
    }
    private void Find(String arr , int idx , StringBuilder path){
        if(idx==arr.length()){
            ans.add(path.toString());
            return;
        }
        String letters = map[arr.charAt(idx)-'0'];
        for(char ch : letters.toCharArray()){
            path.append(ch);
            Find(arr, idx+1, path);
            path.deleteCharAt(path.length()-1);
        }
    }
}