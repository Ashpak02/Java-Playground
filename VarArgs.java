public class VarArgs{
  public static void main(String[] args){
     System.out.println(sum(1,2));
     System.out.println(sum(1,2,3,4,5,6,7,8));
  }

  static int sum(int... numbers){
    int sum=0;
    for(int num:numbers){
      sum=sum + num;
    }

    return sum;
  }
}