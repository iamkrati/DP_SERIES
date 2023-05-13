import java.util.*;
public class Climbing_Stairs {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int ways=npath(n,dp);
        return ways;
    }
    public static int npath(int n,int[] dp){
        if(n==1 || n==0){
            return 1;
        }
        if(dp[n]!=-1)return dp[n];
        return dp[n]=npath(n-1,dp)+npath(n-2,dp);
    }
}