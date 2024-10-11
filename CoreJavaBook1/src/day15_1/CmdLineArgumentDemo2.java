package day15_1;

public class CmdLineArgumentDemo2 
{
 public static void main(String[] args) 
 {
    int n1=Integer.parseInt(args[0]);
    int n2=Integer.parseInt(args[1]);
    int ans=n1+n2;
    System.out.println("Addition is:"+ans);

 }//end main
}//end class
