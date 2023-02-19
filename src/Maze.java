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
        System.out.println(up);
        if (down <= 8) {
            if (Character.compare(m[down][col], '*')) {
                downEmpty = false;
            }
        }
        if (up >= 0 && m[up][col] == '*') {
            upEmpty = false;
        }
        if (left <= 7 && m[down][col] == '*') {
            leftEmpty = false;
        }
        if (down <= 7 && m[down][col] == '*') {
            downEmpty = false;
        }

        if (downEmpty) {
            m[down][col] = '+';
        }

        System.out.print(downEmpty);

    }
}
