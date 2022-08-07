package leetcode.leet_52;

public class Solution {
    public  static int count=0;
    public static void getTotal(int row, int col, boolean[][] mark,int queeucount,int n)
    {
        System.out.println("dsfsfsgfdgdf");
        if(queeucount==n)
        {
            count++;
            return ;
        }
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                 int row1=row+i;
                 int col1=col+j;
                System.out.println("row1="+row1);
                System.out.println("col1="+col1);
                if(row1>=0&&row1<=n-1&&col1>=0&&col1<=n-1&&mark[row1][col1]==false)
                {
                    mark[row1][col1]=true;
                    getTotal(row1,col1,mark,queeucount++,n);
                    mark[row1][col1]=false;

                }
            }
        }


        return;
    }

    public static int totalNQueens(int n) {
        if (n == 0 || n == 1) return n;
        boolean[][] mark = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mark[i][j] = false;
            }
        }
        System.out.println("dsadsf");
        getTotal(0,0,mark,1,n);
        return count;
    }


    public static void main(String[] args) {
        int n = 4;
        System.out.println("ddd");
        int res = totalNQueens(n);
        System.out.println("n=" + res);
    }
}
