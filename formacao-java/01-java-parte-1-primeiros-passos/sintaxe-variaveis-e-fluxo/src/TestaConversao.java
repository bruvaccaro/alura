public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1234.56;
		int valor = (int) salario;
		System.out.println(valor);

		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);

		long valorGrande = 32432423523L;
		short valorPequeno = 2131;
		byte b = 127;
		System.out.println(valorGrande + " | " + valorPequeno + " | " + b);
	}
}