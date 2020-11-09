package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner( System.in );
        ArrayList<String> list = new ArrayList<String>();
        String str;
        while (true) {
            str = sc.nextLine();
            if (str.equals( "exit" )) {
                break;
            }
            list.add( str );
        }
        for (int i=0; i<list.size(); i++) {
            try {
                int n = Integer.parseInt (list.get( i ));
                if (n>0 & n<128) {
                    print( (short)n );
                } else  if (n>=128 || n<=0) {
                    print( n );
                }
            } catch (NumberFormatException e) {
                try {
                    Double num = Double.parseDouble(list.get( i ));
                     print( num );
                } catch (NumberFormatException k) {
                    print( list.get( i ) );
                }
            }
        }
        //напиште тут ваш код
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
