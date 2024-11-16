import java.util.Scanner;
class Dudeney
{
  public boolean isDudeney(int num)
  {
   if(num<=0)
     return false;
    int sum=0,dig;
    int cpy=num;
    while(cpy>0)
     {
       dig=cpy%10;
       cpy=cpy/10;
       sum=sum+dig;
     }
    double cr=Math.cbrt(num);
    if((double)sum==cr)
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
    Dudeney ob=new Dudeney();
    boolean f=ob.isDudeney(num);
    if(f==true)
      System.out.println(" Dudeney Number");
    else
      System.out.println("Not a Dudeney Number");
  }
}
    
