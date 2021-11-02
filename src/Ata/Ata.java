package Ata;

public class Ata {
	private String tituloReuniao;
	private int dataEmissao;
	private String participantes;
	private int inicio;
	private int termino;
	private String pauta;
	private String setorOrganizacao;
	private String palavraChave;
	private String nomeConvidado;
	private String emailConvidado;
	private String empresaConvidado;
	
	public String getTituloReuniao() {
		return tituloReuniao;
	}
	public void setTituloReuniao(String tituloReuniao) {
		this.tituloReuniao = tituloReuniao;
	}
	public int getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(int dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getParticipantes() {
		return participantes;
	}
	public void setParticipantes(String participantes) {
		this.participantes = participantes;
	}
	public int getInicio() {
		return inicio;
	}
	public void setInicio(int inicio) {
		this.inicio = inicio;
	}
	public int getTermino() {
		return termino;
	}
	public void setTermino(int termino) {
		this.termino = termino;
	}
	public String getPauta() {
		return pauta;
	}
	public void setPauta(String pauta) {
		this.pauta = pauta;
	}
	public String getSetorOrganizacao() {
		return setorOrganizacao;
	}
	public void setSetorOrganizacao(String setorOrganizacao) {
		this.setorOrganizacao = setorOrganizacao;
	}
	public String getPalavraChave() {
		return palavraChave;
	}
	public void setPalavraChave(String palavraChave) {
		this.palavraChave = palavraChave;
	}
	public String getNomeConvidado() {
		return nomeConvidado;
	}
	public void setNomeConvidado(String nomeConvidado) {
		this.nomeConvidado = nomeConvidado;
	}
	public String getEmailConvidado() {
		return emailConvidado;
	}
	public void setEmailConvidado(String emailConvidado) {
		this.emailConvidado = emailConvidado;
	}
	public String getEmpresaConvidado() {
		return empresaConvidado;
	}
	public void setEmpresaConvidado(String empresaConvidado) {
		this.empresaConvidado = empresaConvidado;
	}
	
	
	
	public String toString() {
		return "Ata [tituloReuniao=" + tituloReuniao + ", dataEmissao=" + dataEmissao + ", participantes="
				+ participantes + ", inicio=" + inicio + ", termino=" + termino + ", pauta=" + pauta
				+ ", setorOrganizacao=" + setorOrganizacao + ", palavraChave=" + palavraChave + "]";
	}
	
	//construtor sem dados dos convidados
	public Ata(String tituloReuniao, int dataEmissao, String participantes, int inicio, int termino, String pauta,
			String setorOrganizacao, String palavraChave) {
		this.tituloReuniao = tituloReuniao;
		this.dataEmissao = dataEmissao;
		this.participantes = participantes;
		this.inicio = inicio;
		this.termino = termino;
		this.pauta = pauta;
		this.setorOrganizacao = setorOrganizacao;
		this.palavraChave = palavraChave;
	}
	//construtor só com dado dos convidados(sobrecarga)
	public Ata(String nomeConvidado, String emailConvidado,String empresaConvidado) {
		this.nomeConvidado = nomeConvidado;
		this.emailConvidado = emailConvidado;
		this.empresaConvidado = empresaConvidado;
	}
	
	// para pegar os dados do convidado da ata
	public String getConvidado() {
		return "[ nomeConvidado=" + nomeConvidado + ", emailConvidado=" + emailConvidado + ", empresaConvidado=" + empresaConvidado + "]";
	}
	
	// funcao para verificar se há pelo menos dois participantes
	public boolean minimoPessoas(int participantes) {
		if(participantes >= 2) {
			return true;
		}
		else {
			return false;
		}
	}
	//funcao para retornar qual estado a ata se encontra
	public String estadoAta(int estado ) {
		if(estado == 1) {
			return tituloReuniao + "Em emissao";
		}
		
		else if(estado == 2) {
			return tituloReuniao + "Em revisao";
		}
		else if (estado == 3) {
			return tituloReuniao + "Em conclusao";
		}
		else if(estado == 4) {
			return tituloReuniao + "Concluido";
		}
		else {
			return "Ata nao encontrada";
		}
		
	}
	//funcao para definir a ata
	public int classificacaoAta(int classificacao) {
		if(classificacao == 1) {
			return 1; // 1 =  ata em estado privado
		}
		else {
			return 0; // ata em estado publico
		}
	}
	

	
	

}
