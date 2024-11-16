import java.util.Scanner;
class Disarium
{
  public boolean isDisarium(int num)
  {
    if(num<0)
     return false;
    int f=0;
    int cpy=num,n=num,dig;
    double sum=0;
    while(cpy>0)
     {
       dig=cpy%10;
       cpy=cpy/10;
       f++;
     }
     while(n>0)
     {
       dig=n%10;
       n=n/10;
       sum=sum+Math.pow(dig,f);
       f--;
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
   Disarium ob=new Disarium();
    boolean f=ob.isDisarium(num);
    if(f==true)
      System.out.println("Disarium Number");
    else
      System.out.println("Not a Disarium Number");
  }
}
    
