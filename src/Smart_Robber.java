import java.util.*;
public class Smart_Robber {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            System.out.println(rob(arr));
        }
    }
    public  static long rob(int[] nums) {
        int index=0;
        long dp[]=new long[nums.length];
        Arrays.fill(dp,-1);
        long ans=find(index,nums,dp,0);
        return ans;
    }
    public static long find(int index,int[] nums,long[] dp,int y){
        // if(index==nums.length-1 && y==1)return 0;
        if(index==nums.length)return 0;
        if(index>nums.length)return 0;
        if(dp[index]!=-1)return dp[index];
        long f1=nums[index]+find(index+2,nums,dp,1);
        long f2=find(index+1,nums,dp,0);
        return dp[index]=Math.max(f1,f2);
        // }
    }
}