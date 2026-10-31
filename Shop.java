import java.util.Scanner;
public class Shop{
  public static void main(String[] args){
    //Shopping cart program

    String item;
    int quantity;
    double price;
    double total;

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter what item,you want to buy..?");
    item=sc.nextLine();
    System.out.println("Enter the price of an item");
    price=sc.nextDouble();
    System.out.println("Enter the number of items you want to buy");
    quantity=sc.nextInt();

    total=price*quantity;

    System.out.println("You have bought " +quantity+" " +item+ " and now you have to pay "+total+ " Rs");
  }
}