public class LastOccur {
  
  static int lo (int[] arr , int idx , int n) {
    if (idx == arr.length) {
      return -1;
    }
    int a = lo(arr , idx+1 , n);
    if (n == arr[idx] && a == -1) {
      return idx;
    } else {
      return a;
    }
  }
  
  public static void main (String[] args) {
    
    int arr[] = { 1 , 3 , 5 , 6 , 4 , 4 , 4 , 6 };
    System.out.println(lo(arr , 0 , 4));
    
  }
}