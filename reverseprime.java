import java.util.*;
class Reverseprime
{
    static int N=200000;
    public static int prime[]=new int[N];
    public static void sieve()
    {
        for(int i=0;i<N;i++)
        {
            prime[i]=1;
        }
        prime[0]=0;
        prime[1]=0;
        for(int x=2;x*x<N;x++)
        {
            if(prime[x]==1)
            {
                for(int i=x*x;i<N;i+=x)
                {
                    prime[i]=0;
                }
            }
        }
    }
    public static void main(String args[]) 
    {
        int m,n;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        sieve();
        System.out.println("Prime numbers are : ");
        for(int i=n;i>=m;i--)
        {
           if(prime[i]==1)
           {
           System.out.print(i+" ");
           }
        } 
    }
}

output:

3 13
Prime numbers are : 
13 11 7 5 3 