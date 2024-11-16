import java.util.Scanner;
class Buzz
{
  public boolean isBuzz(int num)
  {
    int dig=num%10;
    if(dig==7||dig==-7 || num%7==0)
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
    Buzz ob=new Buzz();
    boolean f=ob.isBuzz(num);
    if(f==true)
      System.out.println("Buzz Number");
    else
      System.out.println("Not a Buzz Number");
  }
}
    
