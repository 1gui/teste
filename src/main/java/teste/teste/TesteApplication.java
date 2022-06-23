package teste.teste;

import java.util.Scanner;

@SpringBootApplication
public class TesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);

		Scanner leitor = new Scanner(System.in);
		System.out.println("informe um numero inteiro.");
		int NUMERO = leitor.nextInt();
		leitor.close();
		int NF1 = 0;
		int NF2 = 1;
		int NF = 0;

		
		for (int i = 0; i < NUMERO; i = NF) {
			NF = NF1 + NF2;
			NF1 = NF2;
			NF2 = NF;

		}
		if (NF == NUMERO) {
			System.out.println("O numero informado pertence a sequencia de Fibonacci!");

		} else {
			System.out.println("O numero informado não pertence a sequencia de Fibonacci");
		}

	}

}
