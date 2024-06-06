import java.util.Scanner;


public class WhileEx1 {

	
	public static void main(String[] args) {
		
		int idade,totalMaior=0,totalMenor=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a sua idade: ");
		idade = leia.nextInt();
		
		while(idade != -0) {
			if(idade <= 20) {
				totalMenor ++;
				}
			else {
				totalMaior ++;
				}
			System.out.println("Entre com a sua idade: ");
			idade = leia.nextInt();
			
		
			
			
		}
		System.out.println("\nA quantidade de menores que 21 anos é: " + totalMenor + "\nA quantidade de maiores que 21 anos é: " + totalMaior);
		idade = leia.nextInt();
		

	}

}
