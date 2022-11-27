public class TowerOfHonai {
  
  static void toh (int n , char tower1 , char tower2 , char tower3) {
    if (n == 0) 
      return;
    toh(n-1 , tower1 , tower3 , tower2);
    System.out.println(" Move " + n + " From " + tower1 + " to " + tower2);
    toh(n-1 , tower3 , tower2 , tower1);
  }
  
  public static void main (String[] args) {
    
    toh(3 , 'A' , 'B' , 'C');
    
  }
}