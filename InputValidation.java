import java.util.Scanner;
public class InputValidation{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=0;
    while(num<=0 || num>10){
      System.out.println(" Number must be in 1 to 10 range");
      System.out.println("Enter the Number");
      num=sc.nextInt();
    }

    System.out.println("You entered " + num + "..!");
  }
}