package com.runtimeanalysis;



public class StringPerformance
{
    public static void main(String[] args)
    {
        int n = 10000;

        long s1 = System.nanoTime();
        String str = "";
        for (int i = 0; i < n; i++)
            str = str + i;   // O(N^2)
        long e1 = System.nanoTime();

        long s2 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++)
            sb.append(i);   // O(N)
        long e2 = System.nanoTime();

        long s3 = System.nanoTime();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < n; i++)
            sf.append(i);   // O(N)
        long e3 = System.nanoTime();

        System.out.println("String: " + (e1 - s1));
        System.out.println("StringBuilder: " + (e2 - s2));
        System.out.println("StringBuffer: " + (e3 - s3));
    }
}
