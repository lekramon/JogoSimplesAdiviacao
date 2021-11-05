import java.util.Random;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Random valor = new Random();

		int opcao, correto, absolutoMin, absolutoMax;		
		
		System.out.println("Tente adivinhar o n�mero aleat�rio de entre 1 e 100.");
		System.out.println("No total s�o 5 tentativas.");
		opcao = input.nextInt();
		
		correto = valor.nextInt(1 + 100);			
		absolutoMin = Math.abs(correto - 1);
		absolutoMax = Math.abs(correto + 1);
		
		for (int i =1; i<5;) {	
			
		if ((opcao == absolutoMin) | (opcao == absolutoMax)) {
				System.out.println("T� QUENTE!");
			}		
			
		else if (opcao < correto) {
			System.out.println("O valor digitado � menor do que o valor correto." );
			}
			
		else if (opcao > correto) {
			System.out.println("O valor digitado � maior do que o valor correto." );
			}
		
		if (opcao != correto) {
			System.out.println("Tente novamente! Tentativas restantes: " + (5-i));
			opcao = input.nextInt();
			i++;
		}		
		
		if (opcao == correto) {
		System.out.println("Parab�ns, voc� ganhou o jogo!");
		i = 5;
		
		}
		
		if ((opcao !=correto) & (i == 5)) {
			System.out.println("Game Over!");
			System.out.println("O n�mero era: " + correto);
		}	
				
		}
		
		input.close();
	}

}
