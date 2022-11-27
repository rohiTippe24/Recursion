public class Power {
  
  static int pow (int num , int n) {
    if (n == 0)
      return 1;
    return num * pow(num , n-1);
  }
  
  //  Reduse Time Complexity
  static double powd (double num , double n) {
    if (n == 0)
      return 1;
    double f = powd(num , n/2);
    double ans = f * f;
    if (n%2 == 1)
      ans *= num;
    return ans;
  }
  
  public static void main (String[] args) {
    
    System.out.println(pow(5 , 4));
    System.out.println(powd(5 , 4));
  }
}