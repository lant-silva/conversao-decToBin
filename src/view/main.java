package view;
import java.util.Scanner;
import controller.ConverteController;

public class main {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ConverteController c = new ConverteController();
		int valor = 0;
		System.out.println("Insira um valor decimal para ser convertido (Valor maximo = 1000)");
		do {
			valor = input.nextInt();
			if(valor>1000) {
				System.out.println("Insira um valor dentro do intervalo!");
			}
		}while(valor>1000);
		c.decToBin(valor);
		input.close();
	}
}
