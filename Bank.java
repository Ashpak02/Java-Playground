import java.util.Scanner;
public class Bank{
  public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    int choice=-1;

    double Balance=0.0;
    



    while(choice!=0){

        System.out.println("\nEnter your choice:");
        choice =sc.nextInt();

        System.out.println("***...Bank Menu...***:");
        System.out.println("1. Show Balance:");
        System.out.println("2. Deposit an Amount:");
        System.out.println("3. Withdraw an Amount:");
        System.out.println("0. Exit:");
        System.out.println("***...         ...***");

      switch(choice){
        case 1 -> showBalance(Balance);
        case 2 -> Balance= depositAmount(Balance);
        case 3 -> Balance = withdrawAmount(Balance);
        case 0 -> System.out.println("Exit");
        default -> System.out.println("\n Please enter valid choice");

      }
    
    }

  }

  static void showBalance(double Balance){
        System.out.println("Your Balance is "+Balance);  
  }

  static double depositAmount(double Balance){
    double deposit;
    System.out.println("Enter amount to deposit:");
    Scanner sc =new Scanner (System.in);
    deposit=sc.nextDouble();

    if(deposit>0){
      System.out.println("Your amount " + deposit + " is succesfully credited to the Account. ");
    }
    else{
      System.out.println("Please enter valid amount");
    }

    Balance = Balance + deposit;

    System.out.println ( "Now your Balance is " + Balance);

    return Balance;
  }

  static double withdrawAmount(double Balance){
    double amount;
    System.out.println("Enter an amount to withdraw");
    Scanner sc=new Scanner(System.in);
    amount=sc.nextDouble();
    if(amount>Balance){
      System.out.println("Please enter valid amount");

    }
    else{

    
      Balance = Balance - amount;
      System.out.println( amount+ " is successfully debited in your account");
      System.out.println("Now your balance is " +Balance);

    }
    return Balance;

  }

}

