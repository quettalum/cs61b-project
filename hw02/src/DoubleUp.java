public class DoubleUp {
   /**
     * Returns a new string where each character of the given string is repeated twice.
     * Example: doubleUp("hello") -> "hheelllloo"
     */
   public static String doubleUp(String s) {
      // TODO: Fill in this function
      String doubleS = "";
      for (int i = 0; i < s.length(); i++)
      {
         doubleS += s.charAt(i);
         doubleS += s.charAt(i);
      }
      return doubleS;
   }
   
   public static void main(String[] args) {
      String s = doubleUp("hello");
      System.out.println(s);
      
      System.out.println(doubleUp("cat"));
   }
}