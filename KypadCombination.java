import java.util.ArrayList;
public class KypadCombination {
  
  static String[] keypad = {".'" , "abc" , "def"  , "hij"  , "klm" , "mnop" , "qrs" , "tu" , "wx" , "yz"};
  static ArrayList<String> keycomb (String str) {
    if (str.length() == 0) {
      ArrayList<String> rres = new ArrayList<>();
      rres.add("");
      return rres;
    }
    char ch = str.charAt(0);
    int idx = Integer.parseInt(String.valueOf(ch));
    String indexStr = keypad[idx];
    ArrayList<String> rres = keycomb(str.substring(1));
    ArrayList<String> res = new ArrayList<>();
    for (int i = 0 ; i < indexStr.length() ; i++) {
      for (String string : rres) 
        res.add(String.valueOf(indexStr.charAt(i)) + string);
    }
    return res;
  } 
  public static void main (String[] args) {
    System.out.println(keycomb("123"));
  }
}