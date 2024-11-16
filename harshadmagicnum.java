import java.util.Scanner;
class HarshadMagicNumber
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
    
    public boolean isHarshadMagicNumber(int num)
  {
     int cpy=num;
     if(num<=0)
        return false;
    while(num>9)
      {
         num=sumOfDigits(num);
      }
    if(cpy%sumOfDigits(cpy)==0&&num==1)
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
    HarshadMagicNumber ob=new HarshadMagicNumber();
    boolean f=ob.isHarshadMagicNumber(num);
    if(f==true)
      System.out.println("Harshad Magic Number");
    else
      System.out.println("Not a Harshad Magic Number");
  }
}
    
