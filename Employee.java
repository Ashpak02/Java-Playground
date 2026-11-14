public class Employee{
  public static void main(String[] args){
    EmployeeTest[] emp= new EmployeeTest[3];

    emp[0]=new EmployeeTest(1,"Ashpak",150000);
    emp[1]=new EmployeeTest(2,"Rushikesh",200000);
    emp[2]=new EmployeeTest(3,"Garuda",150000);
    int i;

    System.out.println("Employee Details are:\n");
    for(i=0;i<emp.length;i++){
      emp[i].displayDetails();
    }
  }
}


class EmployeeTest{
  int id;
  String name;
  double salary;

  EmployeeTest(int id,String name, double salary){
      this.id=id;
      this.name=name;
      this.salary=salary;
  }

  void displayDetails(){
    System.out.println("Employee id " +id+ "\nEmployee Name: "+name+"\nEmployee Salary:"+salary);
  }

}