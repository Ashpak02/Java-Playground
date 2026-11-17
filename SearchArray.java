import java.util.Scanner;
public class SearchArray{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String target;
    System.out.println("Enter the object to find :");
    target=sc.nextLine();

    String[] cloths={"Shirt","Pant","Trouser","Chaddi"};
    for(int i=0;i<cloths.length;i++){
    if(target.equals(cloths[i])){
      System.out.println( target + "found at " + i +"th position ");
    }
    }

  }
}