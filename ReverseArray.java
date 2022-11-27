public class ReverseArray {
  
  static void revArr (int[] arr , int idx) {
    if (idx == arr.length) 
      return;
    revArr(arr , idx+1);
    System.out.print( arr[idx] + "  ");
  }
  
  public static void main (String[] args) {
    
    int[] arr = {10 , 20 , 30 , 40 , 50 , 60 , 70 , 80 , 90 , 100};
    revArr(arr , 0);
    
  }
}