package strategy;

public class Italico implements Formatacoes{

	@Override
	public String alteraTexto(String texto) {
		return "\033[3m" + texto +"\033[0m";
	}

}
