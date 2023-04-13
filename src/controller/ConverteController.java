package controller;
import model.Pilha;

public class ConverteController {

	public void decToBin(int decimal) {
		Pilha p = new Pilha();
		
		while((double)decimal>0) {
			p.push(decimal%2);
			decimal /= 2;
		}
		
		System.out.println("Valor convertido");
		while(!p.isEmpty()) {
			try {
				System.out.print(p.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
