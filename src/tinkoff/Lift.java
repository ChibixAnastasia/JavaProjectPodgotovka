package tinkoff;

import java.lang.invoke.StringConcatFactory;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lift {
    public static void main(String[] args) {
        long start = System.nanoTime();
        Scanner scanner = new Scanner(System.in);
         int lastElement = scanner.nextInt() - 1;
         int time = scanner.nextInt();
         int[] mass = new int[lastElement + 1];
         for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
         }
         int mustGoElement = scanner.nextInt()-1;
         int result = 0;

         if(time <= mass[mustGoElement]) {
            if (mass[lastElement] - mass[mustGoElement] >= mass[mustGoElement] - mass[0]) {
                result = mass[mustGoElement] - mass[0];
                System.out.println(" second if do " + result);
            }else {
             result = mass[lastElement] - mass[mustGoElement];
                System.out.println("third if do " + result);
            }
         }
             result += mass[lastElement] - mass[0];

        System.out.println(result);
        long finish = System.nanoTime();
        long resTime = finish - start;
        System.out.println("время "  + resTime);

    }
}
