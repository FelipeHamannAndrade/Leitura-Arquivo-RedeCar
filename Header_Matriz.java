package felipehamannandrade_redecarclasses;

public class Header_Matriz {

	private String tipoRegistro;
	private String numeroPontoVenda; 
	private String nomeComercial;
	
	public Header_Matriz() {
		
	}

	public String getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getNumeroPontoVenda() {
		return numeroPontoVenda;
	}

	public void setNumeroPontoVenda(String numeroPontoVenda) {
		this.numeroPontoVenda = numeroPontoVenda;
	}

	public String getNomeComercial() {
		return nomeComercial;
	}

	public void setNomeComercial(String nomeComercial) {
		this.nomeComercial = nomeComercial;
	}

	@Override
	public String toString() {
		return "Header_Matriz [tipoRegistro=" + tipoRegistro + ", numeroPontoVenda=" + numeroPontoVenda
				+ ", nomeComercial=" + nomeComercial + "]";
	}
	
	
}
