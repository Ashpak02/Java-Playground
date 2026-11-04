import java.util.Scanner;
public class Method1 {
public static void main(String[] args){
  int k;
  System.out.println("Enter the term of the fibonacci");
  Scanner sc=new Scanner(System.in);
  k=sc.nextInt();
  fibonacci(k);

}

static void fibonacci(int k){
  int a=0;
  int b=1;
  int c; 
    System.out.print(" " +a+ " "+b);
      for(int i=0;i<k;i++){
      c=a+b;
      a=b;
      b=c;

      System.out.print(" " +c);
  }
  
}
}