package strategy;

public class Negrito implements Formatacoes {

	@Override
	public String alteraTexto(String texto) {
		return "\033[1m" + texto +"\033[1m";
	}

}
