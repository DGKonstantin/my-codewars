package tvremote;

public class Dinglemouse {

    public static int tvRemote(final String word) {
        int result = 0;
        int x = 0, y = 0, idx = 0, x1 = 0, y1 = 0;
        String s = "abcde123fghij456klmno789pqrst.@0uvwxyz_/0";
        for (char ch : word.toCharArray()){
            idx = s.indexOf(ch);
            x1 = idx % 8;
            y1 = idx / 8;
            result += Math.abs(x - x1) + Math.abs(y - y1) + 1;
            x = x1;
            y = y1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(tvRemote("codewars"));
    }
}

/*
                        if (matrix.length - Math.max(x, i) + Math.min(x, i) > Math.abs(x - i)) {
                        }
                        else {
                            result += matrix.length - Math.max(x, i) + Math.min(x, i);
                            x = i;
                        }
                        if (matrix[0].length - Math.max(y, j) + Math.min(y, j) > Math.abs(y - j)) {
                        }
                        else {
                            result += matrix[0].length - Math.max(y, j) + Math.min(y, j);
                            y = j;
                        }
                         */
