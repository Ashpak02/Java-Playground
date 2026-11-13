import java.util.Scanner;
public class ArrayI{
  public static void main(String[] args){
  
    System.out.println("Welcome to an Array:");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an Array :");
    int size=sc.nextInt();
    sc.nextLine();

    String Fruits[]=new String[size];

    System.out.println("Enter the elements in an array:");
    for(int i=0;i<size;i++){
      Fruits[i]=sc.nextLine();
    }

    System.out.println("The Array elements are:\n");
    for(int i=0;i<size;i++){
      System.out.println(" " +Fruits[i]);
    }
    sc.close();
  }

}
