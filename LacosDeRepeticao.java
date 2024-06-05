import java.util.Scanner;

public class LacosDeRepeticao {

	public static void main(String[] args) {
		
		int valor1,valor2,valor3,soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro valor: ");
		valor1 = leia.nextInt();
		
		System.out.println("\nEntre com o segundo valor: ");
		valor2 = leia.nextInt();
		
		System.out.println("\nEntre com o terceiro valor: ");
		valor3 = leia.nextInt();
		
		soma = (valor1+valor2);
		
		if(soma > valor3 ) {
			System.out.println("\nOs dois primeiros valores somados são maiores que o ultimo valor");
		}else if(soma == valor3) {
			System.out.println("\nOs dois primeiros valores somados são iguais que o ultimo valor");
		}else {
			System.out.println("\nOs dois primeiros valores somados são menores que o ultimo valor");
		}
		
		
		

	}

}
