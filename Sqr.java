# square
import java.io.*;
import java.util.*;
public class Sqr
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a1=sc.nextInt();
    int b1=sc.nextInt();
    int a2=sc.nextInt();
    int b2=sc.nextInt();
    int a3=sc.nextInt();
    int b3=sc.nextInt();
    int a4=sc.nextInt();
    int b4=sc.nextInt();
    if(a1==a2 && a3==b3 && a2==b4 && b2==a4)
    {
      System.out.println("Square");
    }
    else
    {
      System.out.println("Not Square");
    }
  }
}
