public class FirstOccur {
  
  static int fo (int[] arr , int idx , int n) {
    if (idx == arr.length)
      return -1;
    if (arr[idx] == n)
      return idx;
    return fo(arr , idx+1 , n);
  }
  
  public static void main (String[] args) {
    
    int arr[] = {1 , 2, 4 , 10 , 40 , 4 , 10};
    System.out.println(fo(arr , 0 , 10));
    
  }
}