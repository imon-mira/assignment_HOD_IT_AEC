import java.util.Scanner;
class Armstrong
{
  public boolean isArmstrong(int num)
  {
    int n=0;
    int cpy=num;
    while(cpy>0)
     {
       cpy=cpy/10;
       n++;
     }
    cpy=num;
    int dig,sum=0;
    while(cpy>0)
     {
       dig=cpy%10;
       cpy=cpy/10;
       sum=sum+(int)Math.pow(dig,n);
     }
    if(sum==num)
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
    Armstrong ob=new Armstrong();
    boolean f=ob.isArmstrong(num);
    if(f==true)
      System.out.println("Armstorng Number");
    else
      System.out.println("Not a Armstrong Number");
  }
}
    
