import java.util.Scanner;

public class MazeDemo
{
    public static void main(String args[]) {
        char[][] m = {
                {'*', ' ', '*', '*', '*', '*', '*', '*', '*'},
                {'*', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*'},
                {'*', ' ', '*', '*', '*', '*', '*', ' ', '*'},
                {'*', ' ', '*', ' ', '*', ' ', ' ', ' ', '*'},
                {'*', ' ', '*', ' ', '*', '*', '*', ' ', '*'},
                {'*', ' ', ' ', ' ', '*', ' ', ' ', ' ', '*'},
                {'*', '*', '*', ' ', '*', ' ', '*', ' ', '*'},
                {'*', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*'},
                {'*', '*', '*', '*', '*', '*', '*', ' ', '*'}};
        Maze maze = new Maze(m);


            maze.escape(0, 1);
            System.out.println("The path from the starting point to the exit is drawn with \"+\" below:");
            for (int i = 0; i < maze.height; i++) {
                for (int j = 0; j < maze.width; j++) {
                    System.out.print(m[i][j]);
                }
                System.out.println();
            }
        }
    }