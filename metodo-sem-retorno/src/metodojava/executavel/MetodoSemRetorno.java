package metodojava.executavel;

public class MetodoSemRetorno {

	public static void main(String[] args) {

		imprimeNovaMensagem("Primeiro par�metro");
		imprimeNovaMensagem("Segundo par�metro");
		imprimeNovaMensagem("Terceiro par�metro");

		String[] posicao = new String[] { "primeira posi��o", "segunda posi��o", "terceira posi��o" };
		for (int i = 0; i < posicao.length; i++) {
			imprimeNovaMensagem(posicao[i]);
		}
	}

	public static void imprimeNovaMensagem(String text) {
		System.out.println("Meu primeiro programa com funcoes e parametro: " + text);

	}

}
