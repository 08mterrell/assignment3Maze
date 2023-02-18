public class Maze {

    protected char[][] m;
    protected int height = 9;
    protected int width = 9;

    public Maze(char[][] m) {
        this.m = m;
    }

    public void escape(int row, int col) {
        int right = col + 1;
        int left = col - 1;
        int up = row - 1;
        int down = row + 1;

        boolean rightEmpty = true;
        boolean leftEmpty = true;
        boolean upEmpty = true;
        boolean downEmpty = true;

        if (down <= 8 && m[row][col] == '*') {
            downEmpty = false;
        }

        if (downEmpty) {
            m[row][col] = '+';
        }

        System.out.print(downEmpty);

    }
}
