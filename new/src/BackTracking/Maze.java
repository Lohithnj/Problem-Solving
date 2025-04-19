package BackTracking;

public class Maze {
    public static void main(String[] args) {
        int[][] maze={
                {1,0,1},
                {1,0,1},
                {1,1,1}};
        int i=0,j=0;
        int n=maze.length;
        solve(0,0,"",maze,n);
    }
    public static void solve(int r,int c,String path,int[][] maze,int n){
        
    }

}
