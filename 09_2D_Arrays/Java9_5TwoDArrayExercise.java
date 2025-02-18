public class Java9_5TwoDArrayExercise {
    /*Ques1. Print the number of 7's that are in the 2d array
    example:
    Input: int[][] arr={{4,7,8},{8,8,7}};
    Output: 2
     */
    public static void main(String[] args) {
        int[][] arr = {{4, 7, 8}, {8, 8, 7}};
        int count7 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    count7++;
                }
            }
        }
        System.out.println("The count of 7 : " + count7);


        /*Ques2. Print the sum of the numbers in the second row of the "nums" array.
        Example:
        Input: int[][] nums={{1,4,9},{11,4,3},{2,2,3}};
        Output: 18
         */

        int[][] nums = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        int sum = 0;
        for (int i = 0; i < nums[1].length; i++) {
            sum += nums[1][i];
        }
        System.out.println("Sum of elements of row 2nd =" + sum);


        /*Ques3. Write a program to find the transpose of a matrix.
         */

        int row = 2, col = 3;
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("The original matrix is : ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int[][] transMatrix = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("The transpose matrix is : ");
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(transMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }}



