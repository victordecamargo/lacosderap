import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		String nome; 
		int idade;
		boolean PrimeiraDoacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite seu nome completo: ");
		nome = leia.nextLine();
		
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("\nDigite [1] para primeira doação Digite [2]");
		PrimeiraDoacao = leia.nextBoolean();
		
		
		
		if(idade >= 18 && idade  <= 69 ) {
			System.out.println("\nApto");
			
		
		}else if(idade < 18) {
			System.out.println("\nNão Apto");
			
		}else if(idade >= 18 && idade  <= 69 )
		
	

	}

}
