package felipehamannandrade_redecarclasses;

public class Totalizador {
	
	private String nPV;
	private String qtdTotalResumosMatriz;
	private String valorTotalCredNormais;
	private String qtdCreditosAntecipados;
	private String valorTotalAntecipado;
	private String qtdAjustesCredito;
	private String valorTotalAjustesCredito;
	private String qtdAjustesDebito;
	private String valorTotalAjustesDebito;
	public String getnPV() {
		return nPV;
	}
	public void setnPV(String nPV) {
		this.nPV = nPV;
	}
	public String getQtdTotalResumosMatriz() {
		return qtdTotalResumosMatriz;
	}
	public void setQtdTotalResumosMatriz(String qtdTotalResumosMatriz) {
		this.qtdTotalResumosMatriz = qtdTotalResumosMatriz;
	}
	public String getValorTotalCredNormais() {
		return valorTotalCredNormais;
	}
	public void setValorTotalCredNormais(String valorTotalCredNormais) {
		this.valorTotalCredNormais = valorTotalCredNormais;
	}
	public String getQtdCreditosAntecipados() {
		return qtdCreditosAntecipados;
	}
	public void setQtdCreditosAntecipados(String qtdCreditosAntecipados) {
		this.qtdCreditosAntecipados = qtdCreditosAntecipados;
	}
	public String getValorTotalAntecipado() {
		return valorTotalAntecipado;
	}
	public void setValorTotalAntecipado(String valorTotalAntecipado) {
		this.valorTotalAntecipado = valorTotalAntecipado;
	}
	public String getQtdAjustesCredito() {
		return qtdAjustesCredito;
	}
	public void setQtdAjustesCredito(String qtdAjustesCredito) {
		this.qtdAjustesCredito = qtdAjustesCredito;
	}
	public String getValorTotalAjustesCredito() {
		return valorTotalAjustesCredito;
	}
	public void setValorTotalAjustesCredito(String valorTotalAjustesCredito) {
		this.valorTotalAjustesCredito = valorTotalAjustesCredito;
	}
	public String getQtdAjustesDebito() {
		return qtdAjustesDebito;
	}
	public void setQtdAjustesDebito(String qtdAjustesDebito) {
		this.qtdAjustesDebito = qtdAjustesDebito;
	}
	public String getValorTotalAjustesDebito() {
		return valorTotalAjustesDebito;
	}
	public void setValorTotalAjustesDebito(String valorTotalAjustesDebito) {
		this.valorTotalAjustesDebito = valorTotalAjustesDebito;
	}
	@Override
	public String toString() {
		return "Totalizador [nPV=" + nPV + ", qtdTotalResumosMatriz=" + qtdTotalResumosMatriz
				+ ", valorTotalCredNormais=" + valorTotalCredNormais + ", qtdCreditosAntecipados="
				+ qtdCreditosAntecipados + ", valorTotalAntecipado=" + valorTotalAntecipado + ", qtdAjustesCredito="
				+ qtdAjustesCredito + ", valorTotalAjustesCredito=" + valorTotalAjustesCredito + ", qtdAjustesDebito="
				+ qtdAjustesDebito + ", valorTotalAjustesDebito=" + valorTotalAjustesDebito + "]";
	}

}
