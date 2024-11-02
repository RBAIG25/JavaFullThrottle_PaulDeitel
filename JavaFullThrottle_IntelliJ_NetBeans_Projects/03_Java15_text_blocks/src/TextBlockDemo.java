public class TextBlockDemo { 
   public static void main(String[] args) {
      /* 
         1. Opening """ must be followed by only whitespace and a line break.
         2. Compiler ignores whitespace to the left of the block.
         3. Great for embedding lengthy HTML/XML/SQL strings in code.
         4. If you need \n at end of last line, move closing """ to next line.
      */
      String block = """
                     This is 
                        a multiline
                        text block."""; 
              
      System.out.println("*******************");
      System.out.println(block);
      System.out.println("*******************");
   }
}
