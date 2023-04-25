 import java.util.*;
    public class ON_KNAPSACK {
        public static void main(String args[]) {
            // Your Code Here
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int w=sc.nextInt();
            int[] wt=new int[n];
            for(int i=0;i<n;i++)
                wt[i]=sc.nextInt();
            int[] val=new int[n];
            for(int i=0;i<n;i++)
                val[i]=sc.nextInt();
            System.out.println(knapSack(w,wt,val,n));
        }
        static int knapSack(int W, int wt[], int val[], int n)
        {
            // your code here
            int dp[][]=new int[n+1][W+1];
            for(int[] rows:dp)
                Arrays.fill(rows,-1);
            return total(wt,val,W,n-1,dp);
        }
        public static int total(int[] wt,int[] val,int W,int i,int[][] dp){
            if(i==0){
                if(wt[0]<=W)return val[0];
                else return 0;
            }
            if(dp[i][W]!=-1)return dp[i][W];
            int nottake=0+total(wt,val,W,i-1,dp);
            int take=0;
            if(wt[i]<=W){
                take=val[i]+total(wt,val,W-wt[i],i,dp);
            }
            return dp[i][W]=Math.max(take,nottake);
        }
    }
