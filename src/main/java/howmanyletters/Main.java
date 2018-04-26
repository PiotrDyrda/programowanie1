package howmanyletters;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println(howManyLetters("esfaaAaaaaaasf"));
        System.out.println(howManyLettersInt("esfaaAaaaaaasf", 'a'));

    }

    public static Map<Character, Integer> howManyLetters(String word) {
        word = word.toLowerCase();
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (!result.containsKey(word.charAt(i))) {
                result.put(word.charAt(i), 1);
            } else {
                if (result.containsKey(word.charAt(i))) {
                    int x = result.get(word.charAt(i));
                    result.replace(word.charAt(i), x + 1);
                }
            }
        }
        return result;
    }

    public static Integer howManyLettersInt(String word, Character letter) {
        word = word.toLowerCase();
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                if (!result.containsKey(word.charAt(i))) {
                    result.put(word.charAt(i), 1);
                } else {
                    if (result.containsKey(word.charAt(i))) {
                        int x = result.get(word.charAt(i));
                        result.replace(word.charAt(i), x + 1);
                    }
                }
            }
        }
        return result.get(letter);
    }
}
