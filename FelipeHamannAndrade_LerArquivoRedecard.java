package felipehamannandrade_redecarleitura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import felipehamannandrade_redecarclasses.AVS;
import felipehamannandrade_redecarclasses.AjusteNET;
import felipehamannandrade_redecarclasses.AjustesCredito;
import felipehamannandrade_redecarclasses.AjustesDebito;
import felipehamannandrade_redecarclasses.Antecipacoes;
import felipehamannandrade_redecarclasses.Creditos;
import felipehamannandrade_redecarclasses.DebitosLiquidados;
import felipehamannandrade_redecarclasses.DebitosPendentes;
import felipehamannandrade_redecarclasses.DesagendamentoDeParcelas;
import felipehamannandrade_redecarclasses.HeaderArquivo;
import felipehamannandrade_redecarclasses.Header_Matriz;
import felipehamannandrade_redecarclasses.Securecode;
import felipehamannandrade_redecarclasses.Serasa;
import felipehamannandrade_redecarclasses.Totalizador;
import felipehamannandrade_redecarclasses.TotalizadorCreditos;
import felipehamannandrade_redecarclasses.TraillerArquivo;



public class FelipeHamannAndrade_LerArquivoRedecard {

	public void leitura() throws IOException{
		
		File arquivo = new File("C:\\dados\\NEFI_TESTE_1908.TXT");
		FileReader fr = new FileReader(arquivo);
		BufferedReader bf = new BufferedReader(fr);
		
		while (bf.ready()) {
			String linha = bf.readLine();
			String tipo = linha.substring(0, 3);
			if (tipo.equals("030")) {
				String data = this.retornaData(linha.substring(3, 11));
				String operadora = linha.substring(11, 19);
				String extrato = linha.substring(19, 53);
				String nomeComercial = linha.substring(53, 73);
				String movimento = linha.substring(74, 81);
				String grupo = linha.substring(81, 90);
				String processamento = linha.substring(90, 105);
				String versao = linha.substring(105, 125);
				
				HeaderArquivo objHeader = new HeaderArquivo();
				
				objHeader.setTipoRegistro(tipo);
				objHeader.setDataEmissão(data);
				objHeader.setOperadora(operadora);
				objHeader.setDescricaoArquivo(extrato);
				objHeader.setNomeCormecial(nomeComercial);
				objHeader.setSequenciaMovimento(movimento);
				objHeader.setNumeroPontoVenda(grupo);
				objHeader.setTipoProcedimento(processamento);
				objHeader.setVersoaArquivo(versao);
				
				System.out.println(objHeader.toString());
				
			}else if(tipo.equals("032")) {
				String numeroPontoVenda = linha.substring(3,12);
				String nomeComercial = linha.substring(12,29);
				
				Header_Matriz objMatriz = new Header_Matriz();
				
				objMatriz.setTipoRegistro(tipo);
				objMatriz.setNumeroPontoVenda(numeroPontoVenda);
				objMatriz.setNomeComercial(nomeComercial);
			
				System.out.println(objMatriz.toString());
				
			}else if(tipo.equals("034")) {
				String numeroPontoVenda = linha.substring(3,12);
				String numeroDocumento = linha.substring(12,23);
				String dataLancamento = this.retornaData(linha.substring(23,31));
				String valorLancamento = linha.substring(31,46);
				String credito = linha.substring(46,47);
				String banco = linha.substring(47,50);
				String agencia = linha.substring(50,56);
				String contaCorrente = linha.substring(56,67);
				String dataMovimento = this.retornaData(linha.substring(67,75));
				String numeroRV = linha.substring(75,84);
				String dataRV = this.retornaData(linha.substring(84,92));
				String bandeira = linha.substring(92,93);
				String tipoTransacao = linha.substring(93,94);
				String valorBrutoRV = linha.substring(94,109);
				String valorTaxaDesc = linha.substring(110,124);
				String numeroParcela = linha.substring(124,129);
				String statusCredito = linha.substring(129,131);
				String numPVCredito = linha.substring(131,140);
				
				Creditos objCredito = new Creditos();
				
				objCredito.setTipoRegistro(tipo);
				objCredito.setNumeroPVCentralizado(numeroPontoVenda);
				objCredito.setNumeroDocumento(numeroDocumento);
				objCredito.setDataLancamento(dataLancamento);
				objCredito.setValorLancamento(valorLancamento);
				objCredito.setCredito(credito);
				objCredito.setBanco(banco);
				objCredito.setAgencia(agencia);
				objCredito.setContaCorrente(contaCorrente);
				objCredito.setDataMovimento(dataMovimento);
				objCredito.setNumeroRV(numeroRV);
				objCredito.setDataRV(dataRV);
				objCredito.setBandeira(bandeira);
				objCredito.setTipoTransacao(tipoTransacao);
				objCredito.setValorBrutoRV(valorBrutoRV);
				objCredito.setValorTaxaDesc(valorTaxaDesc);
				objCredito.setNumeroParcela(numeroParcela);
				objCredito.setStatusCredito(statusCredito);
				objCredito.setNumeroPVOriginal(numPVCredito);
				
				System.out.println(objCredito.toString());
				
			}else  if(tipo.equals("035")) {
				
				String nomePVAjustado = linha.substring(3,12);
				String numeroRVAjustado = linha.substring(12,21);
				String dataAjuste = this.retornaData(linha.substring(21,29));
				String valorAjustado = linha.substring(29,44);
				String debito = linha.substring(44,45);
				String motivoAjusteCod = linha.substring(45,47);
				String motivoAjusteString = linha.substring(47,75);
				String numeroCartao = linha.substring(75,91);
				String dataTransacao = this.retornaData(linha.substring(91,99));
				String numeroRVOriginal = linha.substring(99,108);
				String numeroRefCarta = linha.substring(108,123);
				String dataCarta = this.retornaData(linha.substring(123,131));
				String mesReferencia = linha.substring(131,137);
				String numeroPVOriginal = linha.substring(137,146);
				String dataRVOriginal = this.retornaData(linha.substring(146,154));
				String valorTransacao = linha.substring(154,169);
				String desagendamentoNet = linha.substring(169,170);
				String dataCredito = linha.substring(170,178);
				String novoValorParcela = linha.substring(178,193);
				String valorOrigParc = linha.substring(193,208);
				String valorBrutoVendaOrig = linha.substring(208,223);
				String valorCancelamento = linha.substring(223,238);
				String numeroNSU = linha.substring(238,250);
				String numeroAutorizacao = linha.substring(250,256);
				String tipoDebito = linha.substring(256,257);
				String numeroOrdemDebito = linha.substring(257,268);
				String valorDebitoTotal = linha.substring(268,283);
				String valorPendente = linha.substring(283,298);
				String bandeiraRVOrigem = linha.substring(298,299);
				String bandeiraRVAjustado = linha.substring(299,300);
				
				AjusteNET net = new AjusteNET();
				
				net.setTipoRegistro(tipo);
				net.setNomePVAjustado(nomePVAjustado);
				net.setNumeroRVAjustado(numeroRVAjustado);
				net.setDataAjuste(dataAjuste);
				net.setValorAjuste(valorAjustado);
				net.setDebito(debito);
				net.setMotivoAjusteCod(motivoAjusteCod);
				net.setMotivoAjusteString(motivoAjusteString);
				net.setNumeroCartao(numeroCartao);
				net.setDataTransacao(dataTransacao);
				net.setNumeroRVOriginal(numeroRVOriginal);
				net.setNumeroRefCarta(numeroRefCarta);
				net.setDataCarta(dataCarta);
				net.setMesReferencia(mesReferencia);
				net.setNumeroPVOriginal(numeroPVOriginal);
				net.setDataRVOriginal(dataRVOriginal);
				net.setValorTransacao(valorTransacao);
				net.setDesagendamentoNet(desagendamentoNet);
				net.setDataCredito(dataCredito);
				net.setNovoValorParcela(novoValorParcela);
				net.setValorOrigParc(valorOrigParc);
				net.setValorBrutoVendaOrig(valorBrutoVendaOrig);
				net.setValorCancelamento(valorCancelamento);
				net.setNumeroNSU(numeroNSU);
				net.setNumeroAutorizacao(numeroAutorizacao);
				net.setTipoDebito(tipoDebito);
				net.setNumeroOrdemDebito(numeroOrdemDebito);
				net.setValorDebitoTotal(valorDebitoTotal);
				net.setValorPendente(valorPendente);
				net.setBandeiraRVOrigem(bandeiraRVOrigem);
				net.setBandeiraRVAjustado(bandeiraRVAjustado);
				
				System.out.println(net.toString());
				
			}else if (tipo.equals("036")) {
				
				 String numeroPV = linha.substring(03,12);
				 String numeroDocumento = linha.substring(12,23);
				 String dataLancamento = this.retornaData(linha.substring(23,31));
				 String valorLancamento = linha.substring(31,46);
				 String credito = linha.substring(46,47);
				 String banco = linha.substring(47,50);
				 String agencia = linha.substring(50,56);
				 String contaCorrente = linha.substring(56,67);
				 String numeroRVCorresp = linha.substring(67,76);
				 String dtRVCorresp = this.retornaData(linha.substring(76,84));
				 String valorCreditoOrig = linha.substring(84,99);
				 String dtVencOrig = this.retornaData(linha.substring(99,107));
				 String numeroParcela = linha.substring(107,112);
				 String valorBruto = linha.substring(112,127);
				 String valorTXDesc = linha.substring(127,142);
				 String nPVOriginal = linha.substring(142,151);
				 String bandeira = linha.substring(151,152);
				
				 Antecipacoes objAntec = new Antecipacoes();
				 
				 objAntec.setTipoRegistro(tipo);
				 objAntec.setNumeroPV(numeroPV);
				 objAntec.setNumeroDocumento(numeroDocumento);
				 objAntec.setDataLancamento(dataLancamento);
				 objAntec.setValorLancamento(valorLancamento);
				 objAntec.setCredito(credito);
				 objAntec.setBanco(banco);
				 objAntec.setAgencia(agencia);
				 objAntec.setContaCorrente(contaCorrente);
				 objAntec.setNumeroRVCorresp(numeroRVCorresp);
				 objAntec.setDtRVCorresp(dtRVCorresp);
				 objAntec.setValorCreditoOrig(valorCreditoOrig);
				 objAntec.setDtVencOrig(dtVencOrig);
				 objAntec.setNumeroParcela(numeroParcela);
				 objAntec.setValorBruto(valorBruto);
				 objAntec.setValorTXDesc(valorTXDesc);
				 objAntec.setnPVOriginal(nPVOriginal);
				 objAntec.setBandeira(bandeira);
				 
				System.out.println(objAntec.toString());
			
			}else if(tipo.equals("037")) {
				
				String numeroPV = linha.substring(03,12);
				String banco = linha.substring(12,19);
				String dtCredito = this.retornaData(linha.substring(19,27));
				String totalCredito = linha.substring(27,42);
				String brancos = linha.substring(42,43);
				String nBancos = linha.substring(43,46);
				String nAgencia = linha.substring(46,52);
				String nContaCorrente = linha.substring(52,63);
				String dtGeraArquivo = this.retornaData(linha.substring(63,71));
				String dtCreditoAntec = this.retornaData(linha.substring(71,79));
				String totalCreditosAntecipados = linha.substring(79,94);
				
				TotalizadorCreditos tCreditos = new TotalizadorCreditos();
				
				tCreditos.setTipoRegistro(tipo);
				tCreditos.setNumeroPV(numeroPV);
				tCreditos.setBanco(banco);
				tCreditos.setDtCredito(dtCredito);
				tCreditos.setTotalCredito(totalCredito);
				tCreditos.setBrancos(brancos);
				tCreditos.setnBancos(nBancos);
				tCreditos.setnAgencia(nAgencia);
				tCreditos.setnContaCorrente(nContaCorrente);
				tCreditos.setDtGeraArquivo(dtGeraArquivo);
				tCreditos.setDtCreditoAntec(dtCreditoAntec);
				tCreditos.setTotalCreditosAntecipados(totalCreditosAntecipados);
				
				System.out.println(tCreditos.toString());
				
			}else if (tipo.equals("038")) {
				
				 String nPV = linha.substring(03,12);
				 String nDocumento = linha.substring(12,23);
				 String dtEmissao = this.retornaData(linha.substring(23,31));
				 String valorDebito = linha.substring(31,46);
				 String debito = linha.substring(46,47);
				 String banco = linha.substring(47,50);
				 String agencia = linha.substring(50,56);
				 String contaCorrente = linha.substring(56,67);
				 String nRVOriginal = linha.substring(67,76);
				 String dtRVOrig = this.retornaData(linha.substring(76,84));
				 String valorCredOrig = linha.substring(84,99);
				 String codMotivoDebito = linha.substring(99,101);
				 String nomeMotivoDebito = linha.substring(101,129);
				 String nCartao = linha.substring(129,145);
				 String nRefCarta = linha.substring(145,160);
				 String mesReferencia = linha.substring(160,166);
				 String dtCarta = this.retornaData(linha.substring(166,174));
				 String valorCancelamentoSolicitado = linha.substring(174,189);
				 String nProcesso = linha.substring(189,204);
				 String nPVOriginal = linha.substring(204,213);
				 String dtTransacaoCV = this.retornaData(linha.substring(213,221));
				 String nNSU = linha.substring(221,233);
				 String nResumoDebito = linha.substring(233,242);
				 String dtDebito = this.retornaData(linha.substring(242,250));
				 String valorTransacaoOrig = linha.substring(250,265);
				 String nAutorizacao = linha.substring(265,271);
				 String tipoDebito = linha.substring(271,272);
				 String valorDebitoTotal = linha.substring(272,287);
				 String valorPendente = linha.substring(287,302);
				 String bandeiraRVOrig = linha.substring(300,301);
				 
				 AjustesDebito aDebitos = new AjustesDebito();
				 
				 aDebitos.setTipoRegistro(tipo);
				 aDebitos.setnPV(nPV);
				 aDebitos.setnDocumento(nDocumento);
				 aDebitos.setDtEmissao(dtEmissao);
				 aDebitos.setValorDebito(valorDebito);
				 aDebitos.setDebito(debito);
				 aDebitos.setBanco(banco);
				 aDebitos.setAgencia(agencia);
				 aDebitos.setContaCorrente(contaCorrente);
				 aDebitos.setnRVOriginal(nRVOriginal);
				 aDebitos.setDtRVOrig(dtRVOrig);
				 aDebitos.setValorCredOrig(valorCredOrig);
				 aDebitos.setCodMotivoDebito(codMotivoDebito);
				 aDebitos.setNomeMotivoDebito(nomeMotivoDebito);
				 aDebitos.setnCartao(nCartao);
				 aDebitos.setnRefCarta(nRefCarta);
				 aDebitos.setMesReferencia(mesReferencia);
				 aDebitos.setDtCarta(dtCarta);
				 aDebitos.setValorCancelamentoSolicitado(valorCancelamentoSolicitado);
				 aDebitos.setnProcesso(nProcesso);
				 aDebitos.setnPVOriginal(nPVOriginal);
				 aDebitos.setDtTransacaoCV(dtTransacaoCV);
				 aDebitos.setnNSU(nNSU);
				 aDebitos.setnResumoDebito(nResumoDebito);
				 aDebitos.setDtDebito(dtDebito);
				 aDebitos.setValorTransacaoOrig(valorTransacaoOrig);
				 aDebitos.setnAutorizacao(nAutorizacao);
				 aDebitos.setTipoDebito(tipoDebito);
				 aDebitos.setValorDebitoTotal(valorDebitoTotal);
				 aDebitos.setValorPendente(valorPendente);
				 aDebitos.setBandeiraRVOrig(bandeiraRVOrig);	 
				
				 System.out.println(aDebitos.toString());
				 
			}else if (tipo.equals("040")) {
				
				String nPV = linha.substring(03,12);
				String qtdadeConsulta = linha.substring(12,17);
				String totalConsultas = linha.substring(17,32);
				String inicioPeriodoConsulta = this.retornaData(linha.substring(32,40));
				String fimPeriodoConsulta = this.retornaData(linha.substring(40,48));
				String valorPorConsulta = linha.substring(48,63);
				
				Serasa serasa = new Serasa();
				
				serasa.setTipoRegistro(tipo);
				serasa.setnPV(nPV);
				serasa.setQtdadeConsulta(qtdadeConsulta);
				serasa.setTotalConsultas(totalConsultas);
				serasa.setInicioPeriodoConsulta(inicioPeriodoConsulta);
				serasa.setFimPeriodoConsulta(fimPeriodoConsulta);
				serasa.setValorPorConsulta(valorPorConsulta);
				
				System.out.println(serasa.toString());
				
			}else if (tipo.equals("041")) {
				
				String nPV = linha.substring(03,12);
				String qtdadeConsulta = linha.substring(12,17);
				String totalConsultas = linha.substring(17,32);
				String inicioPeriodoConsulta = this.retornaData(linha.substring(32,40));
				String fimPeriodoConsulta = this.retornaData(linha.substring(40,48));
				String valorPorConsulta = linha.substring(48,63);
				
				AVS AVS = new AVS();
				
				AVS.setTipoRegistro(tipo);
				AVS.setnPV(nPV);
				AVS.setQtdadeConsulta(qtdadeConsulta);
				AVS.setTotalConsultas(totalConsultas);
				AVS.setInicioPeriodoConsulta(inicioPeriodoConsulta);
				AVS.setFimPeriodoConsulta(fimPeriodoConsulta);
				AVS.setValorPorConsulta(valorPorConsulta);
				
				System.out.println(AVS.toString());
				
			}else if (tipo.equals("042")) {
				
				String nPV = linha.substring(03,12);
				String qtdadeConsulta = linha.substring(12,17);
				String totalConsultas = linha.substring(17,32);
				String inicioPeriodoConsulta = this.retornaData(linha.substring(32,40));
				String fimPeriodoConsulta = this.retornaData(linha.substring(40,48));
				String valorPorConsulta = linha.substring(48,63);
				
				Securecode Securecode = new Securecode();
				
				Securecode.setTipoRegistro(tipo);
				Securecode.setnPV(nPV);
				Securecode.setQtdadeConsulta(qtdadeConsulta);
				Securecode.setTotalConsultas(totalConsultas);
				Securecode.setInicioPeriodoConsulta(inicioPeriodoConsulta);
				Securecode.setFimPeriodoConsulta(fimPeriodoConsulta);
				Securecode.setValorPorConsulta(valorPorConsulta);
				
				System.out.println(Securecode.toString());
				
			}else if (tipo.equals("043")) {
				
				String nPV = linha.substring(03,12);
				String numResumoCredito = linha.substring(12,21);
				String numDocumento = linha.substring(21,32);
				String dataEmissao = this.retornaData(linha.substring(32,40));
				String dataCredito = this.retornaData(linha.substring(40,48));
				String valorCredito = linha.substring(48,63);
				String Credito = linha.substring(63,64);
				String Banco = linha.substring(64,67);
				String Agencia = linha.substring(67,73);
				String contaCorrente = linha.substring(73,84);
				String codMotivoDoCredito = linha.substring(84,86);
				String motivoDoCredtio = linha.substring(86,114);
				String Bandeira = linha.substring(114,115);
				
				AjustesCredito AjustesCredito = new AjustesCredito();
				
				AjustesCredito.setnPV(nPV);
				AjustesCredito.setNumResumoCredito(numResumoCredito);
				AjustesCredito.setNumDocumento(numDocumento);
				AjustesCredito.setDataEmissao(dataEmissao);
				AjustesCredito.setDataCredito(dataCredito);
				AjustesCredito.setValorCredito(valorCredito);
				AjustesCredito.setCredito(Credito);
				AjustesCredito.setBanco(Banco);
				AjustesCredito.setAgencia(Agencia);
				AjustesCredito.setContaCorrente(contaCorrente);
				AjustesCredito.setCodMotivoDoCredito(codMotivoDoCredito);
				AjustesCredito.setMotivoDoCredtio(motivoDoCredtio);				
				AjustesCredito.setBandeira(Bandeira);

				System.out.println(AjustesCredito.toString());
				
			}else if (tipo.equals("044")) {
				
				String nPV = linha.substring(03,12);
				String numOrdemDebito = linha.substring(12,23);
				String dataOD = this.retornaData(linha.substring(23,31));
				String valorOD = linha.substring(31,46);
				String codMotivoAjuste = linha.substring(46,48);
				String motivoAjuste = linha.substring(48,76);
				String numCartao = linha.substring(76,92);
				String numNSU = linha.substring(92,104);
				String dataCVoriginal = this.retornaData(linha.substring(104,112));
				String numAutorizacao = linha.substring(112,118);
				String valorTransacaoOriginal = linha.substring(118,133);
				String numRVOriginal = linha.substring(133,142);
				String dataRVOriginal = this.retornaData(linha.substring(142,150));
				String numPVOriginal = linha.substring(150,159);
				String numRefCarta = linha.substring(159,174);
				String dataCarta = this.retornaData(linha.substring(174,182));
				String numProcChargeback = linha.substring(182,197);
				String mesReferencia = linha.substring(197,203);
				String valorCompensado = linha.substring(203,218);
				String dataPagamento = this.retornaData(linha.substring(218,226));
				String valorPendenteDebito = linha.substring(226,241);
				String numProcRetencao = linha.substring(241,256);
				String codMeioCompensacao = linha.substring(256,258);
				String meioCompensacao = linha.substring(258,286);
				
				DebitosPendentes DebitosPendentes = new DebitosPendentes();
				
				DebitosPendentes.setnPV(nPV);
				DebitosPendentes.setNumOrdemDebito(numOrdemDebito);
				DebitosPendentes.setDataOD(dataOD);
				DebitosPendentes.setValorOD(valorOD);
				DebitosPendentes.setCodMotivoAjuste(codMotivoAjuste);
				DebitosPendentes.setMotivoAjuste(motivoAjuste);
				DebitosPendentes.setNumCartao(numCartao);
				DebitosPendentes.setNumNSU(numNSU);
				DebitosPendentes.setDataCVoriginal(dataCVoriginal);
				DebitosPendentes.setNumAutorizacao(numAutorizacao);
				DebitosPendentes.setValorTransacaoOriginal(valorTransacaoOriginal);
				DebitosPendentes.setNumRVOriginal(numRVOriginal);
				DebitosPendentes.setDataRVOriginal(dataRVOriginal);
				DebitosPendentes.setDataRVOriginal(dataRVOriginal);
				DebitosPendentes.setNumPVOriginal(numPVOriginal);
				DebitosPendentes.setNumRefCarta(numRefCarta);
				DebitosPendentes.setDataCarta(dataCarta);
				DebitosPendentes.setNumProcChargeback(numProcChargeback);
				DebitosPendentes.setMesReferencia(mesReferencia);
				DebitosPendentes.setValorCompensado(valorCompensado);
				DebitosPendentes.setDataPagamento(dataPagamento);
				DebitosPendentes.setValorPendenteDebito(valorPendenteDebito);
				DebitosPendentes.setNumProcRetencao(numProcRetencao);
				DebitosPendentes.setCodMeioCompensacao(codMeioCompensacao);
				DebitosPendentes.setMeioCompensacao(meioCompensacao);
				
				System.out.println(DebitosPendentes.toString());
				
			}else if (tipo.equals("045")) {
				
				String nPV = linha.substring(03,12);
				String numOrdemDebito = linha.substring(12,23);
				String dataOD = this.retornaData(linha.substring(23,31));
				String valorOD = linha.substring(31,46);
				String codMotivoAjuste = linha.substring(46,48);
				String motivoAjuste = linha.substring(48,76);
				String numCartao = linha.substring(76,92);
				String numNSU = linha.substring(92,104);
				String dataCVoriginal = this.retornaData(linha.substring(104,112));
				String numAutorizacao = linha.substring(112,118);
				String valorTransacaoOriginal = linha.substring(118,133);
				String numRVOriginal = linha.substring(133,142);
				String dataRVOriginal = this.retornaData(linha.substring(142,150));
				String numPVOriginal = linha.substring(150,159);
				String numRefCarta = linha.substring(159,174);
				String dataCarta = this.retornaData(linha.substring(174,182));
				String numProcChargeback = linha.substring(182,197);
				String mesReferencia = linha.substring(197,203);
				String valorLiquidado = linha.substring(203,218);
				String dataLiquidacao = this.retornaData(linha.substring(218,226));
				String numProcRetencao = linha.substring(226,241);
				String codMeioCompensacao = linha.substring(241,243);
				String meioCompensacao = linha.substring(243,271);
				
				DebitosLiquidados DebitosLiquidados = new DebitosLiquidados();
				
				DebitosLiquidados.setnPV(nPV);
				DebitosLiquidados.setNumOrdemDebito(numOrdemDebito);
				DebitosLiquidados.setDataOD(dataOD);
				DebitosLiquidados.setValorOD(valorOD);
				DebitosLiquidados.setCodMotivoAjuste(codMotivoAjuste);
				DebitosLiquidados.setMotivoAjuste(motivoAjuste);
				DebitosLiquidados.setNumCartao(numCartao);
				DebitosLiquidados.setNumNSU(numNSU);
				DebitosLiquidados.setDataCVoriginal(dataCVoriginal);
				DebitosLiquidados.setNumAutorizacao(numAutorizacao);
				DebitosLiquidados.setValorTransacaoOriginal(valorTransacaoOriginal);
				DebitosLiquidados.setNumRVOriginal(numRVOriginal);
				DebitosLiquidados.setDataRVOriginal(dataRVOriginal);
				DebitosLiquidados.setDataRVOriginal(dataRVOriginal);
				DebitosLiquidados.setNumPVOriginal(numPVOriginal);
				DebitosLiquidados.setNumRefCarta(numRefCarta);
				DebitosLiquidados.setDataCarta(dataCarta);
				DebitosLiquidados.setNumProcChargeback(numProcChargeback);
				DebitosLiquidados.setMesReferencia(mesReferencia);
				DebitosLiquidados.setValorLiquidado(valorLiquidado);
				DebitosLiquidados.setDataLiquidacao(dataLiquidacao);
				DebitosLiquidados.setNumProcRetencao(numProcRetencao);
				DebitosLiquidados.setCodMeioCompensacao(codMeioCompensacao);
				DebitosLiquidados.setMeioCompensacao(meioCompensacao);
				
				System.out.println(DebitosLiquidados.toString());
				
			}else if (tipo.equals("049")) {
				
				String nPV = linha.substring(03,12);
				String numRV = linha.substring(12,21);
				String numReferencia = linha.substring(21,36);
				String dataCredito = this.retornaData(linha.substring(36,44));
				String novoValorParcela = linha.substring(44,59);
				String valorOriginalParcAlterada = linha.substring(59,74);
				String valorAjuste = linha.substring(74,89);
				String dataCancelamento = this.retornaData(linha.substring(89,97));
				String valorRVOriginal = linha.substring(97,112);
				String valorCancelamentoSolicitado = linha.substring(112,127);
				String numCartao = linha.substring(127,143);
				String dataTransacao = this.retornaData(linha.substring(143,151));
				String NSU = linha.substring(151,163);
				String tipoDebito = linha.substring(163,164);
				String numParcela = linha.substring(164,166);
				String bandeiraRVOrigem = linha.substring(166,167);

				DesagendamentoDeParcelas DesagendamentoDeParcelas = new DesagendamentoDeParcelas();
				
				DesagendamentoDeParcelas.setnPV(nPV);
				DesagendamentoDeParcelas.setNumRV(numRV);
				DesagendamentoDeParcelas.setNumReferencia(numReferencia);
				DesagendamentoDeParcelas.setDataCredito(dataCredito);
				DesagendamentoDeParcelas.setNovoValorParcela(novoValorParcela);
				DesagendamentoDeParcelas.setValorOriginalParcAlterada(valorOriginalParcAlterada);
				DesagendamentoDeParcelas.setValorAjuste(valorAjuste);
				DesagendamentoDeParcelas.setDataCancelamento(dataCancelamento);
				DesagendamentoDeParcelas.setValorRVOriginal(valorRVOriginal);
				DesagendamentoDeParcelas.setValorCancelamentoSolicitado(valorCancelamentoSolicitado);
				DesagendamentoDeParcelas.setNumCartao(numCartao);
				DesagendamentoDeParcelas.setDataTransacao(dataTransacao);
				DesagendamentoDeParcelas.setNSU(NSU);
				DesagendamentoDeParcelas.setTipoDebito(tipoDebito);
				DesagendamentoDeParcelas.setNumParcela(numParcela);
				DesagendamentoDeParcelas.setBandeiraRVOrigem(bandeiraRVOrigem);
				
				System.out.println(DesagendamentoDeParcelas.toString());
				
			}else if (tipo.equals("050")) {
				
				String nPV = linha.substring(03,12);
				String qtdTotalResumosMatriz = linha.substring(12,18);
				String valorTotalCredNormais = linha.substring(18,33);
				String qtdCreditosAntecipados = linha.substring(33,39);
				String valorTotalAntecipado = linha.substring(39,54);
				String qtdAjustesCredito = linha.substring(54,58);
				String valorTotalAjustesCredito = linha.substring(58,73);
				String qtdAjustesDebito = linha.substring(73,79);
				String valorTotalAjustesDebito = linha.substring(79,94);

				Totalizador Totalizador = new Totalizador();
				
				Totalizador.setnPV(nPV);
				Totalizador.setQtdTotalResumosMatriz(qtdTotalResumosMatriz);
				Totalizador.setValorTotalCredNormais(valorTotalCredNormais);
				Totalizador.setQtdCreditosAntecipados(qtdCreditosAntecipados);
				Totalizador.setValorTotalAntecipado(valorTotalAntecipado);
				Totalizador.setQtdAjustesCredito(qtdAjustesCredito);
				Totalizador.setValorTotalAjustesCredito(valorTotalAjustesCredito);
				Totalizador.setQtdAjustesDebito(qtdAjustesDebito);
				Totalizador.setValorTotalAjustesDebito(valorTotalAjustesDebito);

				System.out.println(Totalizador.toString());
		
			}else if (tipo.equals("052")){

				 String qtdadeMatrizesArq = linha.substring(03,07);
				 String qtdadeRegistroArq = linha.substring(07,13);
				 String nPVGrupo = linha.substring(13,22);
				 String qtdadeTotResumoGrupo = linha.substring(22,26);
				 String valorTotCreditos = linha.substring(26,41);
				 String qtdadeCreditoAntec = linha.substring(41,47);
				 String valorTotAntec = linha.substring(47,62);
				 String qtdadeAjusteCredito = linha.substring(62,66);
				 String valorTotAjusteCredito = linha.substring(66,81);
				 String qtdadeAjusteDebito = linha.substring(81,85);
				 String valorTotAjusteDebito = linha.substring(85,100);
				 
				 TraillerArquivo trailler = new TraillerArquivo();
				 
				 trailler.setTipoRegistro(tipo);
				 trailler.setQtdadeMatrizesArq(qtdadeMatrizesArq);
				 trailler.setQtdadeRegistroArq(qtdadeRegistroArq);
				 trailler.setnPVGrupo(nPVGrupo);
				 trailler.setQtdadeTotResumoGrupo(qtdadeTotResumoGrupo);
				 trailler.setValorTotCreditos(valorTotCreditos);
				 trailler.setQtdadeCreditoAntec(qtdadeCreditoAntec);
				 trailler.setValorTotAntec(valorTotAntec);
				 trailler.setQtdadeAjusteCredito(qtdadeAjusteCredito);
				 trailler.setValorTotAjusteCredito(valorTotAjusteCredito);
				 trailler.setQtdadeAjusteDebito(qtdadeAjusteDebito);
				 trailler.setValorTotAjusteDebito(valorTotAjusteDebito);
				 
				 System.out.println(trailler.toString());
				 
			}
			
		}
		fr.close();
		bf.close();
		
	}
	
	public String retornaData(String data) {
		String dia = data.substring(0,2);
		String mes = data.substring(2, 4);
		String ano = data.substring(4, 8);
		String mdata = dia + "/"+ mes + "/" + ano;
		return mdata;
	}
	
}
