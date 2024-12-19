class Solution {
    public boolean halvesAreAlike(String s) {
        int length = s.length();
        int vowel1=0;
        int vowel2=0;

        for(int i=0; i<length/2; i++ ){
            if(s.charAt(i) == 'A' || s.charAt(i) == 'a' ||
               s.charAt(i) == 'e' || s.charAt(i) == 'E' ||
               s.charAt(i) == 'i' || s.charAt(i) == 'I' ||
               s.charAt(i) == 'O' || s.charAt(i) == 'o' ||
               s.charAt(i) == 'U' || s.charAt(i) == 'u'){
                vowel1++;
               }
        }

        for(int i=length/2; i<length; i++ ){
            if(s.charAt(i) == 'A' || s.charAt(i) == 'a' ||
               s.charAt(i) == 'e' || s.charAt(i) == 'E' ||
               s.charAt(i) == 'i' || s.charAt(i) == 'I' ||
               s.charAt(i) == 'O' || s.charAt(i) == 'o' ||
               s.charAt(i) == 'U' || s.charAt(i) == 'u'){
                vowel2++;
               }
        }

        if(vowel1 == vowel2){
            return true;
        }

        return false;

        
    }
}