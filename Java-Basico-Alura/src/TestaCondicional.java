
public class TestaCondicional {
	public static void main(String[] args) {
		
		System.out.println("testando condicional");
		
		int idade = 20;
		int quantidadePessoa = 3;
		
		if (idade >= 18) {
			System.out.println("voce tem mais de 18 anos");
		} else {
			if (quantidadePessoa >= 2) {
				System.out.println("voce não tem 18 mais pode entrar, pois esta acompanhado");
			}else {
				System.out.println("infelizmente voce não pode entrar");

			}
		}
	}
}
