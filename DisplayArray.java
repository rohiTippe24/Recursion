public class DisplayArray {
  
  static void darr (int[] arr , int i) {
    if (i == arr.length) 
      return ;
    System.out.print(arr[i] + "  ");
    darr(arr , i+1);
  }
  
  public static void main (String[] args) {
    
    int[] arr = {10 , 20 , 30 , 40 , 50 , 60 , 70 , 80 , 90 , 100};
    darr(arr , 0);
  }
}