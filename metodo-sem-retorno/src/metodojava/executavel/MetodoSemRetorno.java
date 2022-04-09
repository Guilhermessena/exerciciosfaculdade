package metodojava.executavel;

public class MetodoSemRetorno {

	public static void main(String[] args) {

		imprimeNovaMensagem("Primeiro parâmetro");
		imprimeNovaMensagem("Segundo parâmetro");
		imprimeNovaMensagem("Terceiro parâmetro");

		String[] posicao = new String[] { "primeira posição", "segunda posição", "terceira posição" };
		for (int i = 0; i < posicao.length; i++) {
			imprimeNovaMensagem(posicao[i]);
		}
	}

	public static void imprimeNovaMensagem(String text) {
		System.out.println("Meu primeiro programa com funcoes e parametro: " + text);

	}

}
