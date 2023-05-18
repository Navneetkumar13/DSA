// Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix.

/*
Approach: 
1> Consider an extra imaginary row on top and an extra col on the left side.
2> Traverse through the matrix and if you find a zero then mark that extra row and col as 0.
3> You need not take extra row and col. For this purpose use the 1st row and 1st col to mark that as 0 and take an extra integer or boolean to keep the rows and col from overlapping.
4> After that run a loop again to traverse through each element and keep a check on the imaginary row and col for marked 0's. and change the value of the field accordingly. 
*/

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean rowZero = false;
        int row = matrix.length;
        int col = matrix[0].length;

        // making the 0th row and 0th col 0 if an element is zero. to later mark all elements of row and col to zero.
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(matrix[r][c] == 0){
                    matrix[0][c] = 0;
                    if(r>0){
                        matrix[r][0] = 0;
                    }else{
                        rowZero = true;
                    }
                }
            }
        }

        // from 1st row and first col marking elements with 0;
        for(int r=1;r<row;r++){
            for(int c=1; c<col; c++){
                if(matrix[0][c] == 0 || matrix[r][0] == 0){
                    matrix[r][c] = 0;
                }
            }
        }

        // if the 0th col is zero marking all rows in 0th col as 0. 
        if(matrix[0][0] == 0){
            for(int r=0;r<row;r++){
                matrix[r][0] = 0;
            }
        }

        // if vice-versa then making all the cols in 0th row as 0.
        if(rowZero){
            for(int c=0;c<col;c++){
                matrix[0][c] = 0;
            }
        }

    }
}
