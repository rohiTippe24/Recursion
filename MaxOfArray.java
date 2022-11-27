public class MaxOfArray {
  
  static int max (int arr[] , int idx) {
    if (idx == arr.length)
      return 0;
    return Math.max(max(arr , idx+1) , arr[idx]);
  }
  
  public static void main (String[] args) {
    
    int arr[] = {10 , 30 , 100 , 250 , 70 , 15 };
    System.out.println("Maximun Number in Array  :  " + max(arr , 0));
    
  }
}