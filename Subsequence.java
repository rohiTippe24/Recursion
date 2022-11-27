import java.util.ArrayList;
public class Subsequence {
  
  static ArrayList<String> subsequence (String str) {
    if (str.length() == 0) {
      ArrayList<String> rres = new ArrayList<>();
      rres.add("");
      return rres;
    }
    char ch = str.charAt(0);
    ArrayList<String> rres = subsequence(str.substring(1));
    ArrayList<String> res = new ArrayList<>();
    for (String string : rres) {
      res.add("" + string);
      res.add(ch + string);
    }
    if (str.length() == 3) {
      res.remove(0);
    }
    return res;
  }
  
  public static void main (String[] args) {
    
    System.out.println(subsequence("ABC"));
    
  }
}