class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]= i+1;
        }

        Find(0, arr, k, new ArrayList<>());
        return ans;
    }
    private void Find(int idx , int[]arr , int k , List<Integer> list){
       if(list.size()==k){
        ans.add(new ArrayList<>(list));
        return;
       }
       for(int i = idx ; i<arr.length; i++){
        list.add(arr[i]);
        Find(i+1 , arr,k , list);
        list.remove(list.size()-1);
       }
    }
}