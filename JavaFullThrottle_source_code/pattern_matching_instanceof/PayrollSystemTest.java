
public class PayrollSystemTest {
   public static void main(String[] args) {
      // create subclass objects                                          
      SalariedEmployee salariedEmployee =                                 
         new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);    
      HourlyEmployee hourlyEmployee =                                     
         new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);  

      System.out.println("Employees processed individually:");

      System.out.printf("%n%s%n%s: $%,.2f%n%n", 
         salariedEmployee, "earned", salariedEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         hourlyEmployee, "earned", hourlyEmployee.earnings());

      // create four-element Employee array
      Employee[] employees = new Employee[2]; 

      // initialize array with Employees        
      employees[0] = salariedEmployee;          
      employees[1] = hourlyEmployee;            

      System.out.printf("Employees processed polymorphically:%n%n");

      // generically process each element in array employees
      for (Employee currentEmployee : employees) {
         System.out.println(currentEmployee); // invokes toString

         /* 
            1. The variable name 'employee' after the type in the condition
               is scoped to the if statement. No need for a downcast anymore.
            2. Syntax could change. 
            3. More future language enhancements: https://openjdk.java.net/projects/amber/
         */
         // determine whether element is a SalariedEmployee
         if (currentEmployee instanceof SalariedEmployee employee) {
            // downcast Employee reference to SalariedEmployee reference
            //SalariedEmployee employee = (SalariedEmployee) currentEmployee;

            employee.setWeeklySalary(1.10 * employee.getWeeklySalary());

            System.out.printf("new base salary with 10%% increase is: $%,.2f%n",
               employee.getWeeklySalary());
         } 

         System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
      } 
   } 
} 


/**************************************************************************
 * (C) Copyright 1992-2023 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
