import java.util.*;
public class Freinds_Pairing {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0)
        {
            long n=sc.nextLong();
            System.out.println(print(n));
        }
    }
    public static long print(long n)
    {
        if(n<=2)return n;
        return print(n-1)+(n-1)*print(n-2);
    }
}