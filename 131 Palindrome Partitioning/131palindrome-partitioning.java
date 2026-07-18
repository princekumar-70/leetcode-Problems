class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        char[] ch = s.toCharArray();
        Find(0 , ch, ans, list);
        return ans;
    }
    private void Find(int idx , char[] arr , List<List<String>> ans , List<String> list){
        if(idx==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = idx;i<arr.length ; i++){
            if(isPalindrome(arr, idx, i)){
                list.add(new String(arr, idx ,i-idx+1 ));
            Find(i+1, arr , ans, list);
            list.remove(list.size()-1);
            }
        }
    }
    private boolean isPalindrome(char[] arr, int left , int right){
        while(left<right){
            if(arr[left]!=arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}