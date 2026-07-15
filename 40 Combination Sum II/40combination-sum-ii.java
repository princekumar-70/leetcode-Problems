class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        Find(0 , candidates , target , list , new ArrayList<>());
        return list;
    }
    private void Find(int idx , int[] arr, int target, List<List<Integer>> list, List<Integer> ds){
        if(target==0){
            list.add(new ArrayList<>(ds));
            return;
        }
        for(int i = idx; i<arr.length; i++){
            if(i>idx && arr[i]==arr[i-1])continue;
            if(arr[i]>target)break;
            ds.add(arr[i]);
            Find(i+1, arr, target-arr[i], list , ds);
            ds.remove(ds.size()-1);
        }
    }
}