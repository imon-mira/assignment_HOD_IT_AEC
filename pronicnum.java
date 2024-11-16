import java.util.Scanner;
class Pronic
{
  public boolean isPronic(int num)
  {
    if(num<0)
     return false;
    for(int i=0;i<=num/2;i++)
      {
     if(i*(i+1)==num)
      return true;
      } 
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
    Pronic ob=new Pronic();
    boolean f=ob.isPronic(num);
    if(f==true)
      System.out.println("Pronic Number");
    else
      System.out.println("Not a Pronic Number");
  }
}
    
