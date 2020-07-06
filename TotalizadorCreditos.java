package felipehamannandrade_redecarclasses;

public class TotalizadorCreditos {

	private String tipoRegistro;
	private String numeroPV;
	private String banco;
	private String dtCredito;
	private String totalCredito;
	private String brancos;
	private String nBancos;
	private String nAgencia;
	private String nContaCorrente;
	private String dtGeraArquivo;
	private String dtCreditoAntec;
	private String totalCreditosAntecipados;
	
	public TotalizadorCreditos() {
		
	}

	public String getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getNumeroPV() {
		return numeroPV;
	}

	public void setNumeroPV(String numeroPV) {
		this.numeroPV = numeroPV;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getDtCredito() {
		return dtCredito;
	}

	public void setDtCredito(String dtCredito) {
		this.dtCredito = dtCredito;
	}

	public String getTotalCredito() {
		return totalCredito;
	}

	public void setTotalCredito(String totalCredito) {
		this.totalCredito = totalCredito;
	}

	public String getBrancos() {
		return brancos;
	}

	public void setBrancos(String brancos) {
		this.brancos = brancos;
	}

	public String getnBancos() {
		return nBancos;
	}

	public void setnBancos(String nBancos) {
		this.nBancos = nBancos;
	}

	public String getnAgencia() {
		return nAgencia;
	}

	public void setnAgencia(String nAgencia) {
		this.nAgencia = nAgencia;
	}

	public String getnContaCorrente() {
		return nContaCorrente;
	}

	public void setnContaCorrente(String nContaCorrente) {
		this.nContaCorrente = nContaCorrente;
	}

	public String getDtGeraArquivo() {
		return dtGeraArquivo;
	}

	public void setDtGeraArquivo(String dtGeraArquivo) {
		this.dtGeraArquivo = dtGeraArquivo;
	}

	public String getDtCreditoAntec() {
		return dtCreditoAntec;
	}

	public void setDtCreditoAntec(String dtCreditoAntec) {
		this.dtCreditoAntec = dtCreditoAntec;
	}

	public String getTotalCreditosAntecipados() {
		return totalCreditosAntecipados;
	}

	public void setTotalCreditosAntecipados(String totalCreditosAntecipados) {
		this.totalCreditosAntecipados = totalCreditosAntecipados;
	}

	@Override
	public String toString() {
		return "TotalizadorCreditos [tipoRegistro=" + tipoRegistro + ", numeroPV=" + numeroPV + ", banco=" + banco
				+ ", dtCredito=" + dtCredito + ", totalCredito=" + totalCredito + ", brancos=" + brancos + ", nBancos="
				+ nBancos + ", nAgencia=" + nAgencia + ", nContaCorrente=" + nContaCorrente + ", dtGeraArquivo="
				+ dtGeraArquivo + ", dtCreditoAntec=" + dtCreditoAntec + ", totalCreditosAntecipados="
				+ totalCreditosAntecipados + "]";
	}
		
}
