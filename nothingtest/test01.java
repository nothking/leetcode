package nothingtest;

import java.util.*;

public class test01 {
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        test01 t = new test01();
        System.out.println(t.generate(25));
    }

    String generate(int n) {
        char[] tem = new char[52];
        int idx = 0;
        for (int i = 0; i < 26; i++) {
            tem[idx++] = (char) ('a' + i);
            tem[idx++] = (char) ('A' + i);
        }
        Random r = new Random();
        char[] result = new char[n];
        idx = 0;
        while (idx < n) {
            char c = tem[r.nextInt(51)];
            while (idx != 0 && c == result[idx - 1]) {
                c = tem[r.nextInt(51)];
            }
            result[idx++] = c;
        }
        return new String(result);
    }
}