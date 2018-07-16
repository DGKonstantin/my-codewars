package AlphabeticAnagrams;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {

    public static void main(String[] args) {
        listPosition("bookkeeper");
    }

    static public BigInteger listPosition(String word) {
        char[] wordSorted = word.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int resilt = 0;
        Arrays.sort(wordSorted);
        String alpha = "";
        for (char ch : wordSorted) {
            if (map.containsKey(ch)){
                int loc = map.get(ch);
                map.remove(ch);
                map.put(ch, loc + 1);
            }else map.put(ch, 1);
            alpha += ch;
            System.out.print(ch);
        }
        System.out.println();
        for (char ch : map.keySet()) System.out.format("key: %c, value: %d\n", ch, map.get(ch));

        for (int i = 0; i < wordSorted.length; i++) {
            int j = 0;
            while (true){
                if (alpha.charAt(j) == word.charAt(i) && i <= j) break;
                j++;
            }
            System.out.println("j = " + j + " i = " + i);
            resilt += (Math.abs(i - j) * fac(word.length() - 1 - i));
            alpha = alpha.substring(0, i) + alpha.charAt(j) + alpha.substring(i, j) + alpha.substring(j + 1, alpha.length());
        }
        System.out.println(resilt);
        return BigInteger.ZERO;
    }

    static int fac(int n){
        if (n < 1) return 0;
        if (n == 1) return 1;
        return n * fac(n - 1);
    }
}
