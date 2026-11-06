import java.util.Scanner;
public class ArrayInput{
    public static void main(String[] args){

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the # of foods do you want: ");
      int size=sc.nextInt();
      sc.nextLine();

      String foods[]=new String[size];

      for(int i=0;i<foods.length;i++){
        System.out.print("Enter the foods: ");
        foods[i]=sc.nextLine();
      }
      System.out.println("Your list of foods is");
      for(int i=0;i<foods.length;i++){
        System.out.println(foods[i]);
        
      }
    }

}