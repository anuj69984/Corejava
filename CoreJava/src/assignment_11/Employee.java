package assignment_11;

/**
 * 
 * @author anuj6
 *
 */

public class Employee extends Object{
       String fullname;
       int ec_number;
       public Employee(String fullname,int ec_number)
       {
              this.fullname=fullname;
              this.ec_number=ec_number;
       }
       
       @Override
       public boolean equals(Object obj) {
              if(obj instanceof Employee)
              {
              Employee emp=(Employee)obj;
              if (this.fullname.equals(emp.fullname)&&(this.ec_number==emp.ec_number))
                     return true;
              else
                     return false;
              }
              else
                     return false;
       }
       @Override
       public int hashCode()
       {
              return ((int)Math.random()*10);
       }
       @Override
       public String toString() {
              return "Employee name "+this.fullname+" EC No: "+this.ec_number;
       }
       
}

class EmployeeMain {

       public static void main(String[] args) {
              // TODO Auto-generated method stub
              Employee employee1=new Employee("Anuj Kumar",55033924);
              Employee employee2=new Employee("Sapram",55033923);
              if(employee1.equals(employee2))
                     System.out.println("employee1 and employee2 are equal");
              else
                     System.out.println("employee1 and employee2 are not equal");
              
              Employee employee3=new Employee("Jeevan",55033890);
              System.out.println(employee3.hashCode());
              
              System.out.println(employee1.toString());
              System.out.println(employee2.toString());
              System.out.println(employee3.toString());

       }

}
