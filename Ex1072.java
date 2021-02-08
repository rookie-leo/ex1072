package ex1072;

import java.util.Scanner;

/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.

Entrada
A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 

Saída
Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.*/

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
