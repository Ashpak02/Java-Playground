import java.util.*;
public class NumberGuess{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int guess = (int) (Math.random()*10);
    int num;
      do{
        System.out.println("Guess any Number..");
        num=sc.nextInt();

        if(num>guess){
          System.out.println("The Number is too high");
        }
        else if (num<guess){
          System.out.println("The is too Low");
        }
        else{
          System.out.println("The number is Correct..! Congratulations");
        }
      
      }while(num!=guess);

    
      sc.close();
  }
}