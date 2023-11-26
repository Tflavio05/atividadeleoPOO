package org.example;
//4.	 Imprima	os	fatoriais	de	1	a	10.


public class q04 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++){
            System.out.println("O Fatorial de "+i+" é igual a: "+calcularFatorial(i));


        }
    }

        public static int calcularFatorial ( int numero){
            int resultado = 1;
            for (int j = 1; j <= numero; j++) {
                resultado *= j;
            }
            return resultado;
        }
    }
