import java.util.*;

public class Solution {

    static int groupCount (int pos,int prsum,int len,String s)

    {

        System.out.println("start pos :"+pos);

        System.out.println("start prsm :"+prsum);



        int res=0,sum=0;

        if(pos==len)

            return 1;

        for(int i=pos;i<len;i++)

        {

            System.out.print("pos for :"+pos);

            sum+=(s.charAt(i)-'0');

            System.out.println("sum :"+sum);

            if(sum>=prsum)

            {

                res+=groupCount(i+1,sum,len,s);

                System.out.println("res :"+res);

            }

        }

        return res;





    }



    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc=new Scanner(System.in);

        String s=sc.next();

        int len=s.length();

        int pos=0,prsum=0;



        //System.out.println(groupCount(pos,prsum,len,s));



        groupCount(pos,prsum,len,s);

    }

}