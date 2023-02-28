package tinkoff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CutCake {
    private static int kolGests;
    private static int kolCuts = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        kolGests = scanner.nextInt();

        while (kolGests > 1) {
            if (kolGests % 2 == 1) {
                kolGests -= 1;
                kolCuts += 2;
                kolGests = kolGests / 2;
            } else {
                kolCuts += 1;
                kolGests = kolGests / 2;
            }
        }
        System.out.println(kolCuts);
    }

    int cutCake(int kolGests) {
        if (kolGests == 1) {
            return kolCuts;
        } else if (kolGests % 2 == 1) {
            kolGests -= 1;
            kolCuts += 2;
            return cutCake(kolGests / 2);
        } else {
            kolCuts += 1;
            return cutCake(kolGests / 2);
        }
    }
}