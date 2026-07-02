class StockSpanner {
    ArrayList<Integer> arr ;
    public StockSpanner() {
        arr = new ArrayList<>();
    }
    
    public int next(int price) {
        arr.add(price);
       int  count = 1;
        for(int i = arr.size()-2 ; i>=0;i--){
            if(arr.get(i)<=price){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}

