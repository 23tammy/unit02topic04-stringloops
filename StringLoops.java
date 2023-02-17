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
        int[] copy = new int[askjhdfakjsfh.length+1];
        for (int x = 0; x < askjhdfakjsfh.length; x++){
          copy[x] = askjhdfakjsfh[x];
        }
        copy[copy.length-1] = i;  
        askjhdfakjsfh = copy;
      }
    }
    return askjhdfakjsfh;
  }

  public static boolean hasRepeatedConsecutives(String a) {
    for (int i = 0; i < a.length()-1; i++){
      if (a.substring(i, i+1).equals(a.substring(i+1, i+2))){
        return true;
      }
    }
    return false;
  }

  public static String reverseWords(String sentence){
    String newSentence = "";
    String lastWord = "";
    int countWords = 0;
    for (char x : sentence.toCharArray()){
      if (x == ' '){
        countWords++;
      }
    }
    for (int i = 0; i < countWords; i++){
      lastWord = sentence.substring(sentence.lastIndexOf(" ")+1, sentence.length());
      newSentence = newSentence + lastWord + " ";
      sentence = sentence.substring(0, sentence.lastIndexOf(" "));
    } 
    lastWord = sentence.substring(sentence.lastIndexOf(" ")+1, sentence.length());
    newSentence = newSentence + lastWord + " ";
    return newSentence;
  }
  
  public static void main(String[] args) {
     System.out.println(reverseCharacters("sans"));
     System.out.println(Arrays.toString(indexesOfAll("the quick brown fox jumped over a lazy dog", "t")));
     System.out.println(hasRepeatedConsecutives("roll"));
     System.out.println(reverseWords("piccasso was actually a horrible person and should not be remembered and his art sucks"));
  }
}