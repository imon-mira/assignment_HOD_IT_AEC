import java.util.Scanner;
class Neon
{
  public boolean isNeon(int num)
  {
    if(num<0)
     return false;
    int sum=0,dig;
    int sq=(int)Math.pow(num,2);
    int cpy=sq;
    while(cpy>0)
     {
       dig=cpy%10;
       cpy=cpy/10;
       sum=sum+dig;
       
     }
    if(sum==num)
      return true;
    else 
      return false;
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    Neon ob=new Neon();
    boolean f=ob.isNeon(num);
    if(f==true)
      System.out.println("Neon Number");
    else
      System.out.println("Not a Neon Number");
  }
}
    
