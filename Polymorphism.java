public class Polymorphism
{

    public static void main(String[] args)
    {
    
      Animal[] animals=new Animal[2];
      animals[0]=new Cat();
      animals[1]=new Dog();


      for(Animal animal : animals)
      {
        animal.eat();       //here we achieved Polymorphism
      }
      
    

    }


}

abstract class Animal
{
    abstract void eat();

}

class Cat extends Animal
{
  @Override
  void eat()
  {
    System.out.println("Cat drinks milk.");
  }
}

class Dog extends Animal
{
  @Override
  void eat()
  {
    System.out.println("Dog eats chicken.");
  }
}