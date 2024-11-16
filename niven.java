import java.util.Scanner;
class Niven 
{
  public boolean isNiven (int num)
  {
    if(num<0)
     return false;
    int sum=0,dig;
    int cpy=num;
    while(cpy>0)
     {
       dig=cpy%10;
       cpy=cpy/10;
       sum=sum+dig;
     
     }
    
    if(num%sum==0)
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
   Niven ob=new Niven();
    boolean f=ob.isNiven(num);
    if(f==true)
      System.out.println("Niven Number");
    else
      System.out.println("Not a Niven Number");
  }
}
    
