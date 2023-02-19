public class Maze {

    protected char[][] m;
    protected int height = 9;
    protected int width = 9;

    public Maze(char[][] m) {
        this.m = m;
    }

    public void escape(int row, int col) {


        boolean rightEmpty = true;
        boolean leftEmpty = true;
        boolean upEmpty = true;
        boolean downEmpty = true;

        boolean end = false;
        if(!end) {
            if (row <= 8) {
                if (Character.compare(m[row][col], '*') == 0) {
                    downEmpty = false;
                }
            }
            if (row >= 0) {
                if (Character.compare(m[row][col], '*') == 0) {
                    upEmpty = false;
                }
            }
            if (col >= 0) {
                if (Character.compare(m[row][col], '*') == 0) {
                    leftEmpty = false;
                }
            }
            if (col <= 8) {
                if (Character.compare(m[row][col], '*') == 0) {
                    rightEmpty = false;
                }
            }

            if (downEmpty) {
                m[row][col] = '+';
                row += 1;
            }
            if (rightEmpty) {
                m[row][col] = '+';
                col += 1;
            }
            if (row == 8) {
                end = true;
            }
            else {
                return;
            }
            escape(row, col);
        }


        System.out.print(downEmpty);

    }
}
