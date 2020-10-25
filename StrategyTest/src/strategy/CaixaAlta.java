package strategy;

public class CaixaAlta implements Formatacoes {

	@Override
	public String alteraTexto(String texto) {
		return texto.toUpperCase();
	}

}
