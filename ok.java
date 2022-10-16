

public class ok {
    

    public static void main(String[] args) {
        int ar[]={2,3,4,8,5};
        int s=11;
        int n=ar.length;
        boolean dp[][]=new boolean[n+1][s+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=s;j++)
            {
                if(j==0)
                {
                    dp[i][j]=true;
                }
                else if(i==0)
                {
                    dp[i][j]=false;
                }
                else{
                    if(ar[i-1]<=j)
                    {
                        dp[i][j]=dp[i-1][j-ar[i-1]] || dp[i-1][j];
                    }
                    else{
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }
        System.out.print(dp[n][s]);
    }

}
