package strategy;

public class CaixaBaixa implements Formatacoes{

	@Override
	public String alteraTexto(String texto) {
		return texto.toLowerCase();
	}

}
