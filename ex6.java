import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		String nome,fish;
		int numeroCargo;
		float salario,atualizado,aumento;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite seu nome completo: ");
		nome = leia.nextLine();
		
		System.out.println("\nDigite o seu cargo [1]Gerente - [2]Vendedor - [3]Supervisor - [4]Motorista - [5]Estoquista - [6]Técnico de TI: ");
		numeroCargo = leia.nextInt();
		
		System.out.println("Digite seu salario bruto: ");
		salario = leia.nextFloat();
		
		
		switch(numeroCargo) {
		case 1:
			atualizado = (float) (salario * 0.10f);
			aumento = salario + atualizado;
			fish = "Gerente" ;
			System.out.println("\nOlá Gerente: " + nome + "\nSeu novo salario é: " + aumento);
			break;
			
		case 2:
			atualizado = (float) (salario * 0.07f);
			aumento = salario + atualizado;
			fish = "Gerente" ;
			System.out.println("\nOlá Vendedor: " + nome + "\nSeu novo salario é: " + aumento);
			break;
			
		case 3:
			atualizado = (float) (salario * 0.09f);
			aumento = salario + atualizado;
			fish = "Gerente" ;
			System.out.println("\nOlá Supervisor: " + nome + "\nSeu novo salario é: " + aumento);
			break;
			
		case 4:
			atualizado = (float) (salario * 0.06f);
			aumento = salario + atualizado;
			fish = "Gerente" ;
			System.out.println("\nOlá Motorista: " + nome + "\nSeu novo salario é: " + aumento);
			break;
			
		case 5:
			atualizado = (float) (salario * 0.05f);
			aumento = salario + atualizado;
			fish = "Gerente" ;
			System.out.println("\nOlá Estoquista: " + nome + "\nSeu novo salario é: " + aumento);
			break;
			
		case 6:
			atualizado = (float) (salario * 0.08f);
			aumento = salario + atualizado;
			fish = "Gerente" ;
			System.out.println("\nOlá Técnico de TI: " + nome + "\nSeu novo salario é: " + aumento);
			break;
			
		default: 
			System.out.println("Produto inválido!");
	
		}
		
		
		

	} 

}
