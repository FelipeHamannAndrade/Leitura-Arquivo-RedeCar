package felipehamannandrade_redecarclasses;

public class DesagendamentoDeParcelas {
	
	private String nPV;
	private String numRV;
	private String numReferencia;
	private String dataCredito;
	private String novoValorParcela;
	private String valorOriginalParcAlterada;
	private String valorAjuste;
	private String dataCancelamento;
	private String valorRVOriginal;
	private String valorCancelamentoSolicitado;
	private String numCartao;
	private String dataTransacao;
	private String NSU;
	private String tipoDebito;
	private String numParcela;
	private String bandeiraRVOrigem;
	public String getnPV() {
		return nPV;
	}
	public void setnPV(String nPV) {
		this.nPV = nPV;
	}
	public String getNumRV() {
		return numRV;
	}
	public void setNumRV(String numRV) {
		this.numRV = numRV;
	}
	public String getNumReferencia() {
		return numReferencia;
	}
	public void setNumReferencia(String numReferencia) {
		this.numReferencia = numReferencia;
	}
	public String getDataCredito() {
		return dataCredito;
	}
	public void setDataCredito(String dataCredito) {
		this.dataCredito = dataCredito;
	}
	public String getNovoValorParcela() {
		return novoValorParcela;
	}
	public void setNovoValorParcela(String novoValorParcela) {
		this.novoValorParcela = novoValorParcela;
	}
	public String getValorOriginalParcAlterada() {
		return valorOriginalParcAlterada;
	}
	public void setValorOriginalParcAlterada(String valorOriginalParcAlterada) {
		this.valorOriginalParcAlterada = valorOriginalParcAlterada;
	}
	public String getValorAjuste() {
		return valorAjuste;
	}
	public void setValorAjuste(String valorAjuste) {
		this.valorAjuste = valorAjuste;
	}
	public String getDataCancelamento() {
		return dataCancelamento;
	}
	public void setDataCancelamento(String dataCancelamento) {
		this.dataCancelamento = dataCancelamento;
	}
	public String getValorRVOriginal() {
		return valorRVOriginal;
	}
	public void setValorRVOriginal(String valorRVOriginal) {
		this.valorRVOriginal = valorRVOriginal;
	}
	public String getValorCancelamentoSolicitado() {
		return valorCancelamentoSolicitado;
	}
	public void setValorCancelamentoSolicitado(String valorCancelamentoSolicitado) {
		this.valorCancelamentoSolicitado = valorCancelamentoSolicitado;
	}
	public String getNumCartao() {
		return numCartao;
	}
	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}
	public String getDataTransacao() {
		return dataTransacao;
	}
	public void setDataTransacao(String dataTransacao) {
		this.dataTransacao = dataTransacao;
	}
	public String getNSU() {
		return NSU;
	}
	public void setNSU(String nSU) {
		NSU = nSU;
	}
	public String getTipoDebito() {
		return tipoDebito;
	}
	public void setTipoDebito(String tipoDebito) {
		this.tipoDebito = tipoDebito;
	}
	public String getNumParcela() {
		return numParcela;
	}
	public void setNumParcela(String numParcela) {
		this.numParcela = numParcela;
	}
	public String getBandeiraRVOrigem() {
		return bandeiraRVOrigem;
	}
	public void setBandeiraRVOrigem(String bandeiraRVOrigem) {
		this.bandeiraRVOrigem = bandeiraRVOrigem;
	}
	@Override
	public String toString() {
		return "DesagendamentoDeParcelas [nPV=" + nPV + ", numRV=" + numRV + ", numReferencia=" + numReferencia
				+ ", dataCredito=" + dataCredito + ", novoValorParcela=" + novoValorParcela
				+ ", valorOriginalParcAlterada=" + valorOriginalParcAlterada + ", valorAjuste=" + valorAjuste
				+ ", dataCancelamento=" + dataCancelamento + ", valorRVOriginal=" + valorRVOriginal
				+ ", valorCancelamentoSolicitado=" + valorCancelamentoSolicitado + ", numCartao=" + numCartao
				+ ", dataTransacao=" + dataTransacao + ", NSU=" + NSU + ", tipoDebito=" + tipoDebito + ", numParcela="
				+ numParcela + ", bandeiraRVOrigem=" + bandeiraRVOrigem + "]";
	}

}
