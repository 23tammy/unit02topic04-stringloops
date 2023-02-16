import java.util.Arrays;

public class StringLoops {

  public static String reverseCharacters(String a) {
    String newWord = "";
    for (int x = 1; x <= a.length(); x++){
      String currentLetter = a.substring(a.length()-x, a.length()-(x-1));
      newWord = newWord + currentLetter; 
    }
    return newWord;
  }
  public static int[] indexesOfAll(String text, String searchTerm) {
  int[] askjhdfakjsfh = new int[0];
    for (int i = 0; i < text.length(); i++){
      if (text.substring(i, i+1).equals(searchTerm)){
        System.out.println(i);
        int[] copy = new int[askjhdfakjsfh.length+1];
        for (int x = 0; x < askjhdfakjsfh.length; x++){
          copy[x] = askjhdfakjsfh[x];
          copy[copy.length-1] = i;
        }
          
      }
    }return askjhdfakjsfh;
  }

  public static void main(String[] args) {
    System.out.println(reverseCharacters("sans"));
   System.out.println(Arrays.toString(indexesOfAll("attack", "t")));
  }
}