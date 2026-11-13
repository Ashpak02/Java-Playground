public class ArrayMax{
 public static void main(String[] args){
  System.out.println("Lets find the maximum number in an Array");

  int result=Array();
  System.out.println("The Mmaximum number in an Array is\n" +result);
  
  }

  static int Array(){
    int num[]={1,2,3,45,6,77,9,0,8,47};
    int max=num[0];
    for(int i=1;i<num.length;i++){
      if(num[i]>max){
        max=num[i];
      }
    }
    //System.out.println("the maximum number in an Array is " +max);
    return max;
  }
    
}