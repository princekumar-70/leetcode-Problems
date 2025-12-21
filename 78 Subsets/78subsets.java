class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        getSSQ(nums,0,new ArrayList<>(),result);
        return result;

    }
    public void getSSQ(int[] nums ,int index , List<Integer> curr, List<List<Integer>> result ){
        
        if (index == nums.length) {
            result.add(new ArrayList<>(curr)); 
            return;
        }
        curr.add(nums[index]);
        getSSQ(nums , index+1 , curr, result);


        curr.remove(curr.size() - 1);
        getSSQ(nums , index+1 , curr,result);

    }
}