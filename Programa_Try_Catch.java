package TratamentoDeExecoes_try_Catch;

import java.util.Scanner;

public class Programa_Try_Catch {
	
	/*
	public static void main(String[] args) {
		int numeros[] = new int [5];// 0...4 -> 0,1,2,3,4 -> n + 1
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 3 * 2;
		}
		
		for (int i = 0; i < numeros.length; i ++) {
			// Utilizamos o Try para tentar reutilizar algo; geralmente aquilo que pode acarretar em um problema.
			try { //Tente fazer isso
			System.out.println(numeros[i]);
			
			// Utilizamos o catch para capturar o erro e com isso oderecer ao usuário uma mensagem sm que o sistema quebre.
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Você está tentando acessar uma posição do Array que não existe");
			}
		
		}
	
		*/
	//******************************* SEGUNDO EXEMPLO *******************************
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("informe o primeiro número para divisão: ");
		int num1 = teclado.nextInt();
		
		System.out.println("informe o segundo número para divisão: ");
		int num2 = teclado.nextInt();
		
		try {
		System.out.println("A divisão de " + num1 + " por " + num2 + " é " + num1 / num2);		
		}catch(ArithmeticException e) {
			System.out.println("ATENÇÃO: Não posível dividir " + num1 + " por " + num2 + ".");
		
		// O finally é um complemento do try/catch e é sempre executado; independente de ter entrado no Catch.
		}finally {
			System.out.println("Continue o processo...");
		}
		
		
		teclado.close();
	}
	
	}





