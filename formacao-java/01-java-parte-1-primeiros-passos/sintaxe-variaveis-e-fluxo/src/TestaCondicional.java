public class TestaCondicional {
	public static void main(String[] args) {
		int idade = 26;
		int quantidadePessoas = 2;

		if (idade >= 18) {
			System.out.println("Seja bem vindo(a)!");
			System.out.println("Você é maior de idade e pode entrar.");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Seja bem vindo(a)!");
				System.out.println("Você é menor de idade, mas pode entrar, pois esta acompanhado(a).");
			} else {
				System.out.println("Você não pode entrar!");
				System.out.println("Você é menor de idade e não está acompanhado(a).");
			}
		}
	}
}