// StringTemplatesDemo.java
// Demonstrating the STR and FMT string template processors.
import static java.util.FormatProcessor.FMT;

public class StringTemplatesDemo { 
   public static void main(String[] args) {
      String student = "Paul";
      int lastGrade = 87;
      double average = 85.489;
      
      // using STR template processor to insert values in a text block 
      System.out.println(
         STR."""
             Name: \{student}
             Last grade: \{lastGrade}
             Average: \{average}
             """);
      
      // using FMT template processor to format values in a string
      System.out.println(
         FMT."%-6s\{"Name"}%11s\{"Last Grade"}%10s\{"Average"}");
      System.out.println(
         FMT."%-6s\{student}%11d\{lastGrade}%10.2f\{average}");
   }
}