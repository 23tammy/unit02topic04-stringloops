public class StringLoops {

  public static String reverseCharacters(String a) {
    String newWord = "";
    for (int x = 1; x < a.length(); x++){
      String currentLetter = a.substring(a.length()-x, a.length()-(x-1));
      newWord = newWord + currentLetter; 
      System.out.println(newWord);
    }
    String lastletter = a.substring(0,1);  
    newWord = newWord + lastletter;
    System.out.println(newWord);
    return newWord;
  }

  public static void main(String[] args) {

    reverseCharacters("dalmation");

  }
}