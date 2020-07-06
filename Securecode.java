package felipehamannandrade_redecarclasses;

public class Securecode {
	
	private String tipoRegistro;
	private String nPV;
	private String qtdadeConsulta;
	private String totalConsultas;
	private String inicioPeriodoConsulta;
	private String fimPeriodoConsulta;
	private String valorPorConsulta;
	
	public Securecode() {
		
	}

	public String getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getnPV() {
		return nPV;
	}

	public void setnPV(String nPV) {
		this.nPV = nPV;
	}

	public String getQtdadeConsulta() {
		return qtdadeConsulta;
	}

	public void setQtdadeConsulta(String qtdadeConsulta) {
		this.qtdadeConsulta = qtdadeConsulta;
	}

	public String getTotalConsultas() {
		return totalConsultas;
	}

	public void setTotalConsultas(String totalConsultas) {
		this.totalConsultas = totalConsultas;
	}

	public String getInicioPeriodoConsulta() {
		return inicioPeriodoConsulta;
	}

	public void setInicioPeriodoConsulta(String inicioPeriodoConsulta) {
		this.inicioPeriodoConsulta = inicioPeriodoConsulta;
	}

	public String getFimPeriodoConsulta() {
		return fimPeriodoConsulta;
	}

	public void setFimPeriodoConsulta(String fimPeriodoConsulta) {
		this.fimPeriodoConsulta = fimPeriodoConsulta;
	}

	public String getValorPorConsulta() {
		return valorPorConsulta;
	}

	public void setValorPorConsulta(String valorPorConsulta) {
		this.valorPorConsulta = valorPorConsulta;
	}

	@Override
	public String toString() {
		return "Serasa [tipoRegistro=" + tipoRegistro + ", nPV=" + nPV + ", qtdadeConsulta=" + qtdadeConsulta
				+ ", totalConsultas=" + totalConsultas + ", inicioPeriodoConsulta=" + inicioPeriodoConsulta
				+ ", fimPeriodoConsulta=" + fimPeriodoConsulta + ", valorPorConsulta=" + valorPorConsulta + "]";
	}
	
	
	
}
