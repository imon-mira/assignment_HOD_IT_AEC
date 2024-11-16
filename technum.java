import java.util.Scanner;
class Tech
{
  public boolean isTech(int num)
  {
     if(num<0)
     return false;
    int fl=0;
    int cpy=num,n=num,dig;
    while(cpy>0)
     {
       dig=cpy%10;
       cpy=cpy/10;
       fl++;
     }
   if(fl%2!=0)
      return false;
   String s=Integer.toString(num);
   int hl=s.length()/2;
   int f=Integer.parseInt(s.substring(0,hl));
   int l=Integer.parseInt(s.substring(hl));
   int sum=f+l;
   if((sum*sum)==num)
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
    Tech ob=new Tech();
    boolean f=ob.isTech(num);
    if(f==true)
      System.out.println("Tech Number");
    else
      System.out.println("Not a Tech Number");
  }
}
    
