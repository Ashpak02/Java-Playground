import java.util.Scanner;
public class  Sum{
  public  static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    int num1=sc.nextInt();
    System.out.println("Enter the second number");
    int num2=sc.nextInt();

    int Result=0;
    Result=num1+num2;

    System.out.println("The addition of two numbers is "+Result);
  }
}