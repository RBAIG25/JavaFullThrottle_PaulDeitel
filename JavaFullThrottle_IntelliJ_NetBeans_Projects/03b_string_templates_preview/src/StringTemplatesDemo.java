// Java 21 preview: StringTemplate, FormatProcessor
// StringTemplate is in java.util
import static java.util.FormatProcessor.FMT;

public class StringTemplatesDemo { 
   public static void main(String[] args) {
      String student = "Paul";
      int grade = 87;
      double average = 85.489;
      
      // STR string template processor is in class 
      // java.lang.StringTemplate and implicitly imported 
      System.out.println(STR."\{student} \{grade} \{average}\n");
      
      // java.util.FormatProcessor.FMT must be imported
      System.out.println(
        FMT."%-6s\{"Name"}%10s\{"Last Grade"}%10s\{"Average"}");
      System.out.println(
        FMT."%-6s\{student}%10d\{grade}%10.2f\{average}");
   }
}
