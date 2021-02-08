package ex1072;

import java.util.Scanner;

/*Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando essas informa��es.

Entrada
A primeira linha da entrada cont�m um valor inteiro N (N < 10000), que indica o n�mero de casos de teste.
Cada caso de teste a seguir � um valor inteiro X (-107 < X <107).
 

Sa�da
Para cada caso, imprima quantos n�meros est�o dentro (in) e quantos valores est�o fora (out) do intervalo.*/

public class Ex1072 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		int contOut = 0, contIn = 0;
		
		for (int i = 0; i < n; i++) {
			int x = kb.nextInt(); 
			if (x < 10 || x > 20) {
				contOut++;
			}else {
				contIn++;
			}
		}
		
		System.out.println(contIn + " in");
		System.out.println(contOut + " out");
		
		kb.close();
	}
}
