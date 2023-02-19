import java.util.Scanner;

public class Maze {

    protected char[][] m;
    protected int height = 9;
    protected int width = 9;

    public Maze(char[][] m) {
        this.m = m;
    }

    public void escape(int row, int col) {
        boolean istrue = true;
        boolean isTrue = true;
        while (isTrue) {
            Scanner in = new Scanner(System.in);
            int cont = in.nextInt();



            if (Character.compare(m[row][col], '*') != 0) { // check if current position is empty space
                m[row][col] = '+';
                if (Character.compare(m[row + 1][col], '*') != 0) { //check down for empty space
                    row += 1;
                    m[row][col] = '+';
                } else if (Character.compare(m[row + 1][col], '+') != 0) { //deletes "+" if down is full
                    row -= 1;
                    m[row][col] = ' ';
                }
                if (Character.compare(m[row][col + 1], '*') != 0) { // check to right for empty space
                    col += 1;
                    m[row][col] = '+';
                } else if (Character.compare(m[row][col + 1], '+') != 0) { //deletes "+" if right is full
                    col -= 1;
                    m[row][col] = ' ';
                }
                if (Character.compare(m[row][col - 1], '*') != 0) { // checks to the left for empty space
                    col -= 1;
                    m[row][col] = '+';
                }
                if (Character.compare(m[row - 1][col], '*') != 0 && row >= 0) { // checks up for empty space
                    row -= 1;
                    m[row][col] = '+';
                }
                if (cont == 2) {
                    isTrue = false;
                }

            }
        }
    }
}
