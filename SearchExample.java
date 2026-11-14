import java.util.Scanner;
public class SearchExample{
  public static void main(String[] args){
    Example ex=new Example();
    //System.out.println(" "+ ex.num + " | ");
    ex.show();
  }  
  
}

 class Example{
  void show(){
  int numbers[]={1,2,3,5,7,8,9} ;
  Scanner sc=new Scanner(System.in);
  int search;
  int count=0;
  int i;
  System.out.println("Enter the number to search");
  search=sc.nextInt();

  for( i=0;i<numbers.length;i++){
    if(numbers[i]==search){
      count ++;
      System.out.println("Number is found at " + (i+1) + " position");
    }
  }
    if(count==0){
      System.out.println("Number is not found ");
    }
  
  }

}