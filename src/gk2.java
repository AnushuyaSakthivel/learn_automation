public class gk2 {
    static public int calc(int num){
       int temp = num;
       int count=0;
       while(num>0){
           int rem = num%10;//4,
           //System.out.println(num ,rem);
           if (rem !=0 && temp%rem==0){
               //System.out.println(count);
               count++;
           }
           else{
               continue;
           }

           num=num/10;

       }
       return count;
    }

    public static void main(String[] args)
    {
        int n=124;
       System.out.println(calc(n));

    }
}
