class Solution {
    public int compress(char[] ch) {
        int index = 0; 
        int i = 0;     

        while (i < ch.length) {
            char current = ch[i];
            int count = 0;

         
            while (i < ch.length && ch[i] == current) {
                i++;
                count++;
            }

           
            ch[index++] = current;

           
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    ch[index++] = c;
                }
            }
        }

        return index; 
    }
}
