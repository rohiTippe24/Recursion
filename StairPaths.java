import java.util.ArrayList;
public class StairPaths {
  
  static ArrayList<String> paths (int n) {
    if (n == 0) {
      ArrayList<String> rres = new ArrayList<>();
      rres.add("");
      return rres;
    }
    if (n < 0)
      return new ArrayList<String>();
    ArrayList<String> paths1 = paths(n-1);
    ArrayList<String> paths2 = paths(n-2);
    ArrayList<String> paths3 = paths(n-3);
    
    ArrayList<String> res = new ArrayList<>();
    for (String str : paths1)
      res.add(1 + str);
    for (String str : paths2)
      res.add(2 + str);
    for (String str : paths3)
      res.add(3 + str);
    return res;
  }
  public static void main (String[] args) {
    System.out.println(paths(5));
  }
}