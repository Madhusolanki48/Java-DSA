public class Java7_Exercise {
/* Ques 1. Rat in a maze 
 * You are given a starting for a rat which is stuck in a maze at an initial point(0,0)
 * (the maze can be thought of as a 2-D plane).The maze would be given in the form of a
 * square matrix of order N*N where the cells with value 0 represent the maze's blocked
 * locations while value 1 is the open/available path that the rat can take to reach its destination.
 * The rat's destination is at (N-1,N-1).
 * Your task is to find all the possible paths that the rats can take to reach from source to
 * destination in the maze.
 * The possible directions that it can take to move in the maze are 'U'(up)i.e.(x,y-1)
 * 'D'(down)i.e.(x,y+1),'L'i.e.(x-1,y),'R'(right)i.e.(x+1,y) */

 public static boolean findPath(int[][] maze, int[][] path, int i, int j, int n) {
    // base case
    if (i == n - 1 && j == n - 1 && maze[i][j] == 1) {
        path[i][j] = 1;
        return true;
    }

    // boundary and safety check
    if (i >= 0 && j >= 0 && i < n && j < n && maze[i][j] == 1) {
        // mark path
        path[i][j] = 1;

        // Move Down
        if (findPath(maze, path, i + 1, j, n)) return true;

        // Move Right
        if (findPath(maze, path, i, j + 1, n)) return true;

        // Move Up
        if (findPath(maze, path, i - 1, j, n)) return true;

        // Move Left
        if (findPath(maze, path, i, j - 1, n)) return true;

        // Backtrack
        path[i][j] = 0;
    }

    return false;
}

public static void main(String[] args) {
    int[][] maze = {
        {1, 0, 0, 0},
        {1, 1, 0, 1},
        {0, 1, 0, 0},
        {1, 1, 1, 1}
    };
    int n = maze.length;
    int[][] path = new int[n][n];

    if (findPath(maze, path, 0, 0, n)) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(path[i][j] + " ");
            }
            System.out.println();
        }
    } else {
        System.out.println("No path found.");
    }
}
    
}
