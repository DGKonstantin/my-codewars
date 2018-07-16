package Interval;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Math {

    public static void main(String[] args) {
        for (int i : Interval(new int[]{1,9,4,5,3,6,2}, "(3,2]")) System.out.println(i);
    }

    public static int[] Interval(int[] arr, String str){
        if (arr.length == 0 || str.equals("")) return new int[]{};
        List list = new LinkedList();
        boolean left = str.charAt(0) == '[';
        boolean right = str.charAt(str.length() - 1) == ']';
        int L = Integer.parseInt(str.substring(1, str.length() - 1).split(",")[0]);
        int R = Integer.parseInt(str.substring(1, str.length() - 1).split(",")[1]);
        Arrays.sort(arr);
        if (L < R) {
            for (int i = 0; i < arr.length; i++)
                if ((left && arr[i] >= L) || (!left && arr[i] > L))
                    if ((right && arr[i] <= R) || (!right && arr[i] < R))
                        list.add(arr[i]);
        }
        else {
            for (int i = arr.length - 1; i >= 0; i--)
                if ((left && arr[i] <= L) || (!left && arr[i] < L))
                    if ((right && arr[i] >= R) || (!right && arr[i] > R))
                        list.add(arr[i]);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = (int)list.get(i);
        }
        return res;
    }
}
