public class Java5_5PatternsExercise {
    public static void main(String[] args) {
        //Ques1. Print a hollow rectangle pattern
        System.out.println(" Pattern 1: Hollow Rectangle Pattern");
        int row = 4;
        int col = 5;
        for (int i = 0; i < row; i++) {
            if (i == 0 || i == row - 1) {
                for (int j = 0; j < col; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 1; j < col - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }


        //Ques2. Print an inverted & rotated half-pyramid pattern.
        System.out.println(" Pattern 2: Inverted & Rotated Half-Pyramid Pattern");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Ques3. Inverted Half-Pyramid with numbers Pattern
        System.out.println(" Pattern 3 :Inverted Half-Pyramid with Numbers Pattern");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        //Ques4. Floyd's Triangle Pattern
        System.out.println("Floyd's Triangle Pattern");
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        //Ques5. 0-1 Triangle Pattern
        System.out.println("0-1 Triangle Pattern");
        for (int i = 1; i <= 5; i++) {
            int nums = (i % 2 == 0) ? 0 : 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(nums + " ");
                nums = 1 - nums;
            }
            System.out.println();
        }

        //Ques6. Butterfly Pattern
        System.out.println("Butterfly Pattern");
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Ques7. Solid Rhombus Pattern
        System.out.println("Solid Rhombus Pattern");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}






