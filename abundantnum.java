import java.util.Scanner;
class Abundant
{
  public boolean isAbundant(int num)
  {
    if(num<0)
     return false;
    int sum=0;
    for(int i=1;i<=num/2;i++)
       {
         if(num %i==0)
            sum=sum+i;
       }
    if(sum>num)
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
    Abundant ob=new Abundant();
    boolean f=ob.isAbundant(num);
    if(f==true)
      System.out.println("Abundant Number");
    else
      System.out.println("Not a Abundant Number");
  }
}
    
