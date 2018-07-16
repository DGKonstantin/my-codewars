package Regularexpressionforbinarynumbersdivisibleby5;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DivisibleByFive {

    public static void main(String[] args) {
        //Pattern p = Pattern.compile("(((11)*0*)*1*(01*0)*)*");
        //Pattern p = Pattern.compile("0+|1(10)*(11|0)(10*|(10*0(01)*(1|00))*)*");
        Pattern p = Pattern.compile("0+|(1(10)*(0|11)(01*0(01)*(1|00))*10*)*");
        Matcher matcher;
        int count = 0;
        for (int i = 5; i <= 5000; i+=5) {
            String s = Integer.toString(i, 2);
            matcher = p.matcher(s);
            if (matcher.matches()){
                //System.out.println(i);
                //break;
                count++;
            }
        }
        System.out.println(count);
        //System.out.println(Integer.parseInt("10110101", 2));;
    }
}
