package org.example;

import java.util.Scanner;

public class ByScanner {
    public static void main(String[] args) {
        var begin = System.currentTimeMillis();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            System.out.println(s.nextLine());
        }
        var end = System.currentTimeMillis() - begin;
        System.out.println("Чтение миллиона строк с помощью Scanner заняло: " + end + " мс");
    }
}
