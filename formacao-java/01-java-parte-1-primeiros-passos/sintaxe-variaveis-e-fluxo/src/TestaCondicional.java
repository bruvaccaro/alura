public class TestaCondicional {
	public static void main(String[] args) {
		int idade = 26;
		int quantidadePessoas = 2;

		if (idade >= 18) {
			System.out.println("Seja bem vindo(a)!");
			System.out.println("Voc� � maior de idade e pode entrar.");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Seja bem vindo(a)!");
				System.out.println("Voc� � menor de idade, mas pode entrar, pois esta acompanhado(a).");
			} else {
				System.out.println("Voc� n�o pode entrar!");
				System.out.println("Voc� � menor de idade e n�o est� acompanhado(a).");
			}
		}
	}
}