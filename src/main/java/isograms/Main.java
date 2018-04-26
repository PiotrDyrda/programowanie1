package isograms;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(isIsogram("Dz is aj"));

    }

    public static boolean isIsogram(String word) {
        HashSet<Character> seen = new HashSet<>();
        List<Character> sign = Arrays.asList(new Character[]{' ', '-'});
        List<Character> nubers = Arrays.asList(new Character[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'});
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (nubers.contains(word.charAt(i))) {
                throw new IllegalArgumentException("word contains number");
            }
            if (!seen.contains(word.charAt(i)) & !sign.contains(word.charAt(i))) {
                seen.add(word.charAt(i));
            } else if (seen.contains(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

