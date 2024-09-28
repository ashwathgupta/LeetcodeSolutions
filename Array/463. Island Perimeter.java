class Solution {
    public int islandPerimeter(int[][] grid) {

        int count1=0;
        int rows= grid.length;
        int cols= grid[0].length;
        int res=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(grid[i][j]==1)
                {
                    if(i-1<0 || grid[i-1][j]==0) res++;       
                    if(j-1<0 || grid[i][j-1]==0) res++;
                    if(i+1==rows || grid[i+1][j]==0) res++;
                    if(j+1==cols || grid[i][j+1]==0) res++;


                }
            }
        }
        return res;        


    }
}
