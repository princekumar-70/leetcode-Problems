class Solution {
    public double angleClock(int hour, int minutes) {
        double angle = Math.abs((30*hour)-(5.5*minutes));
        double result = 360-angle;
         if(angle>180){
            return result;
         }
         return angle;
    }
}