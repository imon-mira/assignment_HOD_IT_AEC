import java.util.Scanner;
class Duck
{
  public boolean isDuck(int num)
  {
    if(num<0)
     return false;
    int flag=1,dig;
    int cpy=num;
    do
     {
       dig=cpy%10;
       cpy=cpy/10;
       if(cpy>0 && dig==0)
         {
           flag=0;
           break;
         }
     }while(cpy>0);
    if(flag==0)
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
    Duck ob=new Duck();
    boolean f=ob.isDuck(num);
    if(f==true)
      System.out.println("Duck Number");
    else
      System.out.println("Not a Duck Number");
  }
}
    
