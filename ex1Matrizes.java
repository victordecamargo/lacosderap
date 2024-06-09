import java.util.Scanner; 

public class ex1Matrizes { 

    Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) { 
        /*
        Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
        - Todos os elementos da Diagonal Principal
        - Todos os elementos da Diagonal Secundária
        - A Soma de todos os elementos da Diagonal Principal
        - A Soma de todos os elementos da Diagonal Secundária
        */
        
        int matriz[][] = new int[3][3]; // Declara uma matriz 3x3 de inteiros
        int diagPrincipal[] = new int[3]; // Declara um array para armazenar os elementos da diagonal principal
        int diagSegundaria[] = new int[3]; // Declara um array para armazenar os elementos da diagonal secundária
        int i, j, nPrincipal = 0, nSegundaria = 0, somaPrincipal = 0, somaSecundaria = 0; // Declara variáveis para controle de índices e somas
        // i = linha, j = coluna, nP = contador para a diagonal principal, nS = contador para a diagonal secundária, somaP = soma da diagonal principal, somaS = soma da diagonal secundária
        
        Scanner sc = new Scanner(System.in); 

       
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Digite o numero da posição: " + i + " " + j); // Solicita ao usuário para inserir um número para a posição i, j da matriz
                matriz[i][j] = sc.nextInt(); // Lê o número digitado pelo usuário e armazena na matriz

                if (i == j) { // Verifica se a posição atual está na diagonal principal (linha igual a coluna)
                    diagPrincipal[nPrincipal] = matriz[i][j]; // Armazena o elemento na diagonal principal
                    nPrincipal++; // Incrementa o contador da diagonal principal
                }

                if (i + j == 2) { // Verifica se a posição atual está na diagonal secundária (soma dos índices igual a 2)
                	diagSegundaria[nSegundaria] = matriz[i][j]; // Armazena o elemento na diagonal secundária
                    nSegundaria++; // Incrementa o contador da diagonal secundária
                }
            }
        }

        // Exibe os elementos da diagonal principal
        System.out.println("Elementos da Diagonal Principal: " + diagPrincipal[0] + " " + diagPrincipal[1] + " " + diagPrincipal[2]);
        
        // Exibe os elementos da diagonal secundária
        System.out.println("Elementos da Diagonal Secundária: " + diagSegundaria[0] + " " + diagSegundaria[1] + " " + diagSegundaria[2]);

        // Loop para calcular a soma dos elementos da diagonal principal
        for (int x = 0; x < diagPrincipal.length; x++) {
            somaPrincipal += diagPrincipal[x]; // Soma cada elemento da diagonal principal
        }
        // Exibe a soma dos elementos da diagonal principal
        System.out.println("Soma dos Elementos da Diagonal Principal: " + somaPrincipal);

        // Loop para calcular a soma dos elementos da diagonal secundária
        for (int x = 0; x < diagSegundaria.length; x++) { // Note que foi usado diagP.length, mas poderia ser diagS.length também, pois ambos têm o mesmo tamanho
            somaSecundaria += diagSegundaria[x]; // Soma cada elemento da diagonal secundária
        }
        // Exibe a soma dos elementos da diagonal secundária
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaSecundaria);

        sc.close(); // Fecha o Scanner para liberar recursos
    }
}