package com.company;

public class Homework {
    public static void main(String[] args) {
        int m;
             for (int i=1; i<=80; i++)
        {
            int x;
            m=0;
            for (x=1; x<=i; x++) {
                if (i % x == 0) {
                    m = m + 1;
                }
            }
                if (m == 2) {
                    System.out.println(i);
                }
        }

    }
}

