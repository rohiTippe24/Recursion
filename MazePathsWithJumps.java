import java.util.ArrayList;
public class MazePathsWithJumps {
  
  static ArrayList<String> paths(int row , int column) {
    if (row == 1 && column == 1) {
      ArrayList<String> rres = new ArrayList<>();
      rres.add("");
      return rres;
    }
    ArrayList<String> ver1 = new ArrayList<>();
    ArrayList<String> ver2 = new ArrayList<>();
    ArrayList<String> ver3 = new ArrayList<>();
    ArrayList<String> hor1 = new ArrayList<>();
    ArrayList<String> hor2 = new ArrayList<>();
    ArrayList<String> hor3 = new ArrayList<>();
    if (row > 1) {
      ver1 = paths(row-1 , column);
      ver2 = paths(row-2 , column);
      ver3 = paths(row-3 , column);
    }
    if (column > 1) {
      hor1 = paths(row , column-1);
      hor2 = paths(row , column-2);
      hor3 = paths(row , column-3);
    }
    ArrayList<String> res = new ArrayList<>();
    for (String str : ver1)
      res.add("V1" + str);
    for (String str : ver2)
      res.add("V2" + str);
    for (String str : ver3)
      res.add("V3" + str);
    for (String str : hor1)
      res.add("H1" + str);
    for (String str : hor2)
      res.add("H2" + str);
    for (String str : hor3)
      res.add("H3" + str);
    return res;
  }
  
  public static void main (String[] args) {
    
    System.out.println(paths(3 , 3));
    
  }
}