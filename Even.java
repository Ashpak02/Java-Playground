import java.util.Scanner;
public class Even{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the Number");
    int num=sc.nextInt();

    String evenOrOdd=(num%2==0) ? "Even" : "Odd";

    System.out.printf("%s",evenOrOdd);

  }
}