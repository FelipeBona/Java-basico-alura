
public class TesteEscopo {
	public static void main(String[] args) {

		System.out.println("testando condicional");

		int idade = 20;
		int quantidadePessoas = 3;
		//boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			 acompanhado = true;
		}else {
			 acompanhado = false;
		}

		System.out.println("valor de acompanhado = " + acompanhado);
		if (idade >= 18 && acompanhado) {
		} else {
			System.out.println("infelizmente voce nao pode entrar");
		}
	}
}
