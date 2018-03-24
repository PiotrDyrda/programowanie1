package scrable;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Character, Integer> lettersValue = new HashMap<Character, Integer>();
        String onePoint = "AEIOULNRST";
        String twoPoints = "DG";
        String threePoints = "BCMP";
        String fourPoints = "FHVWY";
        String fivePoints = "K";
        String eightPoints = "JX";
        String tenPoints = "QZ";
        for (int i = 0; i < onePoint.length(); i++) {
            lettersValue.put(onePoint.charAt(i), 1);
        }
        for (int i = 0; i < twoPoints.length(); i++) {
            lettersValue.put(twoPoints.charAt(i), 2);
        }
        for (int i = 0; i < threePoints.length(); i++) {
            lettersValue.put(threePoints.charAt(i), 3);
        }
        for (int i = 0; i < fourPoints.length(); i++) {
            lettersValue.put(fourPoints.charAt(i), 4);
        }
        for (int i = 0; i < fivePoints.length(); i++) {
            lettersValue.put(fivePoints.charAt(i), 5);
        }
        for (int i = 0; i < eightPoints.length(); i++) {
            lettersValue.put(eightPoints.charAt(i), 8);
        }
        for (int i = 0; i < tenPoints.length(); i++) {
            lettersValue.put(tenPoints.charAt(i), 10);
        }

        System.out.println(scrableScore(lettersValue,"CABBAGE"));

    }

    public static int scrableScore(Map<Character,Integer> values, String word) {
        Integer wynik = 0;
        for (int i = 0; i < word.length(); i++) {
            if(!values.containsKey(word.charAt(i))){
                throw new IllegalArgumentException("this is not a correct word");
            }
            wynik = wynik + values.get(word.charAt(i));
        }
        return wynik;
    }
}