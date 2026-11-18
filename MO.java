public class MO{
  public static void main(String[] args){
    System.out.println("Lets learn method overriding and toString() method :");

    Dog dog = new Dog();
    Fish fish = new Fish();
    dog.move();
    fish.move();

    Bull bull=new Bull("Sarjya",25);
    System.out.println(bull);
  }
}

class Animal{
  void move(){
      System.out.println("This animal is running :");
  }
}

class Dog extends Animal {

}

class Fish extends Animal{
    @Override             //this annotation acts as a compiler level safety check.
    void move(){
      System.out.println("This Animal is swimming.");
    }
}

class Bull {
    String name;
    int age;

    Bull(String name,int age){
      this.name=name;
      this.age=age;
    }

    @Override 
    public String toString(){                //override toString method properly
      return "Bull name | "+name+ "\nBull Age | "+age;
    }
}