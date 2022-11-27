public class DoubleCall {
  
  static void dc (int n) {
    if (n <= 0) 
      return;
    System.out.println("pre : " + n);
    dc(n-1);
    System.out.println("in : " + n);
    dc(n-2);
    System.out.println("post : " + n);
  }
  
  public static void main (String[] args) {
    
    dc(3);
    
  }
}