package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for (int i = 0;i < n;i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			genero[i] = sc.next().charAt(0);
		}
		
		double menorAltura = altura[0];
		double maiorAltura = altura[0];
		
		for (int i = 0;i < n;i++) {
			if(maiorAltura < altura[i]) {
				maiorAltura = altura[i];
			}
			if(menorAltura > altura[i]) {
				menorAltura = altura[i];
			}
		}
		
		System.out.println("Menor altura = " + menorAltura);
		System.out.println("Maior altura = " + maiorAltura);
		
		int countHomens = 0;
		int count = 0;
		double total = 0.0;
		for (int i = 0;i< n;i++) {
			if(genero[i] == 'f') {
				total = total + altura[i];
				count++;
			}
			else if(genero[i] == 'm') {
				countHomens++;
			}
		}
		
		double mediaAltF = total / count;
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAltF);
		
		System.out.println("Numero de homens = " + countHomens);
		
		
		sc.close();

	}

}
