package felipehamannandrade_redecarclasses;

public class Creditos {
	private String tipoRegistro;
	private String numeroPVCentralizado;
	private String numeroDocumento;
	private String dataLancamento;
	private String valorLancamento;
	private String credito;
	private String banco;
	private String agencia;
	private String contaCorrente;
	private String dataMovimento;
	private String numeroRV;
	private String dataRV;
	private String bandeira;
	private String tipoTransacao;
	private String valorBrutoRV;
	private String valorTaxaDesc;
	private String numeroParcela;
	private String statusCredito;
	private String numeroPVOriginal;
	
	public Creditos() {
		
	}

	public String getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getNumeroPVCentralizado() {
		return numeroPVCentralizado;
	}

	public void setNumeroPVCentralizado(String numeroPVCentralizado) {
		this.numeroPVCentralizado = numeroPVCentralizado;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getValorLancamento() {
		return valorLancamento;
	}

	public void setValorLancamento(String valorLancamento) {
		this.valorLancamento = valorLancamento;
	}

	public String getCredito() {
		return credito;
	}

	public void setCredito(String credito) {
		this.credito = credito;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(String contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	public String getDataMovimento() {
		return dataMovimento;
	}

	public void setDataMovimento(String dataMovimento) {
		this.dataMovimento = dataMovimento;
	}

	public String getNumeroRV() {
		return numeroRV;
	}

	public void setNumeroRV(String numeroRV) {
		this.numeroRV = numeroRV;
	}

	public String getDataRV() {
		return dataRV;
	}

	public void setDataRV(String dataRV) {
		this.dataRV = dataRV;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public String getTipoTransacao() {
		return tipoTransacao;
	}

	public void setTipoTransacao(String tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}

	public String getValorBrutoRV() {
		return valorBrutoRV;
	}

	public void setValorBrutoRV(String valorBrutoRV) {
		this.valorBrutoRV = valorBrutoRV;
	}

	public String getValorTaxaDesc() {
		return valorTaxaDesc;
	}

	public void setValorTaxaDesc(String valorTaxaDesc) {
		this.valorTaxaDesc = valorTaxaDesc;
	}

	public String getNumeroParcela() {
		return numeroParcela;
	}

	public void setNumeroParcela(String numeroParcela) {
		this.numeroParcela = numeroParcela;
	}

	public String getStatusCredito() {
		return statusCredito;
	}

	public void setStatusCredito(String statusCredito) {
		this.statusCredito = statusCredito;
	}

	public String getNumeroPVOriginal() {
		return numeroPVOriginal;
	}

	public void setNumeroPVOriginal(String numeroPVOriginal) {
		this.numeroPVOriginal = numeroPVOriginal;
	}

	@Override
	public String toString() {
		return "Creditos [tipoRegistro=" + tipoRegistro + ", numeroPVCentralizado=" + numeroPVCentralizado
				+ ", numeroDocumento=" + numeroDocumento + ", dataLancamento=" + dataLancamento + ", valorLancamento="
				+ valorLancamento + ", credito=" + credito + ", banco=" + banco + ", agencia=" + agencia
				+ ", contaCorrente=" + contaCorrente + ", dataMovimento=" + dataMovimento + ", numeroRV=" + numeroRV
				+ ", dataRV=" + dataRV + ", bandeira=" + bandeira + ", tipoTransacao=" + tipoTransacao
				+ ", valorBrutoRV=" + valorBrutoRV + ", valorTaxaDesc=" + valorTaxaDesc + ", numeroParcela="
				+ numeroParcela + ", statusCredito=" + statusCredito + ", numeroPVOriginal=" + numeroPVOriginal + "]";
	}
	
}
