public class StringLoops {

  public static String reverseCharacters(String a) {
    String newWord = "";
    for (int x = 1; x <= a.length(); x++){
      String currentLetter = a.substring(a.length()-x, a.length()-(x-1));
      newWord = newWord + currentLetter; 
    }
    return newWord;
  }
  public static void indexesOfAll(String text, String searchTerm) {
  int[] askjhdfakjsfh;
    for (int i = 0; i < text.length(); i++){
      if (text.substring(i, i+1).equals(searchTerm)){
        System.out.println(i);
        
      }
    } 
  
  }

  public static void main(String[] args) {
    System.out.println(reverseCharacters("sans"));
   indexesOfAll("marry poppins", "p");
  }
}