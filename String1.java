import java.util.Scanner;
public class String1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String mail;

mail="ashpakinamdar09@gmail.com";

String name="ASHPAK";

System.out.println("Uppercase string method  " +mail.toUpperCase());

System.out.println("Lowercase string Method "  +name.toLowerCase());

System.out.println("Concate two strings " +name.concat(mail));

System.out.println("Length of a string " +mail.length());

String mother="          Nayada   ";

System.out.println("Trim method "+mother.trim());

System.out.println("Check string is empty or not :-" +mother.isEmpty());

System.out.println("CharAt method of string :" +mail.charAt(5));

System.out.println("indexOf method " +mail.indexOf("@"));

System.out.println("Replace method of a String :" +name.replace("ASHPAK","ABDUL"));

//Substring method

System.out.println("Substring method " +mail.substring(0,mail.indexOf("@")));

}


}