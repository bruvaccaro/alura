package exercicios;

public class TestaIR {
	public static void main(String[] args) {
		double salario = 3300.0;

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("De 1900.0 at� 2800.0, o IR � de 7.5% e pode deduzir R$ 142");
		}

		if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("De 2800.01 at� 3751.0, o IR � de 15% e pode deduzir R$ 350");
		}

		if (salario >= 3751.01 && salario <= 4664.0) {
			System.out.println("De 3751.01 at� 4664.00, o IR � de 22.5% e pode deduzir R$ 636");
		}
	}
}