import java.util.Scanner;
class Bouncy 
{
  public boolean isBouncy(int num)
  {
   if(num<=99)
     return false;
   boolean isd=false;
   boolean isi=false;
   String n=Integer.toString(num);
   for(int i=1;i<n.length();i++)
      { 
        if(n.charAt(i)>n.charAt(i-1))
            isi=true;
        else 
            isd=true;
      }
    if(isi==true&&isd==true)
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
    Bouncy  ob=new Bouncy ();
    boolean f=ob.isBouncy (num);
    if(f==true)
      System.out.println("Bouncy Number");
    else
      System.out.println("Not a Bouncy Number");
  }
}
    
