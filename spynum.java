import java.util.Scanner;
class Spy
{
  public boolean isSpy(int num)
  {
   if(num<=0)
     return false;
    int sum=0,prod=1,dig;
    int cpy=num;
    while(cpy>0)
     {
       dig=cpy%10;
       cpy=cpy/10;
       sum=sum+dig;
       prod=prod*dig;
     }
    if(sum==prod)
      return true;
    else 
      return false;
  }
}
class Main
{
  static int num;
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    num=sc.nextInt();
    Spy ob=new Spy();
    boolean f=ob.isSpy(num);
    if(f==true)
      System.out.println("Spy Number");
    else
      System.out.println("Not a Spy Number");
  }
}
    
