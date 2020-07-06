package felipehamannandrade_redecarclasses;

public class HeaderArquivo {
	

		private String tipoRegistro;
		private String dataEmiss�o;
		private String operadora;
		private String descricaoArquivo;
		private String nomeCormecial;
		private String sequenciaMovimento;
		private String numeroPontoVenda;
		private String tipoProcedimento;
		private String versoaArquivo;

		public HeaderArquivo() {
			
		}

		public String getTipoRegistro() {
			return tipoRegistro;
		}

		public void setTipoRegistro(String tipoRegistro) {
			this.tipoRegistro = tipoRegistro;
		}

		public String getDataEmiss�o() {
			return dataEmiss�o;
		}

		public void setDataEmiss�o(String dataEmiss�o) {
			this.dataEmiss�o = dataEmiss�o;
		}

		public String getOperadora() {
			return operadora;
		}

		public void setOperadora(String operadora) {
			this.operadora = operadora;
		}

		public String getDescricaoArquivo() {
			return descricaoArquivo;
		}

		public void setDescricaoArquivo(String descricaoArquuivo) {
			this.descricaoArquivo = descricaoArquuivo;
		}

		public String getNomeCormecial() {
			return nomeCormecial;
		}

		public void setNomeCormecial(String nomeCormecial) {
			this.nomeCormecial = nomeCormecial;
		}

		public String getSequenciaMovimento() {
			return sequenciaMovimento;
		}

		public void setSequenciaMovimento(String sequenciaMovimento) {
			this.sequenciaMovimento = sequenciaMovimento;
		}

		public String getNumeroPontoVenda() {
			return numeroPontoVenda;
		}

		public void setNumeroPontoVenda(String numeroPontoVenda) {
			this.numeroPontoVenda = numeroPontoVenda;
		}

		public String getTipoProcedimento() {
			return tipoProcedimento;
		}

		public void setTipoProcedimento(String tipoProcedimento) {
			this.tipoProcedimento = tipoProcedimento;
		}

		public String getVersoaArquivo() {
			return versoaArquivo;
		}

		public void setVersoaArquivo(String versoaArquivo) {
			this.versoaArquivo = versoaArquivo;
		}

		@Override
		public String toString() {
			return "HeaderAquivo [tipoRegistro=" + tipoRegistro + ", dataEmiss�o=" + dataEmiss�o + ", operadora="
					+ operadora + ", descricaoArquuivo=" + descricaoArquivo + ", nomeCormecial=" + nomeCormecial
					+ ", sequenciaMovimento=" + sequenciaMovimento + ", numeroPontoVenda=" + numeroPontoVenda
					+ ", tipoProcedimento=" + tipoProcedimento + ", versoaArquivo=" + versoaArquivo + "]";
		}



	}


