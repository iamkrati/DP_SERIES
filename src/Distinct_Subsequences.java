import java.util.*;
public class Distinct_Subsequences{
    public static void main(String[] args) {
        Scanner cin =  new Scanner(System.in);

        int test = cin.nextInt();
        cin.nextLine();

        for(int i=0;i<test;i++){
            String s = cin.nextLine();
            String t = cin.nextLine();

            System.out.println(distinctSubsequence(s, t));
        }
    }
    public static long numDistinct(String s, String t)
    {
        long[][] dp=new long[s.length()][t.length()];
        for(long[] d:dp)
            Arrays.fill(d,-1);
        return distinct(s,t,0,0,dp);
    }
    public static long distinct(String s,String t,int i ,int j,long[][] dp)
    {
        if(j==t.length())return (long)1;
        if(i==s.length())return (long)0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(s.charAt(i)==t.charAt(j))
        {
            return dp[i][j]=distinct(s,t,i+1,j+1,dp)+distinct(s,t,i+1,j,dp);
        }
        return dp[i][j]=distinct(s,t,i+1,j,dp);
    }

    public static long distinctSubsequence(String s, String t) {
// Write Code here
        return numDistinct(s,t);
    }

}