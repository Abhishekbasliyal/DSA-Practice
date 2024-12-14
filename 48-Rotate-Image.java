class Solution {
    public void rotate(int[][] matrix) {

        int temp;
        int length = matrix[0].length;


        for(int i=0; i<length ; i++){
            for(int j=i+1; j<length; j++){
                if(i!=j){
                    temp= matrix[j][i];
                    matrix[j][i] = matrix[i][j];
                    matrix[i][j] = temp;

                }
            }
        }


         for(int i=0; i<length ; i++){
            for(int j=0 ; j<length/2; j++){
             temp=  matrix[i][j];
             matrix[i][j] = matrix[i][length-1-j];
             matrix[i][length-1-j] = temp;
            }
        }
        
    }
}