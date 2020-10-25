package strategy;

public class PublicaTexto {

	String texto;
	
	Formatacoes tipoDeFormatacao;
	
	public PublicaTexto() {
		
	}
	
	public PublicaTexto(String texto, Formatacoes tipoDeFormatacao) {
		this.texto = texto;
		this.tipoDeFormatacao = tipoDeFormatacao;
	}
	
	public String mostraPublicacao() {
		return this.tipoDeFormatacao.alteraTexto(this.texto);
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Formatacoes getTipoDeFormatacao() {
		return tipoDeFormatacao;
	}

	public void setTipoDeFormatacao(Formatacoes tipoDeFormatacao) {
		this.tipoDeFormatacao = tipoDeFormatacao;
	}
	
}
