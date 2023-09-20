public class PallindromeStr {
    public static void main (String[] args) {
       
        String str= "abac", nstr="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println("abac"); 
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        nstr= ch+nstr; 
      }
      System.out.println("Reversed word: "+ nstr);
    }
}
