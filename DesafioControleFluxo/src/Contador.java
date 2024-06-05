import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número do primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o número do segundo parâmetro");
		int parametroDois = sc.nextInt();
		try {
			contar(parametroUm, parametroDois);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		int contagem = parametroDois - parametroUm;
		for (int i = parametroUm; i < parametroDois; i++) {
			System.out.println(i);
		}
	}
}
