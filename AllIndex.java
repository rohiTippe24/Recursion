public class AllIndex {
  
  static int[] ai (int[] arr , int idx , int n , int size) {
    if (idx == arr.length)
      return new int[size];
    if (arr[idx] == n) {
    int[] array = ai(arr , idx+1 , n , size+1);
    array[size] = idx;
    return array;
    } else {
      int[] array = ai(arr , idx+1 , n , size);
      return array;
    }
  }
  
  public static void main (String[] args) {
    
    int[] arr = {1 , 2 ,3 , 4 , 5 , 3 , 4 ,3 ,6 , 9 , 3};
    int[] array =  ai(arr , 0 , 3 , 0 );
    for (int i = 0 ; i < array.length ; i++)
      System.out.println(array[i]);
  }
}