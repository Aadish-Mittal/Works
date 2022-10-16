

public class dp2 {
    

    public static void main(String[] args) {
        int dif=3;
        int sum=0;
        int[] a={1,1,2,3};
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        dif=sum-dif;
        int[][] dp=new int[n+1][dif+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=dif;j++)
            {
                if(j==0)
                {
                    dp[i][j]=1;
                }
                else if(i==0){
                    dp[i][j]=0;
                }
                else{
                    if(a[i-1]<=j){
                        dp[i][j]=dp[i-1][j-a[i-1]] + dp[i-1][j];
                    }
                    else{
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }
        System.out.println(dp[n][dif]);
    }

}
