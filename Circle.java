import java.util.Scanner;
public class Circle{
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      double radius;
      double Area;
      double  circumference;
      double volume;

      System.out.println("Enter the Radius of a Circle");
      radius=sc.nextDouble();
      
      Area=Math.PI*Math.pow(radius,2);
      volume=(4/3) * Math.PI * Math.pow(radius,3);

      System.out.printf("The Area of circle is %.2f cm^2 and Volume is %.2f cm^3",Area ,volume);
  }
}