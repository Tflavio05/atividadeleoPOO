package org.example;
//3.	 Imprima	todos	os	múltiplos	de	3,	entre	1	e	100.

public class q03 {
    public static void main(String[] args) {
        int n = 3, i;
        for (i = 1; i < 100000; i++) {
            int x = n * i;
            if (x <= 100) {
                System.out.println(x);
            } else {
                break;
            }

        }
    }
}

