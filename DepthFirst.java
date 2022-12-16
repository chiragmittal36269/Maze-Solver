import java.util.List;

public class DepthFirst {
    public static boolean searchpath(int[][] maze, int x, int y, List<Integer> path)
    {
        if(maze[y][x] == 9) {
            path.add(x);
            path.add(y);
            return true;
        }
        if(maze[y][x] == 0)
        {
            maze[y][x] = 2; // for marking, it visited on that block

            // for upward direction like x denotes rows so -1 means upwards
            // but column is fixed because of 0
            int dx = -1;
            int dy = 0;
            if(searchpath(maze, x+dx, y+dy, path))
            {
                path.add(x);
                path.add(y);
                return true;
            }
            // for downward direction so +1 means downwards
            // but column is fixed because of 0
            dx = 1;
            dy = 0;
            if(searchpath(maze, x+dx, y+dy, path))
            {
                path.add(x);
                path.add(y);
                return true;
            }
            // for leftward direction like y denotes columns so -1 means leftward
            // but row is fixed because of 0
            dx = 0;
            dy = -1;
            if(searchpath(maze, x+dx, y+dy, path))
            {
                path.add(x);
                path.add(y);
                return true;
            }
            // for rightward direction so +1 means leftward
            // but row is fixed because of 0
            dx = 0;
            dy = 1;
            if(searchpath(maze, x+dx, y+dy, path))
            {
                path.add(x);
                path.add(y);
                return true;
            }

        }
        return false;
    }
}
