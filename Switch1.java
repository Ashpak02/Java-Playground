import java.util.Scanner;
public class Switch1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the Day");
    String Day=sc.next();

    switch(Day){
      case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("It is a weekday");

      case "Saturday","Sunday" -> System.out.println("It is Weekend haha");

     default -> System.out.println("Not valid Day...!  Check once again..!");
    
    }

    sc.close();
  }
}