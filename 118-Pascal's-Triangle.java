
class Solution {

    public List<List<Integer>> generate(int num) {
            List<List<Integer>> pascal = new ArrayList<>();
            
            for(int i=0; i<num; i++){
                int value=1;
                List<Integer> list = new ArrayList<>();

                for(int j=0; j<=i; j++){
                   
                   list.add(value);
                   value= value*(i-j)/(j+1);
                }

                pascal.add(list);
            }
            return pascal;
    }

 
}
