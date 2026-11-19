public class Interface{
  public static void main(String[] args){
    upiPayment upi=new upiPayment();
    upi.pay(10000);
    cardPayment card=new cardPayment();
    card.pay(2500);
  }
}

interface Payment {
  void pay(int amount);  
}

class upiPayment implements Payment{
  @Override
   public void pay(int amount){
    System.out.println("The "+amount + " received");
  }
}

class cardPayment implements Payment{
  
  @Override
  public void pay(int amount){
    System.out.println("The Rs."+amount+" Received");
  }
}