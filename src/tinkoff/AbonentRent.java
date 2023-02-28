package tinkoff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AbonentRent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
//        List<String> list = new ArrayList<>();
//        Pattern pat = Pattern.compile("(\\d+)(\\s)(\\d+)(\\s)(\\d+)(\\s)(\\d+)");
//        Matcher matcher = pat.matcher(str);
//        while (matcher.find()){
//            list.add(matcher.group(1));
//            list.add(matcher.group(3));
//            list.add(matcher.group(5));
//            list.add(matcher.group(7));
//        }
//        System.out.println(list);
//        int sumInMonth = Integer.parseInt(list.get(0));
//        int kolMB = Integer.parseInt(list.get(1));
//        int kolUseMB = Integer.parseInt(list.get(2));
//        int priseFor1MB = Integer.parseInt(list.get(3));

        String[] array = str.split("\\s");
        int sumInMonth = Integer.parseInt(array[0]);
        int kolMB = Integer.parseInt(array[1]);
        int kolUseMB = Integer.parseInt(array[2]);
        int priseFor1MB = Integer.parseInt(array[3]);

        if(kolUseMB > kolMB) {
            double res = sumInMonth + ((kolUseMB - kolMB) * priseFor1MB);
            System.out.println(res);
        } else {
            System.out.println(sumInMonth);
        }
    }
}
