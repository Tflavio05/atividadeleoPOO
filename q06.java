package org.example;
//6. Imprima	 os	 primeiros	 números	 da	 série	 de	 Fibonacci	 até	 passar	 de	 100.




public class q06 {
    public static void main(String[] args) {
        int limite = 100;
        int primeiro = 0, segundo = 1, proximo;

        System.out.println("Série de Fibonacci até passar de " + limite + ":");

        while (primeiro <= limite) {
            System.out.print(primeiro + ", ");

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
    }
}