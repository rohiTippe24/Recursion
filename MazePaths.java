import java.util.*;
public class MazePaths {
  
  static ArrayList<String> mp (int row , int column) {
    if (row == 1 && column == 1) {
      ArrayList<String> rres = new ArrayList<>();
      rres.add("");
      return rres;
    }
   ArrayList<String>  hor = new ArrayList<>() , ver = new ArrayList<>();
    if (column > 1)
      hor = mp(row , column-1);
    if (row > 1)
      ver = mp(row-1 , column);
    ArrayList<String> res = new ArrayList<>();
    for (String str : hor)
      res.add("H" + str);
    for (String str : ver)
      res.add("V" + str);
      
    return res;
  }
  
  public static void main (String[] args) {
    
    System.out.println(mp(3 , 3));
    
  }
}