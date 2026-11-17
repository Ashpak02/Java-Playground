public class Inherit{
  public static void main(String[] args){
    System.out.println("Lets learn Inheritance and super keyword:\n");

    //Person person=new Person("Ashpak","Inamdar");
    //Student student = new Student("Ankit","Namo",24);
    Fees fees= new Fees("Ashpak","Inamdar",26,58000);
    fees.showFees();

  }

}

class Person{
  String first;
  String last;

  Person(String first,String last){       //constructor
    this.first=first;                     
    this.last=last;

    System.out.println("Person name is "+first+ " "+last);
  }
}

class Student extends Person{
    float age;
    Student(String first,String last,float age){
      super(first,last);
      this.age=age;
      System.out.println("Name : "+first+" "+last+"\nAge : "+age);
    }

}

class Fees extends Student{
  double fee;

  Fees(String first,String last,float age,double fee){
    super(first,last,age);
    this.fee=fee;
  }

  void showFees(){
    System.out.println("\nFees: "+this.fee);
  }
}