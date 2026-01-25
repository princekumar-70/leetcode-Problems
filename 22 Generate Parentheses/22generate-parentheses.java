class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        Helper(n,0,0,"",ans);
        return ans;
    }
    public void Helper(int n ,int l,int r,String s,List<String> ans){
        if(r==n){
            ans.add(s);
            return;
        }
        if(l<n) Helper(n,l+1,r,s+"(",ans);
        if(r<l) Helper(n,l,r+1,s+")",ans);

    }
}