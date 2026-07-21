class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        find(nums, ans, ds, freq);
        return ans;
        
    }
    public void find(int[] arr , List<List<Integer>> ans , List<Integer> list , boolean[] freq){
        if(list.size()==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i<arr.length;i++){
            if(freq[i]) continue;
            if(i>0 && arr[i]==arr[i-1] && !freq[i-1]) continue;
            freq[i] = true;
            list.add(arr[i]);
            find(arr, ans, list, freq);
            list.remove(list.size()-1);
            freq[i] =  false;
        }
    }
}