class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Solve(1, list, k, n, ans, 0);
        return ans;
    }
    public void Solve( int idx , List<Integer> list,int k , int n, List<List<Integer>> ans , int sum  ){
        if(list.size()==k){
            if(sum==n){
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        for(int i =idx;i<=9;i++ ){
            list.add(i);
            Solve(i+1, list, k , n ,ans, sum+i);
            list.remove(list.size()-1);
        }
    }
}