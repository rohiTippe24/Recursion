
public class IncAndDec {
 
 static void iad (int n) {
   if (n == 0)
    return;
  System.out.print(n + "  ");
  iad(n-1);
  if (n == 1)
    System.out.println();
  System.out.print(n + "  ");
 } 
 
  public static void main (String[] args) {
    
    iad(5);
    
  }
}