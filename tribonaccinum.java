import java.util.Scanner;
class Tribonacci
{
  public boolean isTribonacci(int num)
  {
     if(num==0||num==1)
        return true;
    int a=0,b=1,c=1;
    while(c<num)
      {
         int d=a+b+c;
          a=b;
          b=c;
          c=d;
      }
    if(num==c)
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
    Tribonacci ob=new Tribonacci();
    boolean f=ob.isTribonacci(num);
    if(f==true)
      System.out.println("Tribonacci Number");
    else
      System.out.println("Not a Tribonacci Number");
  }
}
    
