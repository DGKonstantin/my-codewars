package CountingRectangleTriangles;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public static void main (String[] args) {
        Point arr[] = {new Point( 3,  -1), new Point( 1, -2), new Point( 3,  3), new Point(3,2)};
        int r = 3;
        System.out.println(countRectTriang(arr));
    }


    public static int countRectTriang(Point[] points) {
        HashMap<String, Point[]> map = new HashMap<>();
        for (Point p1 : points) {
            for (Point p2 : points){
                for(Point p3 : points){
                    if ((p1.x == p2.x && p1.y == p2.y) || (p1.x == p3.x && p1.y == p3.y) || (p3.x == p2.x && p3.y == p2.y)) continue;
                    String[] strings = new String[]{"" + p1.x + p1.y, "" + p2.x + p2.y, "" + p3.x + p3.y};
                    String res = "";
                    Arrays.sort(strings);
                    for (String s : strings) res += s;
                    if (!map.containsKey(res)) map.put(res, new Point[]{p1, p2, p3});
                }
            }
        }
        int result = 0;
        for (String s : map.keySet()){
            int[] v1 = new int[]{map.get(s)[0].x - map.get(s)[1].x, map.get(s)[0].y - map.get(s)[1].y};
            int[] v2 = new int[]{map.get(s)[1].x - map.get(s)[2].x, map.get(s)[1].y - map.get(s)[2].y};
            int[] v3 = new int[]{map.get(s)[2].x - map.get(s)[0].x, map.get(s)[2].y - map.get(s)[0].y};
            if (v1[0] * v2[0] + v1[1] * v2[1] == 0 ||
                    v3[0] * v2[0] + v3[1] * v2[1] == 0 ||
                    v1[0] * v3[0] + v1[1] * v3[1] == 0)
                result++;
        }
        return result;
    }
}
