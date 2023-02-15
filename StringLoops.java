public class StringLoops {

  public static String reverseCharacters(String a) {
    String newWord = "";
    for (int i = a.length(); i > 0; i--){
      newWord = a.substring(i-1, i);
    }
    return newWord;
  }

  public static void main(String[] args) {

    reverseCharacters("akld");

  }
}