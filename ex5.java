import java.util.Scanner;



public class ex5 {

	public static void main(String[] args) {
		int codigo,quantidade;
		int valorFinal;
		String produto;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscolha o produto: [1]Cachorro Quente - [2]X-Salada - [3]X-Bacon - [4]Bauru - [5]Refrigerante - [6]Suco de laranja");
		codigo = leia.nextInt();
		
		System.out.println("\nEscolha a quantidade do produto");
		quantidade = leia.nextInt();
		
		switch(codigo) {
		case 1:
			valorFinal = quantidade *10;
			produto = "Cachorro Quente" ;
			System.out.println("\n Seu produto: " + produto + "\n Valor Total: " + valorFinal);
			break;
			
		case 2:
			valorFinal = quantidade *15;
			produto = "X-Salada" ;
			System.out.println("\n Seu produto: " + produto + "\n Valor Total: " + valorFinal);
			break;
		case 3:
			valorFinal = quantidade *18;
			produto = "X-Bacon" ;
			System.out.println("\n Seu produto: " + produto + "\n Valor Total: " + valorFinal);
			break;
			
		case 4:
			valorFinal = quantidade *12;
			produto = "Bauru" ;
			System.out.println("\n Seu produto: " + produto + "\n Valor Total: " + valorFinal);
			break;
			
		case 5:
			valorFinal = quantidade *8;
			produto = "Refrigerante" ;
			System.out.println("\n Seu produto: " + produto + "\n Valor Total: " + valorFinal);
			break;
			
		case 6:
			valorFinal = quantidade *13;
			produto = "Suco De Laranja" ;
			System.out.println("\n Seu produto: " + produto + "\n Valor Total: " + valorFinal);
			break;
			
		default: 
			System.out.println("Produto inválido!");
			
			
			
		
		
		}
	}

}
