package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByBufferedReader {
    public static void main(String[] args) throws IOException {
        var begin = System.currentTimeMillis();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (reader.readLine() != null) {
            System.out.println(reader.readLine());
        }
        var end = System.currentTimeMillis() - begin;
        System.out.println("Чтение миллиона строк с помощью BufferedReader заняло: " + end + " мс");
    }
}

