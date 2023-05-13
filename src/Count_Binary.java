import java.util.*;
public class Count_Binary {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            long n=sc.nextLong();
            long a=1,b=0;
            long s=0;
            for(long i=0;i<=n;i++){
                s=(a+b);
                b=a;
                a=s;
            }
            System.out.println(s);
        }
    }
}