import java.util.Scanner;

public class exx2 {

	public static void main(String[] args) {
		
		int n1;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o numero");
		n1 = leia.nextInt();
		
		if(n1 % 2 == 0 && n1 >= 0 ) {
			System.out.println("\nO numero é par e positivo");
		}else if (n1 % 2 != 0  &&  n1 < 0) {
			System.out.println("\nO numero é impar e negativo");
		}else if (n1 % 2 == 0  &&  n1 < 0) {
			System.out.println("\nO numero é par e negativo");
		}else {
			System.out.println("\nO numero é impar e positivo");
			
		}
		
	}

}
