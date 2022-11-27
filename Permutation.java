import java.util.ArrayList;
public class Permutation {
  
  static ArrayList<String> permu (String str) {
    if (str.length() == 0) {
      ArrayList<String> rres = new ArrayList<String>();
      rres.add("");
      return rres;
  }
   ArrayList<String> rres = new ArrayList<>();
   ArrayList<String> res = new ArrayList<>();
   for (int i = 0 ; i < str.length() ; i++) {
     rres = permu(str.substring(0 , i) + str.substring(i+1));
     for (String string : rres) 
        res.add(str.charAt(i) + string);
   }
  return res;
  }
  
  public static void main (String[] args) {
    
    System.out.println(permu("ABCD"));
    
  }
}