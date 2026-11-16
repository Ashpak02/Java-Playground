public class Staticc{
  public static void main(String[] args){
    Friend friend=new Friend("Ashpak");
    Friend friend2=new Friend("Abdul");
    Friend friend3=new Friend("Inamdar");

    System.out.println("Number of Friends we created | "+Friend.numOfFriends);
    //System.out.println("Number of Friends we created | "+friend2.numOfFriends);
  }
}
/*Non-static: Each object has its own separate copy of the variable. Changes made by one object do not affect another.

Static: All objects share a single copy of the variable. A change made by one object is visible to all other objects.*/
class Friend {

   static int numOfFriends;
  String name;


  Friend(String name){                           //create a constructor
    this.name=name;
    numOfFriends ++;
  }

}

