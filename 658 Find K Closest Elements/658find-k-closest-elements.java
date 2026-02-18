class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
       
      for(int elem : arr){
        int a = Math.abs(elem-x);
        pq.add(new Triplet(a , elem));
        if(pq.size()>k) pq.remove();
      }
      ArrayList<Integer> list = new ArrayList<>();
       while(!pq.isEmpty()){
           list.add(pq.poll().y);
        }
        
        Collections.sort(list);
        return list;
        
    }
}
class Triplet implements Comparable<Triplet>{

	int x;
	int y;
	Triplet( int x, int y){
		
		this.x = x;
		this.y = y;
	}
	
 public int compareTo(Triplet s) {
    
        if(this.x == s.x){
           return this.y - s.y;  
        }
    
      return this.x - s.x;   
   }

	
}