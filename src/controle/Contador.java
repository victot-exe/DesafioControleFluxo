package controle;

import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		terminal.close();
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		
		if(parametroDois > parametroUm) {
			
			int contador = parametroDois - parametroUm;
			for(int i = 1; i <= contador; i++) {
				System.out.printf("Imprimindo o número %d \n", i);

			}
		}else {
			throw new ParametrosInvalidosException();
		}
	}
}
		
