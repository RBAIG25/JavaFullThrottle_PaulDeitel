// Fig. 7.3: InitArray.java
// Initializing the elements of an array with an array initializer.
import java.util.Arrays;

public class InitArray {
   public static void main(String[] args) {
      // initializer list specifies the initial value for each element
      int[] array = {32, 27, 64, 18, 95};         

      System.out.printf("%s%8s%n", "Index", "Value"); // column headings
   
      // output each array element's value 
      for (int counter = 0; counter < array.length; counter++) {
         System.out.printf("%5d%8d%n", counter, array[counter]);
      }
      
      System.out.printf("%nDisplay array with Arrays.toString: %s%n",
         Arrays.toString(array));
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
