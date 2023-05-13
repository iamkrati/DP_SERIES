import java.util.*;
public class Coin_Change {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(change(amount,arr));
    }
    public static int change(int amount, int[] coins) {
        int dp[][]=new int[coins.length][amount+1];
        for(int[] rows:dp)
            Arrays.fill(rows,-1);
        return mincoin(coins,amount,coins.length-1,dp);
        // if(x>=1000000007)return -1;
        // else return x;
    }
    public static int mincoin(int[] coins,int target,int i,int[][] dp){
        if(i==0){
            if(target%coins[i]==0)return 1;
            else return 0;
        }
        if(dp[i][target]!=-1)return dp[i][target];
        int take=0;
        if(coins[i]<=target)
        {
            take=mincoin(coins,target-coins[i],i,dp);
        }
        int nottake=mincoin(coins,target,i-1,dp);
        return dp[i][target]=take+nottake;
    }
}
