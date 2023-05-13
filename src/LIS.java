import java.util.*;
public class LIS {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(lengthOfLIS(arr));
    }
    public static int lengthOfLIS(int[] nums) {
        // ArrayList<Integer> list=new ArrayList<>();
        int dp[][]=new int[nums.length][nums.length+1];
        for(int[] rows:dp)
            Arrays.fill(rows,-1);
        return length(nums,0,-1,dp);
    }
    public static int length(int[] nums,int i,int prev,int dp[][]){
        if(i==nums.length){
            return 0;
        }
        if(dp[i][prev+1]!=-1)return dp[i][prev+1];
        int a=length(nums,i+1,prev,dp);//not take
        int b=0;
        if(prev==-1 || nums[i]>nums[prev])
            b=1+length(nums,i+1,i,dp);//take
        return dp[i][prev+1]=Math.max(a,b);
    }
}