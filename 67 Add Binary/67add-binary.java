class Solution {
    public String addBinary(String a, String b) {
        char[] arr = a.toCharArray();
        char[] arr2 = b.toCharArray();
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = arr.length-1;
        int j = arr2.length-1;
        while(i>=0||j>=0||carry!=0){
            int bit1 = (i>=0)?arr[i]-'0':0;
            int bit2 = (j>=0)?arr2[j]-'0':0;
            int sum = bit1+bit2+carry;
            sb.append(sum%2);
            carry = sum/2;
            i--;
            j--;
        }
        sb.reverse();
        return sb.toString();
    }
}