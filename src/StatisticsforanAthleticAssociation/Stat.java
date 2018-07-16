package StatisticsforanAthleticAssociation;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Stat {

    public static void main(String[] args) {
        System.out.println(stat("02|15|59, 2|47|16, 02|17|20, 2|32|34, 2|17|17, 2|22|00, 2|22|70, 2|31|41"));
    }

    public static String stat(String strg) {
        if (strg.equals("")) return "";
        String[] strings = strg.split(",");
        int[] results = new int[strings.length];
        int range = 0,  average = 0, middle = 0;
        for (int i = 0; i < strings.length; i++){
            DateFormat sdf = new SimpleDateFormat("hh|mm|ss");
            Date date = null;
            try { date = sdf.parse(strings[i].trim());}
            catch (ParseException e) { e.printStackTrace(); }
            //System.out.println(date);
            results[i] = date.getSeconds() + date.getMinutes() * 60 + date.getHours() * 3600 + (date.getDate() - 1) * 60 * 60 * 24;
            //System.out.format("day: %d, hours: %d, min: %d, secs: %d\n", date.getDate(), date.getHours(), date.getMinutes(), date.getSeconds());
            average += results[i];
        }
        Arrays.sort(results);
        range = - results[0] + results[results.length - 1];
        average = average / results.length;
        middle  = results.length %2 == 0 ? (results[results.length / 2] + results[results.length / 2 - 1]) / 2 : results[results.length / 2];
        return String.format("Range: %02d|%02d|%02d Average: %02d|%02d|%02d Median: %02d|%02d|%02d",
                getHours(range), getMinutes(range), getSeconds(range),
                getHours(average), getMinutes(average), getSeconds(average),
                getHours(middle), getMinutes(middle), getSeconds(middle));
    }
    private static int getHours(int seconds){
        return seconds / 3600;
    }
    private static int getMinutes(int seconds){
        return (seconds % 3600) / 60;
    }
    private static int getSeconds(int seconds){
        return seconds % 60;
    }
}
