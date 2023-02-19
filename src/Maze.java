import java.util.Scanner;

public class Maze {

    protected char[][] m;
    protected int height = 9;
    protected int width = 9;

    public Maze(char[][] m) {
        this.m = m;
    }

    public void escape(int row, int col) {
        boolean isTrue = true;

        if (isTrue) {
            Scanner in = new Scanner(System.in);
            int cont = in.nextInt();
            boolean downEmpty = (row + 1) <= 8 && Character.compare(m[row + 1][col], ' ') == 0;
            boolean upEmpty = (row - 1) >= 0 && Character.compare(m[row - 1][col], ' ') == 0;
            boolean rightEmpty = Character.compare(m[row][col + 1], ' ') == 0;
            boolean leftEmpty = Character.compare(m[row][col - 1], ' ') == 0;
            boolean currentEmpty = Character.compare(m[row][col], ' ') == 0;

            if (currentEmpty) { // check if current position is empty space
                m[row][col] = '+';
                if(downEmpty) {
                    row += 1;
                    System.out.println("row: " + row + "col: " + col);
                } else if(rightEmpty) {
                    col += 1;
                    System.out.println("row: " + row + "col: " + col);
                } else if(leftEmpty) {
                    col -= 1;
                    System.out.println("row: " + row + "col: " + col);
                } else if(upEmpty) {
                    row -= 1;
                    System.out.println("row: " + row + "col: " + col);
                }
            }
            if (cont == 2 || row > 8) {
                isTrue = false;
            }
            escape(0, 1);
        }
    }
}
