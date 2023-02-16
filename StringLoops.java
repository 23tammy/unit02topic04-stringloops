public class StringLoops {

  public static String reverseCharacters(String a) {
    String newWord = "";
    for (int i = a.length()-1; i >= 0; i--){
      String currentLetter = a.substring(a.length()-1, a.length());
      newWord = newWord + currentLetter; 
      System.out.println(newWord);
    }
    return newWord;
  }

  public static void main(String[] args) {

    reverseCharacters("akldfhcxxkjyt");

  }
}