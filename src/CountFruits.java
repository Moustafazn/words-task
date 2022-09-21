import java.util.HashMap;

public class CountFruits {

  public static HashMap<Character, Integer>  getCharacterMap(){
    return new HashMap<>() {
      {
        put('A', 0);put('B', 0);put('C', 0);put('D', 0);
        put('E', 0);put('F', 0);put('G', 0);put('H', 0);
        put('I', 0);put('J', 0);put('K', 0);put('L', 0);
        put('M', 0);put('N', 0);put('O', 0);put('P', 0);
        put('Q', 0);put('R', 0);put('S', 0);put('T', 0);
        put('U', 0);put('V', 0);put('W', 0);put('X', 0);
        put('Y', 0);put('Z', 0);
      }};
  }

  public static HashMap<Character, Integer> getCharacterCount(String[] fruits ){
    HashMap<Character, Integer>  charCounts  = getCharacterMap();
    if(fruits==null || fruits.length==0) return charCounts;
    for (String word: fruits) {
      if (word != null && !word.isEmpty()) {
        char ch = Character.toUpperCase(word.charAt(0));
        if (charCounts.containsKey(ch)) charCounts.compute(ch, (k, v) -> v + 1);
      }
    }
    return charCounts;
  }

  public static void main(String[] args) {
    String[] fruits = {"Strawberry", "Mango", "Cherry", "Lime", "Guava",
            "Papaya", "Nectarine", "Pineapple", "Lemon", "Plum", "Tangerine", "Fig",
            "Blueberry", "Grape", "Jackfruit", "Pomegranate", "Apple", "Pear",
            "Orange", "Watermelon", "Raspberry", "Banana"};
    HashMap<Character, Integer> charCounts = getCharacterCount(fruits);
    charCounts.forEach((key, value) -> System.out.println(key + ": " + value));
  }
}