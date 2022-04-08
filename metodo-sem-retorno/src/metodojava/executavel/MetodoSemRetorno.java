package metodojava.executavel;

public class MetodoSemRetorno {

	public static void main(String[] args) {

		imprimeNovaMensagem("Primeiro parâmetro");
		imprimeNovaMensagem("Segundo parâmetro");
		imprimeNovaMensagem("Terceiro parâmetro");
	}

	public static void imprimeNovaMensagem(String text) {
		System.out.println("Meu primeiro programa com funcoes e parametro: " + text);

	}

}
