class Solution {
    public boolean halvesAreAlike(String s) {
        int length = s.length();
        int count=0;
        String vw ="aeiouAEIOU";

        for(int i=0 ; i<length/2; i++){
            if(vw.indexOf(s.charAt(i))!= -1){
                count++;
            }
            if(vw.indexOf(s.charAt(length-1-i))!=-1){
                count--;
            }
        }

        if(count ==0){
            return true;
        }
        return false;
    }
}