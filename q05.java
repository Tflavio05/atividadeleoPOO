package org.example;
//5.	 No	código	do	exercício	anterior,	aumente	a	quantidade	de	números	que	terão	os	fatoriais	impressos
//até	20,	30	e	40.	Em	um	determinado	momento,	além	de	esse	cálculo	demorar,	começará	a	mostrar
//respostas	completamente	erradas.	Por	quê?
//Mude	de		int		para		long		a	fim	de	ver	alguma	mudança


public class q05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 40; i++) {
            System.out.println("Fatorial de " + i + " (int): " + calcularFatorialInt(i));
            System.out.println("Fatorial de " + i + " (long): " + calcularFatorialLong(i));
        }
    }

    public static int calcularFatorialInt(int numero) {
        int resultado = 1;
        for (int j = 1; j <= numero; j++) {
            resultado *= j;
        }
        return resultado;
    }

    public static long calcularFatorialLong(int numero) {
        long resultado = 1;
        for (int j = 1; j <= numero; j++) {
            resultado *= j;
        }
        return resultado;
    }
}