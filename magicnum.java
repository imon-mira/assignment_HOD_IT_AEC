import java.util.Scanner;
class Magic
{
  public int sumOfDigits(int num)
   {
      int dig,sum=0;
       while(num>0)
        {
          dig=num%10;
          num=num/10;
          sum=sum+dig;
         }
       return sum;
   }
  public boolean isMagic(int num)
  {
     if(num<=0)
        return false;
    while(num>9)
      {
         num=sumOfDigits(num);
      }
   
    if(num==1)
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
    Magic ob=new Magic();
    boolean f=ob.isMagic(num);
    if(f==true)
      System.out.println("Magic Number");
    else
      System.out.println("Not a Magic Number");
  }
}
    
