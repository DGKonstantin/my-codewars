package NextBiggerNumberWithSameDigits;

import java.util.Arrays;

public class Kata {

    public static void main(String[] args) {
        System.out.println(nextBiggerNumber(999));
    }

    public static long nextBiggerNumber(long n) {
        char[] s = Long.toString(n).toCharArray();
        for (int i = s.length - 1; i > 0 ; i--) {
            if (s[i] > (s[i - 1])){
                int min = i;
                for (int j = i; j < s.length; j++)
                    min = s[j] > min && s[j] > s[i - 1] ? j : min;
                char loc = s[min];
                s[min] = s[i - 1];
                s[i - 1] = loc;
                Arrays.sort(s, i, s.length);
                String str = "";
                for (int j = 0; j < s.length; j++) str+=s[j];
                n = Long.parseLong(str);
                break;
            }
            n = -1;
        }
        return n;
    }
}
